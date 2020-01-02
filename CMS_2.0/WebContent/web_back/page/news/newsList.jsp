<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<!--    xmlns:t="http://myfaces.apache.org/tomahawk"-->
<head>
	<meta charset="utf-8"/>
	<title>新闻列表</title>
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
    <blockquote class="layui-elem-quote news_search">
		<div class="layui-inline">
			<form action="${pageContext.request.contextPath}/news/searchByKey" method="post">
                 <div class="layui-input-inline">
                     <input type="text" name="key" value="${news.searchKey}" class="layui-input search_input"/>
                 </div>
                 <input type="submit" value="查询" class="layui-btn search_btn" /> 
            </form>
		</div>
		<div class="layui-inline">
            <a href="${pageContext.request.contextPath}/news/add_New" class="layui-btn layui-btn-normal newsAdd_btn">添加文章</a>
		</div>
		<div class="layui-inline">
            <a class="layui-btn recommend" style="background-color:#5FB878">推荐文章</a>
		</div>
		<div class="layui-inline">
            <a class="layui-btn layui-btn-danger batchDel">批量删除</a>
		</div>
    </blockquote>
    
    <form id="newsContent" class="layui-form">
 	  	<table class="layui-table">
		  <tr>
		    <th><input type="checkbox" lay-skin="primary" lay-filter="allChoose"/></th>
		    <th>新闻标题</th>
		    <th>预览图</th>
		    <th>浏览权限</th>
		    <th>发布时间</th>
		    <th>作者</th>
		    <th>操作</th>
		  </tr>
	      <c:forEach items="${news.now}" var="n">
			  <tr>
			    <th><input type="checkbox" lay-skin="primary" lay-filter="allChoose"/></th>
			    <th>${n.title}</th>
			    <th width="200">
			    	<div style="widt200px;height:150px;display:flex;align-items:center;justify-content:center;">
	                   <img src="${n.image}" style="widt200px;height:150px;"/>
	               	</div>
			    </th>
			    <th width="100">
	               	<select id="${n.id}" onchange="javascript:{
	               	window.location.href='${pageContext.request.contextPath}/news/changeState?id=${n.id}&state='+this.value;}">
					    <option value="1" ${n.state==1?'selected':''}>开放</option>
					    <option value="0" ${n.state==0?'selected':''}>隐藏</option>
					    <option value="2" ${n.state==2?'selected':''}>推荐</option>
					</select>
			    </th>
			    <th width="100">${n.date}</th>
			    <th>${n.author}</th>
			    <th>
	                <a href="${pageContext.request.contextPath}/news/edit_New?id=${n.id}" class="layui-btn layui-btn-mini news_edit">编辑</a>
	                <a href="${pageContext.request.contextPath}/news/delete?id=${n.id}" class="layui-btn layui-btn-mini layui-btn-danger news_del" >删除</a>
			    </th>
			  </tr>
	      </c:forEach>
		</table>
    </form>
    
    <br/>
    <div class="layui-inline" style="float:right">
        <a href="${pageContext.request.contextPath}/news/previous" class="layui-btn layui-btn-small " style="background-color:#5FB878">上一页</a>
        <c:forEach var="i" begin="1" end="${news.page_num}">
            <a href="${pageContext.request.contextPath}/news/jumpTo?id=${i}" class="layui-btn layui-btn-small layui-btn-primary">${i}</a> 
        </c:forEach>
        <a href="${pageContext.request.contextPath}/news/next" class="layui-btn layui-btn-small " style="background-color:#5FB878">下一页</a>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </div>
           
	<script type="text/javascript" src="../../layui/layui.js"></script>
	<script type="text/javascript" src="../../js/List.js"></script>
    <script type="text/javascript" src="../../js/Edit.js"></script>
</body>
</html>
