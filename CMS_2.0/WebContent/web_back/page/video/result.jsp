<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta charset="utf-8"/>
	<title>搜索结果--视频</title>
	<meta name="renderer" content="webkit"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>
	<meta name="apple-mobile-web-app-status-bar-style" content="black"/>
	<meta name="apple-mobile-web-app-capable" content="yes"/>
	<meta name="format-detection" content="telephone=no"/>
	<link rel="stylesheet" href="../../layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="//at.alicdn.com/t/font_eolqem241z66flxr.css" media="all" />
	<link rel="stylesheet" href="../../css/news.css" media="all" />
</head>
   <body class="childrenBody">
	     <div class="layui-inline" style="float:right">
	         <a href="${pageContext.request.contextPath}/video/videoList" class="layui-btn layui-btn-radius layui-btn-normal" style="background-color:#5FB878"> 关闭 </a>&nbsp;&nbsp;&nbsp;
	     </div>
	     <form id="videoContent" class="layui-form">
		  	<table class="layui-table">
		  	  <caption><b><font size="6">查询结果</font></b><br/><br/><br/></caption>
			  <tr>
			    <th><input type="checkbox" lay-skin="primary" lay-filter="allChoose"/></th>
			    <th>视频标题</th>
			    <th>预览图</th>
			    <th>浏览权限</th>
			    <th>上传时间</th>
			    <th>作者</th>
			    <th>操作</th>
			  </tr>
		      <c:forEach items="${video.res}" var="v">
			  <tr>
			    <th><input type="checkbox" lay-skin="primary" lay-filter="allChoose"/></th>
			    <th>${v.title}</th>
			    <th width="200">
			    	<div style="widt200px;height:150px;display:flex;align-items:center;justify-content:center;">
	                   <img src="${v.image}" style="widt200px;height:150px;"/>
	               	</div>
			    </th>
			    <th width="100">
	               	<select id="${v.id}00" onchange="javascript:{
	               	window.location.href='${pageContext.request.contextPath}/news/changeState?id=${v.id}&state='+this.value;}">
					    <option value="1" ${v.state==1?'selected':''}>开放</option>
					    <option value="0" ${v.state==0?'selected':''}>隐藏</option>
					    <option value="2" ${v.state==2?'selected':''}>推荐</option>
					</select>
			    </th>
			    <th width="100">${v.date}</th>
			    <th>${v.author}</th>
			    <th>
	                   <a href="${v.url}"  class="layui-btn layui-btn-mini layui-btn-primary" >播放</a>
	                   <a href="${pageContext.request.contextPath}/video/edit_Video?id=${v.id}" class="layui-btn layui-btn-mini news_edit">编辑</a>
	                   <a href="${pageContext.request.contextPath}/video/delete?id=${v.id}" class="layui-btn layui-btn-mini layui-btn-danger news_del" >删除</a>
			    </th>
			  </tr>
	      </c:forEach>
			</table>
	   	</form>
	
		<script type="text/javascript" src="../../layui/layui.js"></script>
		<script type="text/javascript" src="newsList.js"></script>
	</body>
</html>
