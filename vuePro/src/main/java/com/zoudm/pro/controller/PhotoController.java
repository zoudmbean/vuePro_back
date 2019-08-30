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

import com.zoudm.pro.bean.ImgBean;
import com.zoudm.pro.bean.ImgInfoBean;

@RestController
@RequestMapping("/api")
public class PhotoController {
	
	@RequestMapping(value="/getimageInfo/{id}")
	public Map<String,Object> getImageInfo(HttpServletResponse res,@PathVariable(value="id") Integer id){
		res.setHeader("Access-Control-Allow-Origin", "*");
		// 定义返回map对象
		Map<String,Object> rtnMap = new HashMap<String,Object>();
		rtnMap.put("status", "0");
		
		/*
		 * cateid = 14	家居生活
		 * 
		 * */
		if(1 == id){
			rtnMap.put("message", getImgsInfo14(id));
		} 
		
		return rtnMap;
	}
	
	@RequestMapping(value="/getimages/{cateid}")
	public Map<String,Object> getImages(HttpServletResponse res,@PathVariable(value="cateid") Integer cateid ){
		res.setHeader("Access-Control-Allow-Origin", "*");
		// 定义返回map对象
		Map<String,Object> rtnMap = new HashMap<String,Object>();
		rtnMap.put("status", "0");
		
		/*
		 * cateid = 14	家居生活
		 * 
		 * */
		if(14 == cateid){
			rtnMap.put("message", getImgsCateId14());
		} 
		
		/*
		 * cateid = 15 摄影设计
		 * 
		 * */
		if( 15 == cateid ){
			rtnMap.put("message", getImgsCateId15());
		}
		
		/*
		 * cateid = 16 明星写真
		 * 
		 * */
		if( 16 == cateid ){
			rtnMap.put("message", getImgsCateId16());
		}
		
		if(0 == cateid){
			List l1 = getImgsCateId14();
			List l2 = getImgsCateId15();
			List l3 = getImgsCateId16();
			l1.addAll(l2);
			l1.addAll(l3);
			System.out.println(l1.toString());
			rtnMap.put("message", l1);
		}
		
		return rtnMap;
	}
	
	@RequestMapping(value = "/getimgcategory",method=RequestMethod.GET)
	public Map<String,Object> getImgCategory(HttpServletResponse res){
		res.setHeader("Access-Control-Allow-Origin", "*");
		// 定义返回map对象
		Map<String,Object> rtnMap = new HashMap<String,Object>();
		rtnMap.put("status", "0");
		List<Map<String,Object>> lists = new ArrayList<Map<String,Object>>();
		Map<String,Object> m = new HashMap<String,Object>();
		m.put("id", 14);
		m.put("title", "家居生活");
		lists.add(m);
		
		Map<String,Object> m1 = new HashMap<String,Object>();
		m1.put("id", 15);
		m1.put("title", "摄影设计");
		lists.add(m1);
		
		Map<String,Object> m2 = new HashMap<String,Object>();
		m2.put("id", 16);
		m2.put("title", "明星美女");
		lists.add(m2);
		
		Map<String,Object> m3 = new HashMap<String,Object>();
		m3.put("id", 17);
		m3.put("title", "摄影器材");
		lists.add(m3);
		
		Map<String,Object> m4 = new HashMap<String,Object>();
		m4.put("id", 18);
		m4.put("title", "明星写真");
		lists.add(m4);
		
		Map<String,Object> m5 = new HashMap<String,Object>();
		m5.put("id", 19);
		m5.put("title", "清纯甜美");
		lists.add(m5);
		
		Map<String,Object> m6 = new HashMap<String,Object>();
		m6.put("id", 20);
		m6.put("title", "古典美女");
		lists.add(m6);
		
		rtnMap.put("message", lists);
		return rtnMap;
	}
	
