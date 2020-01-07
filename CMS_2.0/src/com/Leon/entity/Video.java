package com.Leon.entity;

import java.util.Date;
import javax.annotation.Generated;

public class Video {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.id")
	private Integer id;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.title")
	private String title;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.url")
	private String url;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.date")
	private Date date;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.sketch")
	private String sketch;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.image")
	private String image;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.state")
	private Integer state;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.author")
	private String author;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.id")
	public Integer getId() {
		return id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.id")
	public void setId(Integer id) {
		this.id = id;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.title")
	public String getTitle() {
		return title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.title")
	public void setTitle(String title) {
		this.title = title;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.url")
	public String getUrl() {
		return url;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.url")
	public void setUrl(String url) {
		this.url = url;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.date")
	public Date getDate() {
		return date;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.date")
	public void setDate(Date date) {
		this.date = date;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.sketch")
	public String getSketch() {
		return sketch;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.sketch")
	public void setSketch(String sketch) {
		this.sketch = sketch;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.image")
	public String getImage() {
		return image;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.image")
	public void setImage(String image) {
		this.image = image;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.state")
	public Integer getState() {
		return state;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.state")
	public void setState(Integer state) {
		this.state = state;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.author")
	public String getAuthor() {
		return author;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.259+08:00", comments = "Source field: video.author")
	public void setAuthor(String author) {
		this.author = author;
	}
}