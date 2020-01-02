<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>TECH-视频</title>
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
<%--* 跳转 登陆注册页面 --%>	
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
                                          <input name="key" type="text" class="form-control" placeholder="请输入关键字" ></input>    
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
                <li><a href="${pageContext.request.contextPath}/video/showRefreh">视频</a></li>
            </ol>
        </div>
    </div>
</section>

<div class="container">
<div class="row">
<div class="col-md-8">
        <div class="entity_wrapper">
            <div class="entity_title header_purple">
                 <a href="${pageContext.request.contextPath}/video/showVideo?id=${video.getTop(0).id}" target="_blank">
                    <h1> ${video.getTop(0).title} </h1></a>
            </div>
            <div class="entity_thumb">
                <video src="${video.getTop(0).url}" alt="ææ¶æ æ³æ­æ¾" width="750" height="450" controls="controls"></video>
            </div>
            <div class="entity_content">${video.getTop(0).sketch}</div>
            <div class="entity_meta">${video.getTop(0).date}, by: ${video.getTop(0).author}</div>
            <div class="entity_social">
                <span><i class="fa fa-share-alt"></i>424 <a href="#">Shares</a> </span>
                <span><i class="fa fa-comments-o"></i>4 <a href="#">Comments</a> </span>
            </div>
            <!-- entity_social -->
        </div>
        <!-- æ¨èè§é¢-->
    <c:forEach var="i" begin="0" end="${video.num-1}" step="2">
        <div class="widget_advertisement">
            <img class="img-responsive" src="../assets/img/category_advertisement.jpg" alt="feature-top" />
        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="category_article_body">
                    <div class="entity_thumb">
                        <video src="${video.getNow(i).url}" alt="ææ¶æ æ³æ­æ¾" width="340" height="220" controls="controls"></video>
                    </div>
                    <div class="category_article_title">
                        <h5><a href="${pageContext.request.contextPath}/video/showVideo?id=${video.getNow(i).id}">${video.getNow(i).title}</a></h5>
                    </div>
                    <div class="article_date">
                        ${video.getNow(i).date}, by: ${video.getNow(i).author}        
                    </div>
                    <div class="category_article_content"> ${video.getNow(i).sketch} </div>
                    <div class="article_social">
                        <span><a href="#"><i class="fa fa-share-alt"></i>424 </a> Shares</span>
                        <span><i class="fa fa-comments-o"></i><a href="#">4</a> Comments</span>
                    </div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="category_article_body">
                    <div class="entity_thumb">
                        <video src="${video.getNow(i+1).url}" alt="ææ¶æ æ³æ­æ¾" width="340" height="220" controls="controls"></video>
                    </div>
                    <div class="category_article_title">
                        <h5><a href="${pageContext.request.contextPath}/video/showVideo?id=${video.getNow(i+1).id}">${video.getNow(i+1).title}</a></h5>
                    </div>
                    <div class="article_date">
                        ${video.getNow(i+1).date}, by: ${video.getNow(i+1).author}
                    </div>
                    <div class="category_article_content"> ${video.getNow(i+1).sketch} </div>
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
            <a href="${pageContext.request.contextPath}/video/previous" ><button aria-label="Previous">上一页</button></a>&nbsp;
            <c:forEach var="i" begin="1" end="${video.page_num}">
            	<a href="${pageContext.request.contextPath}/video/jumpTo?id=${i}"><button>${i}</button></a>&nbsp;
            </c:forEach>
            <a href="${pageContext.request.contextPath}/video/next"><button aria-label="Next" class="active">下一页</button></a>
        </ul>
    </nav>
    <!-- navigation -->
</div>
<!-- col-md-8 -->
<div class="col-md-4">
    <form>
        <div class="widget">
            <div class="widget_title widget_black">
                <h2><a href="${pageContext.request.contextPath}/news/showRefreh">新闻</a></h2>
            </div>
            <c:forEach var="i" begin="0" end="3">
                <div class="media">
                    <div class="media-left">
                        <a href="${news.showNews(news.getNow(i))}" target="_self">
                            <img class="media-object" src="${news.getNow(i).image}" alt="Generic placeholder image" width="150" height="100" /></a>
                    </div>
                    <div class="media-body">
                        <h3 class="media-heading">
                            <a href="${news.showNews(news.getNow(i))}" target="_self">${news.getNow(i).title}</a>
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
    </form>
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

    <form>
        <div class="widget">
            <div class="widget_title widget_black">
                <h2><a href="${pageContext.request.contextPath}/product/showProducts？type=phone">产品</a></h2>
            </div>
            <c:forEach var="i" begin="0" end="3">
                <div class="media">
                    <div class="media-left">
                        <a href="${product.showProduct(product.getNow(i))}" target="_self">
                            <img class="media-object" src="${product.getNow(i).image}" alt="Generic placeholder image" width="150" height="100" /></a>
                    </div>
                    <div class="media-body">
                        <h3 class="media-heading">
                            <a href="${product.showProduct(product.getNow(i))}" target="_self">${product.getNow(i).name}</a>
                        </h3>
                        <span class="media-date">${product.getNow(i).date} , by: ${product.getNow(i).brand}</span>
                        <div class="widget_article_social">
                            <span><a href="#" target="_self"> <i class="fa fa-share-alt"></i>424</a> Shares</span> 
                            <span><a href="#" target="_self"><i class="fa fa-comments-o"></i>4</a> Comments</span>
                        </div>
                    </div>
                </div>
            </c:forEach>
            <p class="widget_divider"><a href="${pageContext.request.contextPath}/product/showProducts？type=phone" target="_self">更多&#xA0;&#171;</a></p>
        </div>
    </form>
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
                    <div class="col-sm-6"> <p>Copyright Â© 2019. Leon .</p></div>
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
