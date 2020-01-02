<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>用户登陆</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<!-- Custom Theme files -->
	<link  rel="stylesheet" type="text/css" href="resource/css/style2.css" media="all" />
	<!-- //Custom Theme files -->
	<!-- js -->
	<script type="text/javascript" src="resource/js/jquery.min.js"></script>
	<script type="text/javascript" src="resource/js/easyResponsiveTabs.js" ></script>
	<!-- //js -->
</head>
<body>
	<!-- main -->
	<div class="main">
		<h1>Welcome to TECH!</h1>
		<div class="login-form">
			<div class="sap_tabs w3ls-tabs">
				<div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
					<ul class="resp-tabs-list">
						<li class="resp-tab-item" aria-controls="tab_item-0" role="tab"><span>登陆</span></li> 
						<li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><label>/</label><span>注册</span></li>
					</ul>	
					<div class="clear"> </div>
					<div class="resp-tabs-container">
						<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-0">
							<div class="login-agileits-top"> 
								<form action="${pageContext.request.contextPath}/front/login" method="post">
									<p>账号 </p>
									<input type="text" name="username" required="required" id="user"/>
									<p>密码</p>
									<input type="password" name="password" required="required" id="pass"/>	
									<br> 
									<input type="radio" id="brand" name="k" value="0" >
									<label for="brand"><span></span><font color="#F0F0F0">用户</font> </label> 
									<input type="radio" id="brand" name="k" value="1" checked>
									<label for="brand"><span></span><font color="#F0F0F0">管理员</font> </label>
									<br/><br/> 
									<input type="submit" value="LOGIN" >
								</form>  
								<iframe name='login_frame' id="login_frame" style='display: none'></iframe>
							</div>
							<div class="login-agileits-bottom"> 
								<p><a href="#">忘记密码?</a></p>
							</div> 
						</div> 
						<div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
							<div class="login-agileits-top sign-up"> 
								<form action="${pageContext.request.contextPath}/front/register" method="post">
									<p>用户名 </p>
									<input type="text" name="username"  required="required" id="username"/>
									<p>邮箱 </p>
									<input type="text" name="email"  required="required" id="email"/>
									<p>密码</p>
									<input type="password" name="password" placeholder="" required="required" id="password"/>	
									<input type="checkbox" id="brand1" value="">
									<label for="brand1"><span></span>我接受用户协议</label> 
									<input type="submit" value="SIGN UP">
								</form>  
								<iframe name='register_frame' id="register_frame" style='display: none'></iframe>
							</div>
						</div>
					</div>							
				</div>	 
			</div> 
			<!-- ResponsiveTabs js -->
			<script type="text/javascript">
				$(document).ready(function () {
					$('#horizontalTab').easyResponsiveTabs({
						type: 'default', //Types: default, vertical, accordion           
						width: 'auto', //auto or any width like 600px
						fit: true   // 100% fit in a container
					});
				});
			</script>
			<!-- //ResponsiveTabs js -->
		</div>	
	</div>	
	<!-- //main -->
	<!-- copyright -->
	<div class="copyright">
		<p> © 2018 Gallery All rights reserved</p>
	</div>
	<!-- //copyright --> 
</body>
</html>