package com.Leon.bean;

import org.springframework.stereotype.Component;

import com.Leon.pojo.Manager;
import com.Leon.service.Impl.ManagerServiceImpl;

@Component()
public class AdminBean {

	private String name;
	private String password;
	private String mail;
	private String phone;
	private String image;

	public AdminBean() {
		super();
	}

	public void setAdmin(Manager m) {
		this.name = m.getName();
		this.password = m.getPassword();
		this.mail = m.getMail();
		this.phone = m.getPhone();
		this.image = m.getImage();
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
