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

import com.zoudm.pro.bean.BaseNews;
import com.zoudm.pro.bean.NewsInfo;

@RestController
@RequestMapping("/api")
public class NewsController {
	
	@RequestMapping(value="/getnew/{id}",method=RequestMethod.GET)
	public Map<String,Object> getNewsInfo(HttpServletResponse res,@PathVariable(value="id") Integer id){
		res.setHeader("Access-Control-Allow-Origin", "*");
		// 定义返回数据格式
		Map<String,Object> rtnMap = new HashMap<String, Object>();
		rtnMap.put("status", 0);  // 状态：0 表示成功  1 表示失败
		
		/*
		 * 定义返回的数据
		 * */
		if(1001==id || 1004 == id || 1007 == id){
			String content = "瑞安航空资料图（图：《每日邮报》）　　海外网5月11日电 又现空中惊魂！近日，一名爱尔兰瑞安航空的男乘客在机上闹事，还扬言要\\“杀死所有人\\”。"
							+ "据《每日邮报》11日报道，该架飞机从曼彻斯特飞往大加那利岛，事发当天（5月4日），这名男子在飞行过程中，多次试图打开飞机舱门，最终被其他乘客制服。"
							+ "从机上乘客拍摄的画面来看，男子被众人压倒在地时，大声呼喊，甚至扬言\\“杀掉所有乘客，别以为我在开玩笑\\”。在此之前，他还曾威胁要用灭火器袭击一名女性机组人员。";
			rtnMap.put("message", new NewsInfo(id,"追星当有底线，国耻岂是追星的\\“梗\\”！",1024,"2019-08-24 08:24",content));
		}else{
			String content = "测试数据";
			rtnMap.put("message", new NewsInfo(id,"新闻测试",23,"2019-08-24 08:24",content));
		}
		
		return rtnMap;
	}
	
