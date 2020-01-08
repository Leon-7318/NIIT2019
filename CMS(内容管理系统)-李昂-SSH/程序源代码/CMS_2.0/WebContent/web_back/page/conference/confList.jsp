<!DOCTYPE html PUBLIC "-//W3C//Dth HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dth">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta charset="utf-8"/>
	<title>发布会列表</title>
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
             <form action="${pageContext.request.contextPath}/conf/searchByKey" method="post">
                 <div class="layui-input-inline">
                     <input type="text" name="key" class="layui-input search_input"/>
                 </div>
                 <input type="submit" value="查询" class="layui-btn search_btn" /> 
             </form>
		</div>
		<div class="layui-inline">
             <a href="${pageContext.request.contextPath}/conf/add_Conference" class="layui-btn layui-btn-normal newsAdd_btn">添加发布会</a>
		</div>
		<div class="layui-inline">
             <a href="#" class="layui-btn layui-btn-danger batchDel">批量删除</a>
		</div>
    </blockquote>
    <form id="confContent" class="layui-form">
 	  	<table class="layui-table">
		  <tr>
		    <th><input type="checkbox" lay-skin="primary" lay-filter="allChoose"/></th>
		    <th>发布会名称</th>
		    <th>预览图</th>
		    <th>地点</th>
		    <th>发布会时间</th>
		    <th>浏览权限</th>
		    <th>作者</th>
		    <th>操作</th>
		  </tr>
	      <c:forEach items="${conf.now}" var="c">
			  <tr>
			    <th><input type="checkbox" lay-skin="primary" lay-filter="allChoose"/></th>
			    <th>${c.name}</th>
			    <th width="200">
			    	<div style="widt200px;height:150px;display:flex;align-items:center;justify-content:center;">
	                   <img src="${c.poster}" style="widt200px;height:150px;"/>
	               	</div>
			    </th>
			    <th width="100">${c.address}</th>
			    <th width="100">${c.date}</th>
			    <th width="100">
	               	<select id="${c.id}" onchange="javascript:{
	               	window.location.href='${pageContext.request.contextPath}/conf/changeState?id=${c.id}&state='+this.value;}">
					    <option value="1" ${c.state==1?'selected':''}>开放</option>
					    <option value="0" ${c.state==0?'selected':''}>隐藏</option>
					    <option value="2" ${c.state==2?'selected':''}>推荐</option>
					</select>
			    </th>
			    <th>${c.author}</th>
			    <th>
	                <a href="${pageContext.request.contextPath}/conf/edit_Conference?id=${c.id}" class="layui-btn layui-btn-mini news_edit">编辑</a>
	                <a href="${pageContext.request.contextPath}/conf/delete?id=${c.id}" class="layui-btn layui-btn-mini layui-btn-danger news_del" >删除</a>
			    </th>
			  </tr>
	      </c:forEach>
		</table>
    </form>
    <br/>
    <div class="layui-inline" style="float:right">
           <a href="${pageContext.request.contextPath}/conf/previous" class="layui-btn layui-btn-small " style="background-color:#5FB878">上一页</a>
           <c:forEach var="i" begin="1" end="${conf.page_num}">
               <a href="${pageContext.request.contextPath}/conf/jumpTo?id=${i}" class="layui-btn layui-btn-small layui-btn-primary"  >${i}</a> 
           </c:forEach>
           <a href="${pageContext.request.contextPath}/conf/next" class="layui-btn layui-btn-small " style="background-color:#5FB878">下一页</a>
   		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    </div>
	<script type="text/javascript" src="../../layui/layui.js"></script>
	<script type="text/javascript" src="../../js/List.js"></script>
    <script type="text/javascript" src="../../js/Edit.js"></script>
</body>
</html>
