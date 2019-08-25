package com.zoudm.pro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBoot {
	
	@RequestMapping("/hello")
	@ResponseBody
	public List<String> hello(){
		List<String> list = new ArrayList<>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		list.add("赵六");
		list.add("钱七");
		list.add("王八");
		return list;
	}

}