	@RequestMapping(value="/getnewslist",method=RequestMethod.GET)
	public Map<String,Object> getNewsList(HttpServletResponse res){
		res.setHeader("Access-Control-Allow-Origin", "*");
		// 定义返回数据格式
		Map<String,Object> rtnMap = new HashMap<String, Object>();
		rtnMap.put("status", 0);  // 状态：0 表示成功  1 表示失败
		
		// 创建返回的数据
		List<BaseNews> baseNewsList = new ArrayList<>();
		baseNewsList.add(new BaseNews(1001, "追星当有底线，国耻岂是追星的“梗”！", "2019-08-24 08:24", "新华视点", 1024, "http://localhost:3000/src/images/news/cbd.jpg"));
		baseNewsList.add(new BaseNews(1002, "澳大利亚一个州将停止汉语教学 中国外交部四个“不”回应", "2019-08-24 08:31", "央视网新闻", 10024, "http://localhost:3000/src/images/news/yuantiao.jpg"));
		baseNewsList.add(new BaseNews(1003, "有心了！球迷编字帖帮艾克森练习写名字", "2019-08-24 08:52", "赛点", 21, "http://localhost:3000/src/images/news/shuijiao.jpg"));
		baseNewsList.add(new BaseNews(1004, "追星当有底线，国耻岂是追星的“梗”！", "2019-08-24 08:24", "新华视点", 1024, "http://localhost:3000/src/images/news/cbd.jpg"));
		baseNewsList.add(new BaseNews(1005, "澳大利亚一个州将停止汉语教学 中国外交部四个“不”回应", "2019-08-24 08:31", "央视网新闻", 10024, "http://localhost:3000/src/images/news/yuantiao.jpg"));
		baseNewsList.add(new BaseNews(1006, "有心了！球迷编字帖帮艾克森练习写名字", "2019-08-24 08:52", "赛点", 21, "http://localhost:3000/src/images/news/shuijiao.jpg"));
		baseNewsList.add(new BaseNews(1007, "追星当有底线，国耻岂是追星的“梗”！", "2019-08-24 08:24", "新华视点", 1024, "http://localhost:3000/src/images/news/cbd.jpg"));
		baseNewsList.add(new BaseNews(1008, "澳大利亚一个州将停止汉语教学 中国外交部四个“不”回应", "2019-08-24 08:31", "央视网新闻", 10024, "http://localhost:3000/src/images/news/yuantiao.jpg"));
		baseNewsList.add(new BaseNews(1009, "有心了！球迷编字帖帮艾克森练习写名字", "2019-08-24 08:52", "赛点", 21, "http://localhost:3000/src/images/news/shuijiao.jpg"));
		baseNewsList.add(new BaseNews(1010, "追星当有底线，国耻岂是追星的“梗”！", "2019-08-24 08:24", "新华视点", 1024, "http://localhost:3000/src/images/news/cbd.jpg"));
		baseNewsList.add(new BaseNews(1011, "澳大利亚一个州将停止汉语教学 中国外交部四个“不”回应", "2019-08-24 08:31", "央视网新闻", 10024, "http://localhost:3000/src/images/news/yuantiao.jpg"));
		baseNewsList.add(new BaseNews(1012, "有心了！球迷编字帖帮艾克森练习写名字", "2019-08-24 08:52", "赛点", 21, "http://localhost:3000/src/images/news/shuijiao.jpg"));
		baseNewsList.add(new BaseNews(1013, "追星当有底线，国耻岂是追星的“梗”！", "2019-08-24 08:24", "新华视点", 1024, "http://localhost:3000/src/images/news/cbd.jpg"));
		baseNewsList.add(new BaseNews(1014, "澳大利亚一个州将停止汉语教学 中国外交部四个“不”回应", "2019-08-24 08:31", "央视网新闻", 10024, "http://localhost:3000/src/images/news/yuantiao.jpg"));
		baseNewsList.add(new BaseNews(1015, "有心了！球迷编字帖帮艾克森练习写名字", "2019-08-24 08:52", "赛点", 21, "http://localhost:3000/src/images/news/shuijiao.jpg"));
		baseNewsList.add(new BaseNews(1016, "追星当有底线，国耻岂是追星的“梗”！", "2019-08-24 08:24", "新华视点", 1024, "http://localhost:3000/src/images/news/cbd.jpg"));
		baseNewsList.add(new BaseNews(1017, "澳大利亚一个州将停止汉语教学 中国外交部四个“不”回应", "2019-08-24 08:31", "央视网新闻", 10024, "http://localhost:3000/src/images/news/yuantiao.jpg"));
		baseNewsList.add(new BaseNews(1018, "有心了！球迷编字帖帮艾克森练习写名字", "2019-08-24 08:52", "赛点", 21, "http://localhost:3000/src/images/news/shuijiao.jpg"));
		baseNewsList.add(new BaseNews(1019, "追星当有底线，国耻岂是追星的“梗”！", "2019-08-24 08:24", "新华视点", 1024, "http://localhost:3000/src/images/news/cbd.jpg"));
		baseNewsList.add(new BaseNews(1020, "澳大利亚一个州将停止汉语教学 中国外交部四个“不”回应", "2019-08-24 08:31", "央视网新闻", 10024, "http://localhost:3000/src/images/news/yuantiao.jpg"));
		baseNewsList.add(new BaseNews(1021, "有心了！球迷编字帖帮艾克森练习写名字", "2019-08-24 08:52", "赛点", 21, "http://localhost:3000/src/images/news/shuijiao.jpg"));
		baseNewsList.add(new BaseNews(1022, "追星当有底线，国耻岂是追星的“梗”！", "2019-08-24 08:24", "新华视点", 1024, "http://localhost:3000/src/images/news/cbd.jpg"));
		baseNewsList.add(new BaseNews(1023, "澳大利亚一个州将停止汉语教学 中国外交部四个“不”回应", "2019-08-24 08:31", "央视网新闻", 10024, "http://localhost:3000/src/images/news/yuantiao.jpg"));
		baseNewsList.add(new BaseNews(1024, "有心了！球迷编字帖帮艾克森练习写名字", "2019-08-24 08:52", "赛点", 21, "http://localhost:3000/src/images/news/shuijiao.jpg"));
		baseNewsList.add(new BaseNews(1025, "追星当有底线，国耻岂是追星的“梗”！", "2019-08-24 08:24", "新华视点", 1024, "http://localhost:3000/src/images/news/cbd.jpg"));
		baseNewsList.add(new BaseNews(1026, "澳大利亚一个州将停止汉语教学 中国外交部四个“不”回应", "2019-08-24 08:31", "央视网新闻", 10024, "http://localhost:3000/src/images/news/yuantiao.jpg"));
		baseNewsList.add(new BaseNews(1027, "有心了！球迷编字帖帮艾克森练习写名字", "2019-08-24 08:52", "赛点", 21, "http://localhost:3000/src/images/news/shuijiao.jpg"));
		baseNewsList.add(new BaseNews(1028, "追星当有底线，国耻岂是追星的“梗”！", "2019-08-24 08:24", "新华视点", 1024, "http://localhost:3000/src/images/news/cbd.jpg"));
		baseNewsList.add(new BaseNews(1029, "澳大利亚一个州将停止汉语教学 中国外交部四个“不”回应", "2019-08-24 08:31", "央视网新闻", 10024, "http://localhost:3000/src/images/news/yuantiao.jpg"));
		baseNewsList.add(new BaseNews(1030, "有心了！球迷编字帖帮艾克森练习写名字", "2019-08-24 08:52", "赛点", 21, "http://localhost:3000/src/images/news/shuijiao.jpg"));
		baseNewsList.add(new BaseNews(1031, "追星当有底线，国耻岂是追星的“梗”！", "2019-08-24 08:24", "新华视点", 1024, "http://localhost:3000/src/images/news/cbd.jpg"));
		baseNewsList.add(new BaseNews(1032, "澳大利亚一个州将停止汉语教学 中国外交部四个“不”回应", "2019-08-24 08:31", "央视网新闻", 10024, "http://localhost:3000/src/images/news/yuantiao.jpg"));
		baseNewsList.add(new BaseNews(1033, "有心了！球迷编字帖帮艾克森练习写名字", "2019-08-24 08:52", "赛点", 21, "http://localhost:3000/src/images/news/shuijiao.jpg"));
		rtnMap.put("message", baseNewsList);
		return rtnMap;
	}
	
}
