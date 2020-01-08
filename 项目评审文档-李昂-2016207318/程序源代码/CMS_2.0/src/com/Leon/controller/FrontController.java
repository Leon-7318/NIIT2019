package com.Leon.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Leon.bean.AdminBean;
import com.Leon.bean.ConferenceBean;
import com.Leon.bean.NewBean;
import com.Leon.bean.ProductBean;
import com.Leon.bean.UserBean;
import com.Leon.bean.UtilBean;
import com.Leon.bean.VideoBean;
import com.Leon.pojo.Users;
import com.Leon.service.Impl.ManagerServiceImpl;
import com.Leon.service.Impl.UserServiceImpl;

@Controller
@RequestMapping(value = "/front")
public class FrontController {

	@Resource(name = "utilBean")
	private UtilBean util;

	@Resource(name = "conferenceBean")
	private ConferenceBean conf;

	@Resource(name = "newBean")
	private NewBean news;

	@Resource(name = "productBean")
	private ProductBean product;

	@Resource(name = "videoBean")
	private VideoBean video;

	@Resource(name = "userServiceImpl")
	private UserServiceImpl userService;

	@Resource(name = "managerServiceImpl")
	private ManagerServiceImpl adminService;

	@RequestMapping(value = "fff")
	public String init(HttpSession session) {
		util.setK(0);
		if (session.getAttribute("util") == null)
			session.setAttribute("util", util);
		if (session.getAttribute("conf") == null)
			session.setAttribute("conf", conf);
		if (session.getAttribute("news") == null)
			session.setAttribute("news", news);
		if (session.getAttribute("product") == null)
			session.setAttribute("product", product);
		if (session.getAttribute("video") == null)
			session.setAttribute("video", video);

		return "redirect:/web_front/front_index.jsp";
	}

	@RequestMapping(value = "home")
	public String home(HttpSession session) {
		return "redirect:/web_front/front_index.jsp";
	}

	@RequestMapping(value = "back")
	public String back(HttpSession session) {
		return "redirect:/web_back/back_index.jsp";
	}

	@RequestMapping(value = "login")
	public String login(@RequestParam(value = "k") Integer k, @RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password, HttpSession session) {

		UtilBean util = (UtilBean) session.getAttribute("util");
		ConferenceBean c = (ConferenceBean) session.getAttribute("conf");
		NewBean n = (NewBean) session.getAttribute("news");
		ProductBean p = (ProductBean) session.getAttribute("product");
		VideoBean v = (VideoBean) session.getAttribute("video");

		String addr = "";

		if (k == 1 && adminService.Login(username, password)) {
			AdminBean admin = new AdminBean();
			admin.setAdmin(adminService.getManager(username));
			session.setAttribute("admin", admin);
			addr = "redirect:/web_back/back_index.jsp";
		} else if (userService.Login(username, password)) {
			UserBean user = new UserBean();
			user.setUser(userService.getUser(username));
			session.setAttribute("user", user);
			addr = "redirect:/web_front/front_index.jsp";
		}

		util.setK(k);
		c.refreshPage();
		n.refreshPage();
		p.refreshPage();
		v.refreshPage();

		System.out.println(addr);
		return addr;
	}

	@RequestMapping(value = "logout")
	public String logout(HttpSession session) {
		session.invalidate();
		// ***********
		System.out.println("-------logout------");
		return "redirect:/front/fff";
	}

	@RequestMapping(value = "register")
	public String register(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password, @RequestParam(value = "email") String email,
			HttpSession session) {
		util = (UtilBean) session.getAttribute("util");
		Users u = new Users();
		u.setName(username);
		u.setPassword(password);
		u.setMail(email);
		if (userService.register(u))
			return "redirect:/web_front/front_index.jsp";

		return "";
	}

}
