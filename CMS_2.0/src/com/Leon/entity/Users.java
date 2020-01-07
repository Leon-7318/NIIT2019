package com.Leon.entity;

import javax.annotation.Generated;

public class Users {

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.257+08:00", comments = "Source field: users.name")
	private String name;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.257+08:00", comments = "Source field: users.password")
	private String password;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.257+08:00", comments = "Source field: users.mail")
	private String mail;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.258+08:00", comments = "Source field: users.phone")
	private String phone;
	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.258+08:00", comments = "Source field: users.image")
	private String image;

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.257+08:00", comments = "Source field: users.name")
	public String getName() {
		return name;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.257+08:00", comments = "Source field: users.name")
	public void setName(String name) {
		this.name = name;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.257+08:00", comments = "Source field: users.password")
	public String getPassword() {
		return password;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.257+08:00", comments = "Source field: users.password")
	public void setPassword(String password) {
		this.password = password;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.257+08:00", comments = "Source field: users.mail")
	public String getMail() {
		return mail;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.258+08:00", comments = "Source field: users.mail")
	public void setMail(String mail) {
		this.mail = mail;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.258+08:00", comments = "Source field: users.phone")
	public String getPhone() {
		return phone;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.258+08:00", comments = "Source field: users.phone")
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.258+08:00", comments = "Source field: users.image")
	public String getImage() {
		return image;
	}

	@Generated(value = "org.mybatis.generator.api.MyBatisGenerator", date = "2020-01-07T22:47:48.258+08:00", comments = "Source field: users.image")
	public void setImage(String image) {
		this.image = image;
	}
}