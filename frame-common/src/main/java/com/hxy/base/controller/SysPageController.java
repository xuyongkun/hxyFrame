package com.hxy.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统页面视图
 * 
 * @author hxy
 * @date 2017年3月24日 下午11:05:27
 */
@Controller
public class SysPageController {
	
	@RequestMapping("sys/{url}.html")
	public String page(@PathVariable("url") String url){
		return "sys/" + url + ".html";
	}

	/**
	 * 人事系统页面
	 * @param url
	 * @return
	 */
	@RequestMapping("hr/{url}.html")
	public String hrPage(@PathVariable("url") String url) {
		return "hr/" + url + ".html";
	}

	@RequestMapping("generator/{url}.html")
	public String generator(@PathVariable("url") String url){
		return "generator/" + url + ".html";
	}
}
