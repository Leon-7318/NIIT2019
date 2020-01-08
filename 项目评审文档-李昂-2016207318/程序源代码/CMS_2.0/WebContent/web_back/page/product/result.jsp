<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    
<head>
	<meta charset="utf-8"/>
	<title>搜索结果--产品</title>
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
           <a href="${pageContext.request.contextPath}/product/productList" class="layui-btn layui-btn-radius layui-btn-normal" style="background-color:#5FB878"> 关闭 </a>&nbsp;&nbsp;&nbsp;
        </div>
   		    
	    <form id="productContent" class="layui-form">
	 	  	<table class="layui-table">
	 	  	  <caption><b><font size="6">查询结果</font></b><br/><br/><br/></caption>
			  <tr>
			    <th>产品名称</th>
			    <th>预览图</th>
			    <th>产品参数</th>
			    <th>浏览权限</th>
			    <th>发布时间</th>
			    <th>发布人</th>
			    <th>操作</th>
			  </tr>
		      <c:forEach items="${product.res}" var="p">
				  <tr>
				    <th>${p.name}</th>
				    <th width="200">
				    	<div style="widt200px;height:150px;display:flex;align-items:center;justify-content:center;">
		                   <img src="${p.image}" style="widt200px;height:150px;"/>
		               	</div>
				    </th>
				    <th>
	    	    		<div >
	                     <table class="layui-table" >
	                         <tr>
	                           <td><b><label>品牌 :</label></b></td>
	                           <td><label>${p.brand}</label></td>
	                           <td><b><label>价格 :</label></b></td>
	                           <td><label>${p.price}</label></td>
	                         </tr>
	                        <tr>
	                           <td><b><label>处理器 :</label></b></td>
	                           <td><label>${p.cpu}</label></td>
	                           <td><b><label>尺寸 :</label></b></td>
	                           <td><label>${p.size}</label></td>
	                         </tr>
	                         <tr>
	                           <td><b><label>运行内存 :</label></b></td>
	                           <td><label>${p.ram}</label></td>
	                           <td><b><label>重量 :</label></b></td>
	                           <td><label>${p.weight}</label></td>
	                         </tr>
	                         <tr>
	                           <td><b><label>存储空间 :</label></b></td>
	                           <td><label>${p.rom}</label></td>
	                           <td><b><label>电池 :</label></b></td>
	                           <td><label>${p.battery}</label></td>
	                         </tr>
	                       </table>
	                 	</div>
				    </th>
				    <th width="100">
		               	<select id="${p.id}00" onchange="javascript:{
		               	window.location.href='${pageContext.request.contextPath}/product/changeState?id=${p.id}&state='+this.value;}">
						    <option value="1" ${p.state==1?'selected':''}>开放</option>
						    <option value="0" ${p.state==0?'selected':''}>隐藏</option>
						    <option value="2" ${p.state==2?'selected':''}>推荐</option>
						</select>
				    </th>
				    <th width="100">${p.date}</th>
				    <th>${p.author}</th>
				    <th>
	                    <a href="${pageContext.request.contextPath}/product/edit_product?id=${p.id}" class="layui-btn layui-btn-mini news_edit">编辑</a>
	                    <a href="${pageContext.request.contextPath}/product/delete?id=${p.id}" class="layui-btn layui-btn-mini layui-btn-danger news_del" >删除</a>
				    </th>
				  </tr>
		      </c:forEach>
			</table>
	    </form>
	    
		<script type="text/javascript" src="../../layui/layui.js"></script>
		<script type="text/javascript" src="newsList.js"></script>
	</body>
</html>
