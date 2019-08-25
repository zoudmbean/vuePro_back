package com.zoudm.pro.bean;

public class Comment {
	private Integer artid;
	private Integer id;
	private String user_name;
	private String add_time;
	private String content;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getArtid() {
		return artid;
	}
	public void setArtid(Integer artid) {
		this.artid = artid;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
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
		return "Comment [user_name=" + user_name + ", add_time=" + add_time + ", content=" + content + "]";
	}
	public Comment(Integer id,Integer artid,String user_name, String add_time, String content) {
		super();
		this.artid = artid;
		this.id = id;
		this.user_name = user_name;
		this.add_time = add_time;
		this.content = content;
	}
	public Comment() {
		super();
	}
}
