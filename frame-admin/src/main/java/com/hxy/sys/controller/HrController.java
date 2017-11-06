package com.hxy.sys.controller;

import com.hxy.base.utils.Result;
import com.hxy.sys.entity.OrganEntity;
import com.hxy.sys.service.OrganService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 人事系统
 * Created by kenny on 2017/10/22.
 */
public class HrController extends BaseController{

    @Autowired
    private OrganService organService;

    /**
     * 查询组织机构树
     * @return
     */
    @RequestMapping(value = "/organTree")
    @RequiresPermissions("sys:organ:all")
    public Result codeTree(){
        List<OrganEntity> organEntities = organService.queryListByBean(new OrganEntity());
        return Result.ok().put("organTree", organEntities);
    }
}
