<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<section id="header_section_wrapper" class="header_section_wrapper">
	<div class="container">
		<div class="header-section">
			<div class="row">
				<div class="col-md-4">
					<div class="left_section">
						<%--* 显示日期 --%>
						<span class="date">${util.getDateTime() }</span>
						<!-- Date -->
						<div class="social">
							<a class="icons-sm fb-ic"><i class="fa fa-facebook"></i></a>
							<!--Twitter-->
							<a class="icons-sm tw-ic"><i class="fa fa-twitter"></i></a>
							<!--Google +-->
							<a class="icons-sm inst-ic"><i class="fa fa-instagram"> </i></a>
							<!--Linkedin-->
							<a class="icons-sm tmb-ic"><i class="fa fa-tumblr"> </i></a>
							<!--Pinterest-->
							<a class="icons-sm rss-ic"><i class="fa fa-rss"> </i></a>
						</div>
						<!-- Top Social Section -->
					</div>
					<!-- Left Header Section -->
				</div>
				<div class="col-md-4">
					<div class="logo">
						<a href="#"><img src="../assets/img/logo.png" alt="Tech NewsLogo" /></a>
					</div>
					<!-- Logo Section -->
				</div>
				<div class="col-md-4">
					<div class="right_section">
						<ul class="nav navbar-nav">
							<%-- 跳转 登陆注册页面 --%>
							<li><a href="${pageContext.request.contextPath }/login.jsp">Login</a></li>
							<li><a href="${pageContext.request.contextPath }/login.jsp">Register</a></li>
						</ul>
						<!-- LogAndReg Section -->
					</div>
					<!-- Right Header Section -->
				</div>
			</div>
		</div>

		<!-- Header Section -->
		<div class="navigation-section">
			<nav class="navbar m-menu navbar-default">
				<div class="container">
					<div class="collapse navbar-collapse" id="#navbar-collapse-1">
						<ul class="nav navbar-nav main-nav">
							<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
							<!--<li class="active"><a>首页</a></li>-->
							<%--* 跳转页面 --%>
							<li class="active"><a
								href="${pageContext.request.contextPath }/front/home">首页</a></li>
							<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
							<li><a
								href="${pageContext.request.contextPath }/conf/showRefreh">发布会</a></li>
							<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
							<li><a
								href="${pageContext.request.contextPath }/news/showRefreh">新闻</a></li>
							<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
							<li><a
								href="${pageContext.request.contextPath }/video/showRefreh">视频</a></li>
							<li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
							<li class="dropdown m-menu-fw"><a href="#"
								data-toggle="dropdown" class="dropdown-toggle">产品 <span><i
										class="fa fa-angle-down"></i></span></a>
								<ul class="dropdown-menu">
									<li>
										<%--* 跳转页面  产品页面 --%>
										<div class="m-menu-content">
											<span><a
												href="${pageContext.request.contextPath }/product/showProducts?type=phone"
												class="dropdown-header">手机</a></span>&nbsp; <span><a
												href="${pageContext.request.contextPath }/product/showProducts?type=computer"
												class="dropdown-header">电脑</a></span>&nbsp; <span><a
												href="${pageContext.request.contextPath }/product/showProducts?type=other"
												class="dropdown-header">其他</a></span>&nbsp;
										</div>
									</li>
								</ul></li>
						</ul>
					</div>
					<!-- .navbar-collapse -->
				</div>
				<!-- .container -->
			</nav>
			<!-- .nav -->
		</div>
		<!-- .navigation-section -->
	</div>
	<!-- .container -->
</section>