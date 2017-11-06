package com.hxy.hr.controller;

import java.util.List;
import java.util.Map;

import com.hxy.base.annotation.SysLog;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hxy.hr.entity.PersonEntity;
import com.hxy.hr.service.PersonService;
import com.hxy.base.utils.PageUtils;
import com.hxy.base.utils.Query;
import com.hxy.base.utils.Result;
import  com.hxy.sys.controller.BaseController;


/**
 * 人事表
 * 
 * @author kenny
 * @email xuyongkun22@163.com
 * @date 2017-10-26 14:48:12
 */
@RestController
@RequestMapping("/hr/person")
public class PersonController extends BaseController{
	@Autowired
	private PersonService personService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("sys:organ:all")
	public Result list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<PersonEntity> personList = personService.queryList(query);
		int total = personService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(personList, total, query.getLimit(), query.getPage());
		
		return Result.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("hr:person:info")
	public Result info(@PathVariable("id") String id){
		PersonEntity person = personService.queryObject(id);
		
		return Result.ok().put("person", person);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("hr:person:save")
	public Result save(@RequestBody PersonEntity person){
		personService.save(person);
		
		return Result.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("hr:person:update")
	public Result update(@RequestBody PersonEntity person){
		personService.update(person);
		
		return Result.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("hr:person:delete")
	public Result delete(@RequestBody String[] ids){
		personService.deleteBatch(ids);
		
		return Result.ok();
	}
	
}
