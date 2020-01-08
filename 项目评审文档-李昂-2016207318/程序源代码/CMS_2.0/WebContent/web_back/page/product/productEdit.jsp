<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta charset="utf-8"/>
	<title>产品编辑--TECH后台管理</title>
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
    <div class="layui-inline" style="float:left">
        &nbsp;&nbsp;&nbsp;<label class="text-primary">编辑发布会 </label>
    </div>
    <div class="layui-inline" style="float:right">
        <a href="${pageContext.request.contextPath}/product/productList" class="layui-btn layui-btn-radius layui-btn-small">&nbsp;&nbsp;关闭&nbsp;&nbsp;</a>
        <br/>
    </div>
    <hr/><br/>
    <form id="editContent" enctype="multipart/form-data" action="${pageContext.request.contextPath}/product/submit" method="post" class="layui-form">
        <div class="layui-form-item">
            <label class="layui-form-label">产品名称</label>
            <div class="layui-input-block">
                <input id="e1" name="name" type="text" value="${product.temp_product.name}" class="layui-input newsName" required></input>
            </div>
        </div>
        <div class="layui-form-item">
            <div class="layui-inline">		
                <label class="layui-form-label">发布人</label>
                <div class="layui-input-inline">
                    <input id="e2" name="author" type="text" value="${product.temp_product.author}" class="layui-input newsAuthor" ></input>
                </div>
            </div>
            
            <div class="layui-inline">		
                <label class="layui-form-label">上市时间</label>
                <div class="layui-input-inline">
              	    <input id="e3" name="date" type="date" value="${product.temp_product.date}" class="layui-input newsTime" ></input>
                </div>
            </div>
            <div class="layui-inline">		
                <label class="layui-form-label">产品类型</label>
                <div class="layui-input-inline">
                    <select id="e4" name="type" class="newsLook">
					  <option value="phone" ${product.temp_product.type=='phone'?'selected':''}>手机</option>
					  <option value="computer" ${product.temp_product.type=='computer'?'selected':''}>电脑</option>
					  <option value="other" ${product.temp_product.type=='other'?'selected':''}>其他</option>
					</select>
                </div>
            </div>
            <div class="layui-inline">
                <label class="layui-form-label">浏览权限</label>
                <div class="layui-input-inline">
					<select id="e5" name="state"  class="newsLook">
					  	<option value="1" ${product.temp_product.state==1?'selected':''}>开放</option>
					    <option value="0" ${product.temp_product.state==0?'selected':''}>隐藏</option>
					    <option value="2" ${product.temp_product.state==2?'selected':''}>推荐</option>
					</select>
                </div>
            </div>
        </div>
        
<!--上传文件-->
        <div class="layui-form-item">
            <label class="layui-form-label">产品图片</label>
		    <input type="file" name="uploadFile">
        </div>
        
        <div class="layui-form-item">
            <label class="layui-form-label">产品参数</label>
            <table class="layui-table" >
                <tr>
                    <td><c:out value="品牌 :"/></td>
                    <td><input id="e60" name="brand" type="text" value="${product.temp_product.brand}" class="layui-input"/></td>
                    <td><c:out value="价格 :"/></td>
                    <td><input id="e61" name="price" type="text" value="${product.temp_product.price}" class="layui-input"/></td>
                    <td><c:out value="处理器 :"/></td>
                    <td><input id="e62" name="cpu" type="text" value="${product.temp_product.cpu}" class="layui-input"/></td>
                    <td><c:out value="尺寸 :"/></td>
                    <td><input id="e63" name="size" type="text" value="${product.temp_product.size}" class="layui-input"/></td>
                </tr>
                <tr>
                    <td><c:out value="运行内存 :"/></td>
                    <td><input id="e64" name="ram" type="text" value="${product.temp_product.ram}" class="layui-input"/></td>
                    <td><c:out value="重量 :"/></td>
                    <td><input id="e65" name="weight" type="text" value="${product.temp_product.weight}" class="layui-input"/></td>
                    <td><c:out value="存储空间 :"/></td>
                    <td><input id="e66" name="rom" type="text" value="${product.temp_product.rom}" class="layui-input"/></td>
                    <td><c:out value="电池 :"/></td>
                    <td><input id="e67" name="battery" type="text" value="${product.temp_product.battery}" class="layui-input"/></td>
                </tr>
            </table>
        </div>
        
        <div class="layui-form-item">
                <label class="layui-form-label">产品摘要</label>
                <div class="layui-input-block">
                    <textarea id="e7" name="sketch"  class="layui-textarea" required>
                    	${product.temp_product.sketch}
                    </textarea>
                </div>
        </div>
        <div class="layui-form-item">
                <label class="layui-form-label">产品详情</label>
                <div class="layui-input-block">
                    <textarea id="e8" name="details"  class="layui-textarea" rows="10" >
                    	${product.temp_product.details}
                    </textarea>
                </div>
        </div>
        <div class="layui-form-item">
                <div class="layui-input-block" style="float:left">
                    <input type="reset" class="layui-btn layui-btn-primary">
                    <input type="submit" value="立即提交" class="layui-btn layui-btn-normal" style="background-color:#5FB878">
                </div>
        </div>
    </form>
    <script type="text/javascript" src="../../layui/layui.js"></script>
    <script type="text/javascript" src="../../js/Edit.js"></script>
</body>
</html>
