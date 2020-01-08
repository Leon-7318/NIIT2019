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

import com.Leon.bean.NewBean;
import com.Leon.bean.UtilBean;
import com.Leon.pojo.New;
import com.Leon.service.Impl.NewServiceImpl;

@Controller
@RequestMapping(value="news")
public class NewsController {
	
	@Resource(name="newServiceImpl")
	private NewServiceImpl service;
	
	private UtilBean util;
	private NewBean news;
	
   //更新受管Bean，刷新页面
	@RequestMapping(value="showRefreh")
    public String showRefreh(HttpSession session){
		news = (NewBean) session.getAttribute("news");
		news.showRefreh();
        return "redirect:/web_front/news/newss.jsp";
    }
    
    //显示当前新闻的详情页
	@RequestMapping(value="showNews")
    public String showNews(@RequestParam(value="id") Integer id,
    		HttpSession session){
		news = (NewBean) session.getAttribute("news");
		news.showNews(service.findById(id));
        return "redirect:/web_front/news/news.jsp";
    }
	
	@RequestMapping(value="searchByKey")
	public String searchByKey(HttpSession session){
		news = (NewBean) session.getAttribute("news");
		news.searchByKey();
		
		util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/news/result.jsp";
		else
			return "redirect:/web_front/news/result.jsp";
    }
	
//翻页 跳转

	@RequestMapping(value="previous")
	public String previous(HttpSession session){
		news = (NewBean) session.getAttribute("news");
		news.previous();
		
		System.out.println("---------news-------previous");
		
		util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/news/newsList.jsp";
		else
			return "redirect:/web_front/news/newss.jsp";
    }
    
	@RequestMapping(value="next")
    public String next(HttpSession session){
		news = (NewBean) session.getAttribute("news");
		news.next();

		System.out.println("---------news-------next");
		
		util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/news/newsList.jsp";
		else
			return "redirect:/web_front/news/newss.jsp";
    }
    
	@RequestMapping(value="jumpTo")
    public String jumpTo(@RequestParam(value="id") Integer i,
    		HttpSession session){
		news = (NewBean) session.getAttribute("news");
		news.jumpTo(i);
		
		System.out.println("---------news-------jumpTo"+" "+i);
		
		util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/news/newsList.jsp";
		else
			return "redirect:/web_front/news/newss.jsp";
	}
	
	
//后台页面
	@RequestMapping(value="newsList")
	public String newsList(HttpSession session){
		news = (NewBean) session.getAttribute("news");
		news.refreshPage();
        return "redirect:/web_back/page/news/newsList.jsp";
    }
	
	
	@RequestMapping(value="add_New")
	 public String add_New(HttpSession session){
		news = (NewBean) session.getAttribute("news");
		news.add_New();
        return "redirect:/web_back/page/news/newsEdit.jsp";
    }
	    
	@RequestMapping(value="edit_New")
    public String edit_New(@RequestParam(value="id") Integer id,
    		HttpSession session){
		news = (NewBean) session.getAttribute("news");
		news.edit_New(id);
        return "redirect:/web_back/page/news/newsEdit.jsp";
    }
	
//	title  author state  date file sketch detail
	
	@RequestMapping(value="submit")
    public String submit(
    		@RequestParam(value="title") String title,
    		@RequestParam(value="author") String author,
    		@RequestParam(value="state") String state,
    		@RequestParam(value="date") String date,
    		@RequestParam(value="uploadFile") MultipartFile file,
    		@RequestParam(value="sketch") String sketch,
    		@RequestParam(value="detail") String detail,
    		HttpSession session){
		news = (NewBean) session.getAttribute("news");
		New n = news.getTemp_New();
		
		n.setTitle(title);
		n.setAuthor(author);
		n.setState(Integer.parseInt(state));
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	    ParsePosition pos = new ParsePosition(0);
	    Date sdate = formatter.parse(date, pos);
	    n.setDate(sdate);
	    n.setSketch(sketch);
	    n.setDetail(detail);
		
	    try {
			news.submit(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
        return "redirect:/web_back/page/news/newsList.jsp";
    }
	

//更新	
	
	@RequestMapping(value="delete")
    public String delete(@RequestParam(value="id") Integer id,
    		HttpSession session){
		news = (NewBean) session.getAttribute("news");

		news.delete(service.findById(id));
		news.refreshPage();
        return "redirect:/web_back/page/news/newsList.jsp";
    }
    
	@RequestMapping(value="update")
    public String update(@RequestParam(value="id") Integer id,
    		HttpSession session){
		news = (NewBean) session.getAttribute("news");

		news.update(service.findById(id));
		news.refreshPage();
        return "redirect:/web_back/page/news/newsList.jsp";
    }
	
	
	
}