	private List<ImgBean> getImgsCateId14(){
		List<ImgBean> lists = new ArrayList<ImgBean>();
		
		lists.add(new ImgBean(1, "家居生活1", "http://src.house.sina.com.cn/imp/imp/deal/c3/39/6/832f5bd08b18c600f36ed393e88_p1_mk1.jpg", "新浪家居1"));
		lists.add(new ImgBean(2, "家居生活2", "http://pic33.nipic.com/20130925/12993780_151510133113_2.jpg", "新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2新浪家居2"));
		lists.add(new ImgBean(3, "家居生活3", "http://src.house.sina.com.cn/imp/imp/deal/c3/39/6/832f5bd08b18c600f36ed393e88_p1_mk1.jpg", "新浪家居3"));
		lists.add(new ImgBean(4, "家居生活4", "http://src.house.sina.com.cn/imp/imp/deal/c3/39/6/832f5bd08b18c600f36ed393e88_p1_mk1.jpg", "新浪家4"));
		lists.add(new ImgBean(5, "家居生活5", "http://pic33.nipic.com/20130925/12993780_151510133113_2.jpg", "新浪家居5"));
		lists.add(new ImgBean(6, "家居生活6", "http://pic33.nipic.com/20130925/12993780_151510133113_2.jpg", "新浪家居6"));
		lists.add(new ImgBean(7, "家居生活7", "http://src.house.sina.com.cn/imp/imp/deal/c3/39/6/832f5bd08b18c600f36ed393e88_p1_mk1.jpg", "新浪家居7"));
		lists.add(new ImgBean(8, "家居生活8", "http://src.house.sina.com.cn/imp/imp/deal/c3/39/6/832f5bd08b18c600f36ed393e88_p1_mk1.jpg", "新浪家居8"));

		return lists;
	}
	
	private List<ImgBean> getImgsCateId15(){
		List<ImgBean> lists = new ArrayList<ImgBean>();
		
		lists.add(new ImgBean(9, "摄影设计1", "http://img.redocn.com/sheji/20150917/heisejianjiesheyinghuodonghaibaosheji_4986020.jpg", "摄影设计1"));
		lists.add(new ImgBean(10, "摄影设计2", "http://img.redocn.com/sheji/20150917/heisejianjiesheyinghuodonghaibaosheji_4986020.jpg", "摄影设计2"));
		lists.add(new ImgBean(11, "摄影设计3", "http://img.redocn.com/shejigao/20111105/20111101_d8bd9069fae092bb20bbdfqZWtRdUOLp.jpg", "摄影设计3"));
		lists.add(new ImgBean(12, "摄影设计4", "http://img.redocn.com/sheji/20150917/heisejianjiesheyinghuodonghaibaosheji_4986020.jpg", "摄影设计4"));
		lists.add(new ImgBean(13, "摄影设计5", "http://img.redocn.com/sheji/20150917/heisejianjiesheyinghuodonghaibaosheji_4986020.jpg", "摄影设计5"));
		lists.add(new ImgBean(14, "摄影设计6", "http://img.redocn.com/shejigao/20111105/20111101_d8bd9069fae092bb20bbdfqZWtRdUOLp.jpg", "摄影设计6"));
		lists.add(new ImgBean(15, "摄影设计7", "http://img.redocn.com/sheji/20150917/heisejianjiesheyinghuodonghaibaosheji_4986020.jpg", "摄影设计7"));
		lists.add(new ImgBean(16, "摄影设计8", "http://img.redocn.com/shejigao/20111105/20111101_d8bd9069fae092bb20bbdfqZWtRdUOLp.jpg", "摄影设计8"));
		
		return lists;
	}
	
	
	/**明星美女
	 * @return
	 */
	private List<ImgBean> getImgsCateId16(){
		List<ImgBean> lists = new ArrayList<ImgBean>();
		
		lists.add(new ImgBean(17, "明星写真1", "http://www.xnnews.com.cn/wenyu/lxsj/201703/W020170301797348267162.jpg", "刘亦菲1"));
		lists.add(new ImgBean(18, "明星写真2", "http://p0.ifengimg.com/cmpp/2017/02/17/08/5a22f858-c79c-4ac8-a00e-a7b23e6d6362_size30_w447_h481.jpg", "刘亦菲2"));
		lists.add(new ImgBean(19, "明星写真3", "http://img.tupianzj.com/uploads/allimg/140314/1-140314141633.jpg", "刘亦菲3"));

		return lists;
	}
	
	private ImgInfoBean getImgsInfo14(Integer id){
		String content = "怎样才能充分利用空间呢？" 
						+ " <br> 不用担心，时尚货架来帮你了" 
						+ "<br>你只需要一套科学的陈列方案"
						+ "<br>和一些好用的陈列道具"
						+"<br>就能解决空间利用的问题"
						+"<br>不信，你就看看下面这套方案吧！";
		return new ImgInfoBean(id,"家居生活",12,"2019-02-23",content);
	}
	
}
