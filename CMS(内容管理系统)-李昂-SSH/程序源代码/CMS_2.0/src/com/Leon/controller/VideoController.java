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

import com.Leon.bean.UtilBean;
import com.Leon.bean.VideoBean;
import com.Leon.pojo.Video;
import com.Leon.service.Impl.VideoServiceImpl;

@Controller
@RequestMapping(value="video")
public class VideoController {
	
	@Resource(name="videoServiceImpl")
	private VideoServiceImpl service;
	
	private UtilBean util;
	private VideoBean video;
	
	//更新受管Bean，刷新页面
	@RequestMapping(value="showRefreh")
	public String showRefreh(HttpSession session){
    	video = (VideoBean) session.getAttribute("video");
    	video.showRefreh();
        return "redirect:/web_front/video/videos.jsp";
    }
    
    //显示当前视频的详情页
	@RequestMapping(value="showVideo")
    public String showVideo(@RequestParam(value="id") Integer id,
    		HttpSession session){
    	video = (VideoBean) session.getAttribute("video");
    	video.showVideo(service.findById(id));
        return "redirect:/web_front/video/video.jsp";
    }
	
	@RequestMapping(value="searchByKey")
    public String searchByKey(@RequestParam(value="key") String key,
    		HttpSession session){
    	video = (VideoBean) session.getAttribute("video");
    	video.setSearchKey(key);
    	video.searchByKey();
    	
    	util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/video/result.jsp";
		else
			return "redirect:/web_front/video/result.jsp";
    }

//翻页 跳转

	@RequestMapping(value="previous")
	public String previous(HttpSession session){
		video = (VideoBean) session.getAttribute("video");
		video.previous();
		
		System.out.println("---------video-------previous");
		
		util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/video/videoList.jsp";
		else
			return "redirect:/web_front/video/videos.jsp";
    }
    
	@RequestMapping(value="next")
    public String next(HttpSession session){
		video = (VideoBean) session.getAttribute("video");
		video.next();

		System.out.println("---------video-------next");
		
		util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/video/videoList.jsp";
		else
			return "redirect:/web_front/video/videos.jsp";
    }
    
	@RequestMapping(value="jumpTo")
    public String jumpTo(@RequestParam(value="id") Integer i,
    		HttpSession session){
		video = (VideoBean) session.getAttribute("video");
		video.jumpTo(i);
		
		System.out.println("---------video-------jumpTo"+" "+i);
		
		util = (UtilBean) session.getAttribute("util");
		if(util.getK()==1)
			return "redirect:/web_back/page/video/videoList.jsp";
		else
			return "redirect:/web_front/video/videos.jsp";
	}
	
	
//后台页面
	@RequestMapping(value="videoList")
	public String videoList(HttpSession session){
    	video = (VideoBean) session.getAttribute("video");
		video.refreshPage();
        return "redirect:/web_back/page/video/videoList.jsp";
    }

    
	@RequestMapping(value="add_Video")
    public String add_Video(HttpSession session){
    	video = (VideoBean) session.getAttribute("video");
    	video.add_Video();
        return "redirect:/web_back/page/video/videoEdit.jsp";
    }
	
	@RequestMapping(value="edit_Video")
    public String edit_Video(@RequestParam(value="id") int id,
    		HttpSession session){
    	video = (VideoBean) session.getAttribute("video");
    	video.edit_Video(id);
        return "redirect:/web_back/page/video/videoEdit.jsp";
    }
	
	
//	title  author  state date Image Video sketch
	
	@RequestMapping(value="submit")
    public String submit(
    		@RequestParam(value="title") String title,
    		@RequestParam(value="author") String author,
    		@RequestParam(value="state") String state,
    		@RequestParam(value="date") String date,
    		@RequestParam(value="Image") MultipartFile file1,
    		@RequestParam(value="Video") MultipartFile file2,
    		@RequestParam(value="sketch") String sketch,
    		HttpSession session){
    	video = (VideoBean) session.getAttribute("video");
		Video v = video.getTemp_Video();
    	v.setTitle(title);
    	v.setAuthor(author);
    	v.setState(Integer.parseInt(state));
    	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	    ParsePosition pos = new ParsePosition(0);
	    Date sdate = formatter.parse(date, pos);
    	v.setDate(sdate);
    	v.setSketch(sketch);
    	try {
			video.submit(file1, file2);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return "redirect:/web_back/page/video/videoList.jsp";
    }
	

//更新	
	
	@RequestMapping(value="delete")
    public String delete(@RequestParam(value="id") Integer id,
    		HttpSession session){
    	video = (VideoBean) session.getAttribute("video");

		video.delete(service.findById(id));
		video.refreshPage();
        return "redirect:/web_back/page/video/videoList.jsp";
    }
    
	@RequestMapping(value="update")
    public String update(@RequestParam(value="id") Integer id,
    		HttpSession session){
    	video = (VideoBean) session.getAttribute("video");

		video.update(service.findById(id));
		video.refreshPage();
        return "redirect:/web_back/page/video/videoList.jsp";
    }
	
}

