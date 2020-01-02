<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>TECH-新闻-详情</title>
    <!-- web-fonts -->
    <link href='https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,500' rel='stylesheet' type='text/css' />
    <!-- favicon -->
    <link href="../assets/img/favicon.png" rel="icon" />
    <!-- Bootstrap -->
    <link href="../assets/css/bootstrap.min.css" rel="stylesheet" />
     <!--font-awesome--> 
    <link href="../assets/fonts/font-awesome/font-awesome.min.css" rel="stylesheet" />
     <!--Mobile Menu Style--> 
    <link href="../assets/css/mobile-menu.css" rel="stylesheet" />
     <!--Owl carousel--> 
    <link href="../assets/css/owl.carousel.css" rel="stylesheet" />
    <link href="../assets/css/owl.theme.default.min.css" rel="stylesheet" />
     <!--Theme Style--> 
    <link href="../assets/css/style.css" rel="stylesheet" />
</head>

<body id="page-top" pt:data-spy="scroll" pt:data-target=".navbar">
<div id="main-wrapper">
<!-- Page Preloader -->
<div id="preloader"><div id="status"><div class="status-mes"></div></div></div>
<!-- preloader -->
<div class="uc-mobile-menu-pusher">
<div class="content-wrapper">

<section id="header_section_wrapper" class="header_section_wrapper">
     <div class="container">
         <div class="header-section">
             <div class="row">
                 <div class="col-md-4">
                     <div class="left_section">
                         <span class="date">${util.getDateTime() }</span>
                      <!-- Date -->
                      <div class="social">
                          <a class="icons-sm fb-ic"><i class="fa fa-facebook"></i></a>
                          <a class="icons-sm tw-ic"><i class="fa fa-twitter"></i></a>
                          <a class="icons-sm inst-ic"><i class="fa fa-instagram"> </i></a>
                          <a class="icons-sm tmb-ic"><i class="fa fa-tumblr"> </i></a>
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
                          <li><a href="http://localhost:8085/CMS/login.xhtml">Login</a></li>
                          <li><a href="http://localhost:8085/CMS/reg.xhtml">Register</a></li>
                      </ul>
                      <!-- LogAndReg Section -->
                      <ul class="nav-cta hidden-xs">
                          <li class="dropdown"><a href="#" data-toggle="dropdown" class="dropdown-toggle"><i class="fa fa-search"></i></a>
                              <ul class="dropdown-menu"><li>
                                      <div class="head-search">
<%--* 搜索框 --%>
                                   	<form action="${pageContext.request.contextPath}/conf/searchByKey" method="post" >
                                          <div class="input-group">
                                          <input  name="key" type="text" class="form-control" placeholder="请输入关键字" ></input>    
                                              <span class="input-group-btn">
                                              	<input  type="submit" value="查询" class="btn btn-primary"></input>
                                              </span> 
                                          </div>
                                   	</form>   
                                      </div></li></ul></li>
                      </ul>
                      <!-- Search Section--> 
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
                          <li class="active"><a href="${pageContext.request.contextPath }/front/home">首页</a></li>
                          <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                          <li><a href="${pageContext.request.contextPath }/conf/showRefreh">发布会</a></li>
                          <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                          <li><a href="${pageContext.request.contextPath }/news/showRefreh">新闻</a></li>
                          <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                          <li><a href="${pageContext.request.contextPath }/video/showRefreh">视频</a></li>
                          <li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
                          <li class="dropdown m-menu-fw">
                              <a href="#" data-toggle="dropdown" class="dropdown-toggle">产品               
                              <span><i class="fa fa-angle-down"></i></span></a>
                              <ul class="dropdown-menu"> 	<li>
<%--* 跳转页面  产品页面 --%>
                                  <div class="m-menu-content">
                                      <span><a href="${pageContext.request.contextPath }/product/showProducts?type=phone"  class="dropdown-header">手机</a></span>&nbsp;
                                      <span><a href="${pageContext.request.contextPath }/product/showProducts?type=computer"  class="dropdown-header">电脑</a></span>&nbsp;
                                      <span><a href="${pageContext.request.contextPath }/product/showProducts?type=other"  class="dropdown-header">其他</a></span>&nbsp;
                                  </div></li>
                              </ul></li>
                      </ul>
                  </div>
              </div>
              <!-- .container -->
          </nav>
          <!-- .nav -->
      </div>
      <!-- .navigation-section -->
  </div>
  <!-- .container -->
</section>
<!-- header_section_wrapper -->


