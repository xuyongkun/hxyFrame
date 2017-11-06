/**
 * 初始化菜单
 */
var ztree;
var setting = {
    data: {
        simpleData: {
            enable: true,
            idKey: "id",
            pIdKey: "parentId",
            rootPId: -1
        },
        key: {
            url:"nourl"
        }
    },
    check:{
        enable:true,
        nocheckInherit:true
    }
};
function initTree() {
    //加载菜单树
    $.get("../sys/organ/organTree", function(r){
        ztree = $.fn.zTree.init($("#organTree"), setting, r.organTree);
        //展开所有节点
        // ztree.expandAll(true);
    });
}


$(function () {
    initTree();
    $("#jqGrid").jqGrid({
        url: '../hr/person/list',
        datatype: "json",
        colModel: [
            { label: 'id', name: 'id', index: 'id', width: 50, key: true },
            { label: '', name: 'bapid', index: 'bapid', width: 80 },
            { label: '', name: 'hrNo', index: 'hr_no', width: 80 },
            { label: '', name: 'hrName', index: 'hr_name', width: 80 },
            { label: '', name: 'createTime', index: 'create_time', width: 80 },
            { label: '', name: 'updateTime', index: 'update_time', width: 80 },
            { label: '', name: 'status', index: 'status', width: 80 },
            { label: '', name: 'phone', index: 'phone', width: 80 },
            { label: '', name: 'photo', index: 'photo', width: 80 },
        ],
        viewrecords: true,
        height: 385,
        rowNum: 10,
        rowList : [10,30,50],
        rownumbers: true,
        rownumWidth: 25,
        autowidth:true,
        multiselect: true,
        pager: "#jqGridPager",
        jsonReader : {
            root: "page.list",
            page: "page.currPage",
            total: "page.totalPage",
            records: "page.totalCount"
        },
        prmNames : {
            page:"page",
            rows:"limit",
            order: "order"
        },
        gridComplete:function(){
            //隐藏grid底部滚动条
            $("#jqGrid").closest(".ui-jqgrid-bdiv").css({ "overflow-x" : "hidden" });
        }
    });
});



var vm = new Vue({
	el:'#rrapp',
	data:{
		showList: true,
		title: null,
		person: {}
	},
	methods: {
		query: function () {
			vm.reload();
		},
		add: function(){
			vm.showList = false;
			vm.title = "新增";
			vm.person = {};
		},
		update: function (event) {
			var id = getSelectedRow();
			if(id == null){
				return ;
			}
			vm.showList = false;
            vm.title = "修改";
            
            vm.getInfo(id)
		},
		saveOrUpdate: function (event) {
			var url = vm.person.id == null ? "../hr/person/save" : "../hr/person/update";
			$.ajax({
				type: "POST",
			    url: url,
			    data: JSON.stringify(vm.person),
			    success: function(r){
			    	if(r.code === 0){
						alert(r, function(index){
							vm.reload();
						});
					}else{
						alert(r.msg);
					}
				}
			});
		},
		del: function (event) {
			var ids = getSelectedRows();
			if(ids == null){
				return ;
			}
			
			confirm('确定要删除选中的记录？', function(){
				$.ajax({
					type: "POST",
				    url: "../person/delete",
				    data: JSON.stringify(ids),
				    success: function(r){
						if(r.code == 0){
							alert(r, function(index){
								$("#jqGrid").trigger("reloadGrid");
							});
						}else{
							alert(r.msg);
						}
					}
				});
			});
		},
		getInfo: function(id){
			$.get("../person/info/"+id, function(r){
                vm.person = r.person;
            });
		},
		reload: function (event) {
			vm.showList = true;
			var page = $("#jqGrid").jqGrid('getGridParam','page');
			$("#jqGrid").jqGrid('setGridParam',{ 
                page:page
            }).trigger("reloadGrid");
		}
	}
});