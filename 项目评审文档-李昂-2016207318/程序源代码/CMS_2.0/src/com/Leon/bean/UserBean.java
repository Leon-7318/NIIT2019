package com.Leon.bean;

import org.springframework.stereotype.Component;

import com.Leon.pojo.Users;

@Component()
public class UserBean {
	private String name;
	private String password;
	private String mail;
	private String phone;
	private String image;

	public UserBean() {
		super();
	}

	public void setUser(Users u) {
		this.name = u.getName();
		this.password = u.getPassword();
		this.mail = u.getMail();
		this.phone = u.getPhone();
		this.image = u.getImage();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