<section class="breadcrumb_section">
    <div class="container">
        <div class="row">
            <ol class="breadcrumb">
                <li><a href="${pageContext.request.contextPath}/front/home">首页</a></li>
                <li><a href="${pageContext.request.contextPath}/product/showProducts?type=phone">产品</a></li>
                <li><a href="#">详细参数</a></li>
            </ol>
        </div>
    </div>
</section>

<div class="container">
<div class="row">
<div class="col-md-8">
    <div class="entity_wrapper">
        <div class="entity_title">
            <h1>${product.temp_product.name}</h1>
        </div>
        <!-- entity_title -->
        <div class="entity_meta">${product.temp_product.date} , by: ${product.temp_product.brand}</div>
        <!-- entity_meta -->
        <div class="rating">
            <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i>
            <i class="fa fa-star-half-full"></i>
        </div>
        <!-- rating -->
        <div class="entity_thumb">
            <img class="img-responsive" src="${product.temp_product.image}" alt="feature-top"/>
        </div>
        <div class="entity_content">
            <p>${product.temp_product.sketch}</p>
        </div>
        <div>
            <table class="table-striped">
                <tr>
                  <td><b><c:out value="品牌 :"/></b></td>
                  <td>${product.temp_product.brand}"</td>
                  <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
                  <td><b><c:out value="价格 :"/></b></td>
                  <td>${product.temp_product.price}"</td>
                </tr>
               <tr>
                  <td><b><c:out value="处理器 :"/></b></td>
                  <td>${product.temp_product.cpu}"</td>
                  <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
                  <td><b><c:out value="尺寸 :"/></b></td>
                  <td>${product.temp_product.size}"</td>
                </tr>
                <tr>
                  <td><b><c:out value="运行内存 :"/></b></td>
                  <td>${product.temp_product.ram}"</td>
                  <td><b><c:out value="重量 :"/></b></td>
                  <td>${product.temp_product.weight}"</td>
                </tr>
                <tr>
                  <td><b><c:out value="存储空间 :"/></b></td>
                  <td>${product.temp_product.rom}"</td>
                  <td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
                  <td><b><c:out value="电池 :"/></b></td>
                  <td>${product.temp_product.battery}"</td>
                </tr>
              </table>
        </div>
    </div>
    <br/>
</div>
<!-- col-md-8 -->
<div class="col-md-4">
    <div class="widget reviews m30">
        <div class="widget_title widget_black">
            <h2><a href="${pageContext.request.contextPath}/video/showRefreh">视频</a></h2>
        </div>
        <c:forEach var="i" begin="0" end="3">
            <div class="media">
                <div class="media-left">
                    <a href="${pageContext.request.contextPath}/video/showVideo?id=${video.getTop(i).id}" target="_self">
                        <img class="media-object" src="${video.getTop(i).image}" alt="Generic placeholder image" width="150" height="100" /></a>
                </div>
                <div class="media-body">
                    <h3 class="media-heading">
                        <a href="${pageContext.request.contextPath}/video/showVideo?id=${video.getTop(i).id}" target="_self">${video.getTop(i).title}</a>
                    </h3> 
                    <span class="rating">
                        <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star-half-full"></i>
                    </span>
                    <br/><span class="media-date">${video.getTop(i).date} , by: ${video.getTop(i).author}</span>
                </div>
            </div>
        </c:forEach>
        <p class="widget_divider"><a href="${pageContext.request.contextPath}/video/showRefreh" target="_self">更多&#xA0;&#171;</a></p>
    </div>
    <!-- Reviews Videos -->

</div>
<!-- col-md-4 -->

</div>
<!-- row -->
</div>
<!-- container -->
</div>
<!-- #content-wrapper -->
</div>
<!-- .offcanvas-pusher -->
        <a href="#" class="crunchify-top" style="display: block;"><i class="fa fa-angle-up" aria-hidden="true"></i></a>
</div>
<!-- #main-wrapper -->
    <div class="footer_bottom_Section">
        <div class="container">
            <div class="row">
                <div class="footer">
                    <div class="col-sm-3">
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
                    </div>
                    <div class="col-sm-6"> <p>Copyright © 2019. Leon .</p></div>
                    <div class="col-sm-3"> <p>Technology News Magazine</p></div>
                </div>
            </div>
        </div>
    </div>
<!-- jquery Core-->
<script src="../assets/js/jquery-2.1.4.min.js"></script>
<!-- Bootstrap -->
<script src="../assets/js/bootstrap.min.js"></script>
<!-- Theme Menu -->
<script src="../assets/js/mobile-menu.js"></script>
<!-- Owl carousel -->
<script src="../assets/js/owl.carousel.min.js"></script>
<!-- Theme Script -->
<script src="../assets/js/script.js"></script>
</body>
</html>
