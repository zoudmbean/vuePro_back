package com.zoudm.pro.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zoudm.pro.bean.Comment;

@RestController
@RequestMapping("/api")
public class CommentController {
	
	@RequestMapping(value="/getcomments/{artid}",method=RequestMethod.GET)
	public Map<String,Object> getComments(HttpServletResponse res,@PathVariable(value="artid") Integer artid,Integer pageindex){
		res.setHeader("Access-Control-Allow-Origin", "*");
		// 定义返回数据格式
		Map<String,Object> rtnMap = new HashMap<String, Object>();
		rtnMap.put("status", 0);  // 状态：0 表示成功  1 表示失败
		List<Comment> allComments = new ArrayList<Comment>();
		// 定义评论数据
		for(int i = 0 ; i < 100 ; i++){
			if(i%5 == 0){
				allComments.add(new Comment(i,artid,"张三"+i, "2018-08-24 23:22:10", "undefined"));
			}else{
				allComments.add(new Comment(i,artid,"张三"+i, "2018-08-24 23:22:10", artid + "_评论"+i));
			}
		}
		int maxPage = 0;
		if(allComments.size()%10 == 0){
			maxPage = allComments.size()/10;
		}else{
			maxPage = allComments.size()/10 + 1;
		}
		// 模拟分页
		// rtnMap.put("message", allComments.subList(pageindex, 10*pageindex<=allComments.size()?10*pageindex:allComments.size()));
		rtnMap.put("message", allComments.subList((((pageindex-1)<=maxPage?(pageindex-1):maxPage))*10, 10*pageindex<allComments.size()?10*pageindex:allComments.size()));
		
		return rtnMap;
	}
	
}
