package com.zoudm.pro.bean;

/**
 * @author Administrator
 * 新闻资讯缩略图信息
 */
public class BaseNews {
	private int id;
	private String title;
	private String add_time;
	private String zhayao;
	private int click;
	private String img_url;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAdd_time() {
		return add_time;
	}
	public void setAdd_time(String add_time) {
		this.add_time = add_time;
	}
	public String getZhayao() {
		return zhayao;
	}
	public void setZhayao(String zhayao) {
		this.zhayao = zhayao;
	}
	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	@Override
	public String toString() {
		return "BaseNews [id=" + id + ", title=" + title + ", add_time=" + add_time + ", zhayao=" + zhayao + ", click="
				+ click + ", img_url=" + img_url + "]";
	}
	public BaseNews(int id, String title, String add_time, String zhayao, int click, String img_url) {
		super();
		this.id = id;
		this.title = title;
		this.add_time = add_time;
		this.zhayao = zhayao;
		this.click = click;
		this.img_url = img_url;
	}
	public BaseNews() {
		super();
		// TODO Auto-generated constructor stub
	}
}
