<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta charset="utf-8"/>
	<title>新闻编辑--TECH后台管理</title>
	<meta name="renderer" content="webkit"/>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>
	<meta name="apple-mobile-web-app-status-bar-style" content="black"/>
	<meta name="apple-mobile-web-app-capable" content="yes"/>
	<meta name="format-detection" content="telephone=no"/>
	<link rel="stylesheet" href="../../layui/css/layui.css" media="all" />
	<link rel="stylesheet" href="//at.alicdn.com/t/font_eolqem241z66flxr.css" media="all" />
</head>
<body class="childrenBody">
    <form>
        <div class="layui-inline" style="float:left">
            &nbsp;&nbsp;&nbsp;<label class="text-primary">编辑文章</label>
        </div>
        <div class="layui-inline" style="float:right">
            <a href="${pageContext.request.contextPath}/news/newsList" class="layui-btn layui-btn-radius layui-btn-small">&nbsp;&nbsp;关闭&nbsp;&nbsp;</a>
            <br/>
        </div>
    </form>
        <hr/><br/>
        
    <form id="editContent" enctype="multipart/form-data" action="${pageContext.request.contextPath}/news/submit" method="post" class="layui-form">
        <div class="layui-form-item">
            <label class="layui-form-label">新闻标题</label>
            <div class="layui-input-block">
                <input id="e1" name="title" type="text" value="${news.temp_New.title}" class="layui-input newsName" required></input>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">		
                <label class="layui-form-label">文章作者</label>
                <div class="layui-input-inline">
                    <input id="e2" name="author" type="text" value="${news.temp_New.author}" class="layui-input newsAuthor" ></input>
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">浏览权限</label>
                <div class="layui-input-inline">
				   	<select id="e3" name="state"  class="newsLook">
					  	<option value="1" ${news.temp_New.state==1?'selected':''}>开放</option>
					    <option value="0" ${news.temp_New.state==0?'selected':''}>隐藏</option>
					    <option value="2" ${news.temp_New.state==2?'selected':''}>推荐</option>
					</select>
                </div>
            </div>
            <div class="layui-inline">		
                <label class="layui-form-label">发布时间</label>
                <div class="layui-input-inline">
                    <input id="e4" name="date" type="date" value="${news.temp_New.date}" class="layui-input newsTime" ></input>
                </div>
            </div>
        </div>
        
<!--上传文件-->
        <div class="layui-form-item">
            <label class="layui-form-label">上传图片</label>
		    <input type="file" name="uploadFile">
        </div>
        
        <div class="layui-form-item">
                <label class="layui-form-label">内容摘要</label>
                <div class="layui-input-block">
                    <textarea id="e5" name="sketch" class="layui-textarea" required>
                    	${news.temp_New.sketch}
                    </textarea>
                </div>
        </div>
        <div class="layui-form-item">
                <label class="layui-form-label">文章内容</label>
                <div class="layui-input-block">
                    <textarea id="e6" name="detail" class="layui-textarea" rows="10" >
                    	${news.temp_New.detail}
                    </textarea>
                </div>	
        </div>
        <div class="layui-form-item">
                <div class="layui-input-block" style="float:left">
                    <input type="reset" value="重置" class="layui-btn layui-btn-primary">
                    <input type="submit" value="立即提交" class="layui-btn layui-btn-normal" style="background-color:#5FB878">
                </div>
        </div>
    </form>
    <script type="text/javascript" src="../../layui/layui.js"></script>
    <script type="text/javascript" src="../../js/Edit.js"></script>
</body>
</html>
