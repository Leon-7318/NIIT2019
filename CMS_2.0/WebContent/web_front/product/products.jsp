<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>TECH-产品</title>
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
        				<li><a href="${pageContext.request.contextPath }/login.jsp">Login</a></li>
                        <li><a href="${pageContext.request.contextPath }/front/back">Register</a></li>
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
                <li class="active"><a href="#">${product.type}</a></li>
            </ol>
        </div>
    </div>
</section>

<div class="container">
<div class="row">
<div class="col-md-8">
        <div class="entity_wrapper">
            <div class="entity_title header_purple">
                <h1>${product.type}</h1>
            </div>
            <!-- entity_title -->
            <div class="entity_thumb">
                <img class="img-responsive" src="${product.getTop(0).image}" alt="feature-top" />
            </div>
            <!-- entity_thumb -->
            <div class="entity_title">
                <a href="${pageContext.request.contextPath}/product/showProduct?id=${product.getTop(0).id}" target="_blank">
                    <h3> ${product.getTop(0).name} </h3></a>
            </div>
            <!-- entity_title -->
            <div class="entity_meta">
                ${product.getTop(0).date}, by: ${product.getTop(0).brand}
            </div>
            <!-- entity_meta -->
            <div class="entity_content">${product.getTop(0).sketch}</div>
            <!-- entity_content -->
            <div class="entity_social">
                <span><i class="fa fa-share-alt"></i>424 <a href="#">Shares</a> </span>
                <span><i class="fa fa-comments-o"></i>4 <a href="#">Comments</a> </span>
            </div>
            <!-- entity_social -->
        </div>
        <!-- 推荐产品-->
    <c:forEach var="i" begin="0" end="${product.num-1}" step="2">
        <div class="widget_advertisement">
            <img class="img-responsive" src="../assets/img/category_advertisement.jpg" alt="feature-top" />
        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="category_article_body">
                    <div class="top_article_img">
                        <img class="img-responsive" src="${product.getNow(i).image}" alt="feature-top" />
                    </div>
                    <div class="category_article_title">
                        <h5><a href="${pageContext.request.contextPath}/product/showProduct?id=${product.getTop(i).id}" target="_blank">${product.getNow(i).name}</a></h5>
                    </div>
                    <div class="article_date">
                        ${product.getNow(i).date}, by: ${product.getNow(i).brand}
                    </div>
                    <div class="category_article_content"> ${product.getNow(i).sketch} </div>
                    <div class="article_social">
                        <span><a href="#"><i class="fa fa-share-alt"></i>424 </a> Shares</span>
                        <span><i class="fa fa-comments-o"></i><a href="#">4</a> Comments</span>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="category_article_body">
                    <div class="top_article_img">
                        <img class="img-responsive" src="${product.getNow(i+1).image}" alt="feature-top" />
                    </div>
                    <div class="category_article_title">
                        <h5><a href="${pageContext.request.contextPath}/product/showProduct?id=${product.getTop(i+1).id}" target="_blank">${product.getNow(i+1).name}</a></h5>
                    </div>
                    <div class="article_date">
                        ${product.getNow(i+1).date}, by: ${product.getNow(i+1).brand}
                    </div>
                    <div class="category_article_content"> ${product.getNow(i+1).sketch} </div>
                    <div class="article_social">
                        <span><a href="#"><i class="fa fa-share-alt"></i>424 </a> Shares</span>
                        <span><i class="fa fa-comments-o"></i><a href="#">4</a> Comments</span>
                    </div>
                </div>
            </div>
        </div>
    </c:forEach>
    <nav aria-label="Page navigation" class="pagination_section">
        <ul class="pagination">
            <a href="${pageContext.request.contextPath}/product/previous" ><button aria-label="Previous">上一页</button></a>&nbsp;
            <c:forEach var="i" begin="1" end="${product.page_num}">
                <a href="${pageContext.request.contextPath}/product/jumpTo?id=${i}"><button>${i}</button></a>&nbsp;
            </c:forEach>
            <a href="${pageContext.request.contextPath}/product/next"><button aria-label="Next" class="active">下一页</button></a>
        </ul>
    </nav>
    <!-- navigation -->
</div>
<!-- col-md-8 -->
<div class="col-md-4">
    <div class="widget">
        <div class="widget_title widget_black">
            <h2><a href="${pageContext.request.contextPath}/news/showRefreh">新闻</a></h2>
        </div>
        <c:forEach var="i" begin="0" end="3">
            <div class="media">
                <div class="media-left">
                    <a href="${pageContext.request.contextPath}/news/showNews?id=${news.getNow(i).id}" target="_self">
                        <img class="media-object" src="${news.getNow(i).image}" alt="Generic placeholder image" width="150" height="100" /></a>
                </div>
                <div class="media-body">
                    <h3 class="media-heading">
                        <a href="${pageContext.request.contextPath}/news/showNews?id=${news.getNow(i).id}" target="_self">${news.getNow(i).title}</a>
                    </h3>
                    <span class="media-date">${news.getNow(i).date} , by: ${news.getNow(i).author}</span>
                    <div class="widget_article_social">
                        <span><a href="#" target="_self"> <i class="fa fa-share-alt"></i>424</a> Shares</span> 
                        <span><a href="#" target="_self"><i class="fa fa-comments-o"></i>4</a> Comments</span>
                    </div>
                </div>
            </div>
        </c:forEach>
        <p class="widget_divider"><a href="${pageContext.request.contextPath}/news/showRefreh" target="_self">更多&#xA0;&#171;</a></p>
    </div>
    <!-- Popular News -->

    <div class="widget hidden-xs m30">
        <img class="img-responsive adv_img" src="../assets/img/right_add1.jpg" alt="add_one" />
        <img class="img-responsive adv_img" src="../assets/img/right_add2.jpg" alt="add_one" />
        <img class="img-responsive adv_img" src="../assets/img/right_add3.jpg" alt="add_one" />
        <img class="img-responsive adv_img" src="../assets/img/right_add4.jpg" alt="add_one" />
    </div>
    <!-- Advertisement -->

    <div class="widget hidden-xs m30">
        <img class="img-responsive widget_img" src="../assets/img/right_add5.jpg" alt="add_one" />
    </div>
    <!-- Advertisement -->

    <div class="widget reviews m30">
        <div class="widget_title widget_black">
            <h2><a href="${pageContext.request.contextPath}/video/showRefreh">视频</a></h2>
        </div>
        <c:forEach var="i" begin="0" end="3">
            <div class="media">
                <div class="media-left">
                    <a href="${pageContext.request.contextPath}/video/showVideo?id=${video.getTop(i)}" target="_self">
                        <img class="media-object" src="${video.getTop(i).image}" alt="Generic placeholder image" width="150" height="100" /></a>
                </div>
                <div class="media-body">
                    <h3 class="media-heading">
                        <a href="${pageContext.request.contextPath}/video/showVideo?id=${video.getTop(i)}" target="_self">${video.getTop(i).title}</a>
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

    <div class="widget hidden-xs m30">
        <img class="img-responsive widget_img" src="../assets/img/right_add6.jpg" alt="add_one" />
    </div>
    <!-- Advertisement -->
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
