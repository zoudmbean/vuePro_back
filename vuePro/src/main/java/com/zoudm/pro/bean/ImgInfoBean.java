package com.zoudm.pro.bean;

public class ImgInfoBean {
	private Integer id;
	private String title;
	private Integer click;
	private String add_time;
	private String content;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getClick() {
		return click;
	}
	public void setClick(Integer click) {
		this.click = click;
	}
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "ImgInfoBean [id=" + id + ", title=" + title + ", click=" + click + ", add_time=" + add_time
				+ ", content=" + content + "]";
	}
	public ImgInfoBean(Integer id, String title, Integer click, String add_time, String content) {
		this.id = id;
		this.title = title;
		this.click = click;
		this.add_time = add_time;
		this.content = content;
	}
	public ImgInfoBean() {
		super();
	}
	
}
