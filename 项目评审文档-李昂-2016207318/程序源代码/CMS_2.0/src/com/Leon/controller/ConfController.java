package com.Leon.controller;

import java.io.IOException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.Leon.bean.ConferenceBean;
import com.Leon.bean.UtilBean;
import com.Leon.pojo.Conference;
import com.Leon.service.Impl.ConferenceServiceImpl;

@Controller
@RequestMapping(value="conf")
public class ConfController {
	
	@Resource(name="conferenceServiceImpl")
	private ConferenceServiceImpl service;
	
	private UtilBean util;
	private ConferenceBean conf;
	
	//更新Bean，刷新页面
	@RequestMapping(value="showRefreh")
	public String showRefreh(HttpSession session){
		conf = (ConferenceBean) session.getAttribute("conf");
		conf.refreshPage();
        return "redirect:/web_front/conference/conferences.jsp";
    }
	
	//显示当前发布会的详情页
	@RequestMapping(value="showConference")
    public String showConference(@RequestParam(value="id") Integer id,
    		HttpSession session){
		conf = (ConferenceBean) session.getAttribute("conf");
		conf.showConference(service.findById(id));
        return "redirect:/web_front/conference/conference.jsp";
    }
	
	
	@RequestMapping(value="searchByKey")
	public String searchByKey(@RequestParam(value="key") String key,
			HttpSession session){
		conf = (ConferenceBean) session.getAttribute("conf");
		conf.setSearchKey(key);
		conf.searchByKey();
		
		util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/conference/result.jsp";
		else
			return "redirect:/web_front/conference/result.jsp";
    }
	
	@RequestMapping(value="add_Conference")
	public String add_Conference (HttpSession session){
		conf = (ConferenceBean) session.getAttribute("conf");
		conf.add_Conference();
        return "redirect:/web_back/page/conference/confEdit.jsp";
	}
	    
	@RequestMapping(value="edit_Conference")
    public String edit_Conference (@RequestParam(value="id") Integer id,
    		HttpSession session){
		conf = (ConferenceBean) session.getAttribute("conf");
		conf.edit_Conference(id);
        return "redirect:/web_back/page/conference/confEdit.jsp";
    }
	
	@RequestMapping(value="changeState")
	public String changeState (@RequestParam(value="id") Integer id,@RequestParam(value="state") String state,
			HttpSession session){
		conf = (ConferenceBean) session.getAttribute("conf");
		
		System.out.println("----------changeState------  "+id+" / "+state);
		
		Conference n = conf.getConference(id);
		n.setState(Integer.parseInt(state));
		conf.update(n);
		conf.refreshPage();
		return "redirect:/web_back/page/conference/confList.jsp";
	}
	
//翻页 跳转
	
	@RequestMapping(value="previous")
	public String previous(HttpSession session){
		conf = (ConferenceBean) session.getAttribute("conf");
		conf.previous();
		
		System.out.println("---------conf-------previous");
		
		util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/conference/confList.jsp";
		else
			return "redirect:/web_front/conference/conferences.jsp";
    }
    
	@RequestMapping(value="next")
    public String next(HttpSession session){
		conf = (ConferenceBean) session.getAttribute("conf");
		conf.next();

		System.out.println("---------conf-------next");
		
		util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/conference/confList.jsp";
		else
			return "redirect:/web_front/conference/conferences.jsp";
    }
    
	@RequestMapping(value="jumpTo")
    public String jumpTo(@RequestParam(value="id") Integer i,
    		HttpSession session){
		conf = (ConferenceBean) session.getAttribute("conf");
		conf.jumpTo(i);
		
		System.out.println("---------conf-------jumpTo"+" "+i);
		
		util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/conference/confList.jsp";
		else
			return "redirect:/web_front/conference/conferences.jsp";
	}
	
//后台页面
	@RequestMapping(value="confList")
	public String confList(HttpSession session){
		conf = (ConferenceBean) session.getAttribute("conf");
		conf.refreshPage();
        return "redirect:/web_back/page/conference/confList.jsp";
    }
	
//	name author date address state file sketch detail
	
	@RequestMapping(value="submit")
    public String submit(
    		@RequestParam(value="name") String name,
    		@RequestParam(value="author") String author,
    		@RequestParam(value="date") String date,
    		@RequestParam(value="address") String address,
    		@RequestParam(value="state") String state,
    		@RequestParam(value="uploadFile") MultipartFile file,
    		@RequestParam(value="sketch") String sketch,
    		@RequestParam(value="detail") String detail,
    		HttpSession session){
		conf = (ConferenceBean) session.getAttribute("conf");
		Conference c = conf.getTemp_Conference();
		
		c.setName(name);
		c.setAuthor(author);
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	    ParsePosition pos = new ParsePosition(0);
	    Date sdate = formatter.parse(date, pos);
		c.setDate(sdate);
		c.setAddress(address);
		c.setState(Integer.parseInt(state));
		c.setSketch(sketch);
		c.setDetail(detail);

		try {
			conf.submit(file);
		} catch (Exception e) {
			e.printStackTrace();
		} 
        return "redirect:/web_back/page/conference/confList.jsp";
    }
	

//更新	
	@RequestMapping(value="delete")
    public String delete(@RequestParam(value="id") Integer id,
    		HttpSession session){
		conf = (ConferenceBean) session.getAttribute("conf");
		conf.delete(service.findById(id));
		conf.refreshPage();
        return "redirect:/web_back/page/conference/confList.jsp";
    }
    
	@RequestMapping(value="update")
    public String update(@RequestParam(value="id") Integer id,
    		HttpSession session){
		conf = (ConferenceBean) session.getAttribute("conf");
		conf.update(service.findById(id));
		conf.refreshPage();
        return "redirect:/web_back/page/conference/confList.jsp";
    }
}

