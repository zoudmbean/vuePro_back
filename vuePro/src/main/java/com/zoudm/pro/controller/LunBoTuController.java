package com.zoudm.pro.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LunBoTuController {
	
	@RequestMapping(value="/getlunbotu",method=RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> getLunBoTuData(HttpServletResponse res){
		res.setHeader("Access-Control-Allow-Origin", "*");
		Map<String,Object> map = new HashMap<String,Object>();
		
		// 创建图片数据
		Map<String,String> urlAndimg1 = new HashMap<String,String>();
		Map<String,String> urlAndimg2 = new HashMap<String,String>();
		Map<String,String> urlAndimg3 = new HashMap<String,String>();
		List lists = new ArrayList<>();
		
		// 添加数据
		urlAndimg1.put("img","http://pic29.nipic.com/20130509/11388206_171815532171_2.jpg");
		urlAndimg1.put("url","http://www.baidu.com1");
		lists.add(urlAndimg1);
		
		urlAndimg2.put("img","http://pic.rmb.bdstatic.com/6605e072c001995378143e3de10513f8.jpeg");
		urlAndimg2.put("url","http://www.baidu.com2");
		lists.add(urlAndimg2);
		
		urlAndimg3.put("img","http://img1.gtimg.com/9/951/95168/9516835_1200x1000_0.jpg");
		urlAndimg3.put("url","http://www.baidu.com3");
		lists.add(urlAndimg3);
		
		map.put("status", 0);
		map.put("message", lists);
		return map;
	}
	
}
