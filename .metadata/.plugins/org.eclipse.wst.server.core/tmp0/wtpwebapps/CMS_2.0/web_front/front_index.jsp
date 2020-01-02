<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1"/>
<title>TECH-首页</title>
    <!-- favicon -->
    <link href="assets/img/favicon.png" rel="icon" />
    <!-- web-fonts -->
    <link href='https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,500' rel='stylesheet' type='text/css' />
    <!-- Bootstrap -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
    <!-- font-awesome -->
    <link href="assets/fonts/font-awesome/font-awesome.min.css" rel="stylesheet" />
    <!-- Mobile Menu Style -->
    <link href="assets/css/mobile-menu.css" rel="stylesheet" />
    <!-- Owl carousel -->
    <link href="assets/css/owl.carousel.css" rel="stylesheet" />
    <link href="assets/css/owl.theme.default.min.css" rel="stylesheet" />
    <!-- Theme Style -->
    <link href="assets/css/style.css" rel="stylesheet" />
</head>
    
<body id="page-top" data-spy="scroll" data-target=".navbar">
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
                            <a href="#"><img src="assets/img/logo.png" alt="Tech NewsLogo" /></a>
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
    <!-- header_section_wrapper -->

    <section id="feature_news_section" class="feature_news_section">
        <div class="container">
            <div class="row">
                <div class="col-md-7">
                    <div class="feature_article_wrapper">
                        <div class="feature_article_img">
<%--* 图片 置顶发布会 --%>
                            <img src="${conf.top.poster}" class="img-responsive top_static_article_img" width="955" height="832"/>
                        </div>
                        <!-- feature_article_img -->
                        <div class="feature_article_inner">
<%-- 跳转页面 发布会 --%>
                            <div class="tag_lg red"><a href="${pageContext.request.contextPath }/conf/showRefreh">发布会</a></div>
<%--* 跳转到当前发布会 显示当前发布会的详情 --%>
                            <div class="feature_article_title">
                                <h1><a href="${pageContext.request.contextPath }/conf/showConference?id=${conf.top.id}">${conf.top.name}</a></h1>
                            </div>
                            <!-- feature_article_title -->
                            <div class="feature_article_date">${conf.top.address} , ${conf.top.date}</div>
                            <!-- feature_article_date -->
                            <div class="feature_article_content">${conf.top.sketch}</div>
                            <!-- feature_article_content -->
                            <div class="article_social">
                                <span><i class="fa fa-share-alt"></i><a href="#">424</a>分享</span>
                                <span><i class="fa fa-comments-o"></i><a href="#">4</a>评论</span>
                            </div>
                            <!-- article_social -->
                        </div>
                        <!-- feature_article_inner -->
                    </div>
                    <!-- feature_article_wrapper -->
                </div>
                <!-- col-md-7 -->
                <div class="col-md-5">
                    <div class="feature_static_wrapper">
                        <div class="feature_article_img">
<%--* 图片 置顶新闻 --%>
                            <img class="img-responsive" src="${news.top.image}" alt="feature-top" width="670" height="395"/>
                        </div>
                        <!-- feature_article_img -->
                        <div class=
                        "feature_article_inner">
<%-- 跳转 新闻页面 --%>
                            <div class="tag_lg purple"><a href="#">新闻</a></div>
<%--* 跳转/显示 当前新闻详情 --%>
                            <div class="feature_article_title">
                                <h1><a href="${pageContext.request.contextPath }/news/showNews?id=${news.top.id}">${news.top.title}</a></h1>
                            </div>
                            <!-- feature_article_title -->
                            <div class="feature_article_date">${news.top.author} , ${news.top.date}</div>
                            <!-- feature_article_date -->
                            <div class="feature_article_content">${news.top.sketch}</div>
                            <!-- feature_article_content -->
                            <div class="article_social">
                                <span><i class="fa fa-share-alt"></i><a href="#">424</a>分享</span>
                                <span><i class="fa fa-comments-o"></i><a href="#">4</a>评论</span>
                            </div>
                            <!-- article_social -->
                        </div>
                        <!-- feature_article_inner -->
                    </div>
                    <!-- feature_static_wrapper -->
                </div>
                <!-- col-md-5 -->
                <div class="col-md-5">
                    <div class="feature_static_last_wrapper">
                        <div class="feature_article_img">
<%--* 图片 置顶视频 --%>
                            <img src="${video.top.image}" class="img-responsive" alt="feature-top" width="670" height="395" />
                        </div>
                        <!-- feature_article_img -->
                        <div class="feature_article_inner">
<%-- 跳转 视频页面 --%>
                            <div class="tag_lg blue"><a href="videos.xhtml">视频</a></div>
                            <div class="feature_article_title">
<%--* 跳转/显示 当前视频详情 --%>
                                <h1><a href="${pageContext.request.contextPath }/video/showVideo?id=${video.top.id}">${video.top.title}</a></h1>
                            </div>
                            <!-- feature_article_title -->
                            <div class="feature_article_date">${news.top.author} , ${news.top.date}</div>
                            <!-- feature_article_date -->
                            <div class="feature_article_content">${video.top.sketch}
                            </div>
                            <!-- feature_article_content -->
                            <div class="article_social">
                                <span><i class="fa fa-share-alt"></i><a href="#">424</a>分享</span>
                                <span><i class="fa fa-comments-o"></i><a href="#">4</a>评论</span>
                            </div>
                            <!-- article_social -->
                        </div>
                        <!-- feature_article_inner -->
                    </div>
                    <!-- feature_static_wrapper -->
                </div>
                <!-- col-md-5 -->
            </div>
            <!-- Row -->
        </div>
        <!-- container -->
    </section>
    <!-- Feature News Section -->

        <section id="category_section" class="category_section">
            <div class="container">
              <div class="row">
              <div class="col-md-8">
                      <div class="category_section mobile">
                          <div class="article_title header_purple">
<%--* 跳转 产品页面-手机 --%>
                              <h2><a href="${pageContext.request.contextPath }/product/showProducts?type=phone" target="_self">手机</a></h2>
                              
                          </div>
                          <!-- article_title -->
                          <div class="category_article_wrapper">
                              <div class="row">
<%--* 打印 产品-手机 --%>
                              <c:forEach var="i" begin="0" end="1">
                                  <div class="col-md-6">
                                      <div class="category_article_body">
                                          <div class="top_article_img">
                                              <a href="${pageContext.request.contextPath }/product/showProduct?id=${product.getTop_phone(i).id}" target="_self">
                                                  <img class="img-responsive" src="${product.getTop_phone(i).image}" alt="feature-top" height="700" width="520"/>
                                              </a>
                                          </div>
                                          <!-- top_article_img -->
                                          <span class="tag pink">热销</span>

                                          <div class="category_article_title">
                                              <h2><a href="${pageContext.request.contextPath }/product/showProduct?id=${product.getTop_phone(i).id}" target="_self">
                                                      ${product.getTop_phone(i).name}</a></h2>
                                          </div>
                                          <!-- category_article_title -->
                                          <div class="article_date">${product.getTop_phone(i).date} , by: ${product.getTop_phone(i).brand}</div>
                                          <!--article_date-->
                                          <div class="category_article_content"> ${product.getTop_phone(i).sketch} </div>
                                          <!-- category_article_content -->
                                          <div class="media_social">
                                              <span><a href="#"><i class="fa fa-share-alt"></i>424 </a> Shares</span>
                                              <span><i class="fa fa-comments-o"></i><a href="#">4</a> Comments</span>
                                          </div>
                                          <!-- media_social -->
                                      </div>
                                      <!-- category_article_body -->
                                  </div>
                                  <!-- col-md-6 -->
                              </c:forEach>
                              </div>
                              <!-- row -->
                          </div>
<%--* 跳转 产品页面-手机 --%>
                          <p class="divider"><a href="${pageContext.request.contextPath }/product/showProducts?type=phone">更多&#xA0;&#171;</a></p>
                          </div>
                          <!-- Phone Section -->

                      <div class="category_section tablet">
                          <div class="article_title header_pink">
<%--* 跳转 产品页面-电脑 --%>
                              <h2><a href="${pageContext.request.contextPath }/product/showProducts?type=computer" target="_self">电脑</a></h2>
                          </div>
                          <!-- Mobile News Section -->

                          <div class="category_article_wrapper">
                              <div class="row">
<%--* 打印 产品-电脑 --%>
                                  <c:forEach var="i" begin="0" end="1">
                                  <div class="col-md-6">
                                      <div class="category_article_body">
                                          <div class="top_article_img">
                                              <a href="${pageContext.request.contextPath }/product/showProduct?id=${product.getTop_computer(i).id}" target="_self">
                                                  <img class="img-responsive" src="${product.getTop_computer(i).image}" height="700" width="520" alt="feature-top" />
                                              </a>
                                          </div>
                                          <!-- top_article_img -->
                                          <span class="tag pink">热销</span>
                                          <div class="category_article_title">
                                              <h2><a href="${pageContext.request.contextPath }/product/showProduct?id=${product.getTop_computer(i).id}" target="_self">
                                                      ${product.getTop_computer(i).name}</a></h2>
                                          </div>
                                          <!-- category_article_title -->
                                          <div class="article_date">${product.getTop_computer(i).date} , by: ${product.getTop_computer(i).brand}</div>
                                          <!--article_date-->
                                          <div class="category_article_content">${product.getTop_computer(i).sketch}</div>
                                          <!-- category_article_content -->
                                          <div class="media_social">
                                              <span><a href="#"><i class="fa fa-share-alt"></i>424 </a> Shares</span>
                                              <span><i class="fa fa-comments-o"></i><a href="#">4</a> Comments</span>
                                          </div>
                                          <!-- media_social -->
                                      </div>
                                      <!-- category_article_body -->
                                  </div>
                                  <!-- col-md-6 -->
                                  </c:forEach>
                              </div>
                              <!-- row -->
                          </div>
                          <!-- category_article_wrapper -->
<%--* 跳转 产品页面-电脑 --%>
                          <p class="divider"><a href="${pageContext.request.contextPath }/product/showProducts?type=computer">更多&#xA0;&#171;</a></p>
                      </div>
                      <!-- Computers Section -->

                      <div class="category_section gadget">
                          <div class="article_title header_black">
<%--* 跳转 产品页面-其他 --%>
                              <h2><a href="${pageContext.request.contextPath }/product/showProducts?type=other" target="_self">其他</a></h2>
                          </div>
                          <div class="category_article_wrapper">
                              <div class="row">
<%--* 打印 置顶产品 --%>
                                  <c:forEach var="i" begin="0" end="1">
                                      <div class="col-md-6">
                                      <div class="category_article_body">
                                          <div class="top_article_img">
                                              <a href="${pageContext.request.contextPath }/product/showProduct?id=${product.getTop_other(i).id}" target="_self">
                                                  <img class="img-responsive" src="${product.getTop_other(i).image}" alt="feature-top" height="700" width="520"/>
                                              </a>
                                          </div>
                                          <!-- top_article_img -->
                                          <span class="tag pink">热销</span>
                                          <div class="category_article_title">
                                              <h2><a href="${pageContext.request.contextPath }/product/showProduct?id=${product.getTop_other(i).id}" target="_self">
                                                      ${product.getTop_other(i).name}</a></h2>
                                          </div>
                                          <!-- category_article_title -->
                                          <div class="article_date">${product.getTop_other(i).date} , by: ${product.getTop_other(i).brand}</div>
                                          <!-- article_date -->
                                          <div class="category_article_content">${product.getTop_other(i).sketch}</div>
                                          <!-- category_article_content -->
                                          <div class="media_social">
                                              <span><a href="#"><i class="fa fa-share-alt"></i>424 </a> Shares</span>
                                              <span><i class="fa fa-comments-o"></i><a href="#">4</a> Comments</span>
                                          </div>
                                          <!-- media_social -->
                                      </div>
                                      <!-- category_article_body -->
                                  </div>
                                  <!-- col-md-6 -->
                                  </c:forEach>
                              </div>
                              <!-- row -->
                          </div>
                          <div>
                          <!-- category_article_title -->
                          <!-- category_article_wrapper -->
<%--* 跳转 产品页面-其他 --%>
                          <p class="divider"><a href="${pageContext.request.contextPath }/product/showProducts?type=other">更多&#xA0;&#171;</a></p>
                      </div>
                      <!-- Gadget News Section -->
                      </div>
                      <!-- Others Section -->
                </div>
                <!-- Left Section -->

                <div class="col-md-4">
                    <div class="widget">
                        <div class="widget_title widget_black">
<%-- 跳转 新闻页面 --%>
                            <h2><a href="newss">新闻</a></h2>
                        </div>
<%--* 打印 置顶新闻 --%>
                        <c:forEach var="i" begin="0" end="3">
                            <div class="media">
                                <div class="media-left">
                                    <a href="${pageContext.request.contextPath }/news/showNews?id=${news.getNow(i).id}" target="_self">
                                        <img class="media-object" src="${news.getNow(i).image}" alt="Generic placeholder image" width="150" height="100" /></a>
                                </div>
                                <div class="media-body">
                                    <h3 class="media-heading">
                                        <a href="${pageContext.request.contextPath }/news/showNews?id=${news.getNow(i).id}" target="_self">${news.getNow(i).title}</a>
                                    </h3>
                                    <span class="media-date">${news.getNow(i).date} , by: ${news.getNow(i).author}</span>
                                    <div class="widget_article_social">
                                        <span><a href="#" target="_self"> <i class="fa fa-share-alt"></i>424</a> Shares</span> 
                                        <span><a href="#" target="_self"><i class="fa fa-comments-o"></i>4</a> Comments</span>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
<%-- 跳转 新闻页面 --%>
                        <p class="widget_divider"><a href="newss" target="_self">更多&#xA0;&#171;</a></p>
                    </div>
                    <!-- Popular News -->

                    <div class="widget hidden-xs m30">
                        <img class="img-responsive adv_img" src="assets/img/right_add1.jpg" alt="add_one" />
                        <img class="img-responsive adv_img" src="assets/img/right_add2.jpg" alt="add_one" />
                        <img class="img-responsive adv_img" src="assets/img/right_add3.jpg" alt="add_one" />
                        <img class="img-responsive adv_img" src="assets/img/right_add4.jpg" alt="add_one" />
                    </div>
                    <!-- Advertisement -->

                    <div class="widget hidden-xs m30">
                        <img class="img-responsive widget_img" src="assets/img/right_add5.jpg" alt="add_one" />
                    </div>
                    <!-- Advertisement -->

                    <div class="widget reviews m30">
                            <div class="widget_title widget_black">
<%-- 跳转 视频页面 --%>
                                <h2><a href="videos">视频</a></h2>
                            </div>
<%--* 打印置顶视频 --%>
                            <c:forEach var="i" begin="0" end="3">
                                <div class="media">
                                    <div class="media-left">
                                        <a href="${pageContext.request.contextPath }/video/showVideo?id=${video.getTop(i).id}" target="_self">
                                            <img class="media-object" src="${video.getTop(i).image}" alt="Generic placeholder image" width="150" height="100" /></a>
                                    </div>
                                    <div class="media-body">
                                        <h3 class="media-heading">
                                            <a href="${pageContext.request.contextPath }/video/showVideo?id=${video.getTop(i).id}" target="_self">${video.getTop(i).title}</a>
                                        </h3> 
                                        <span class="rating">
                                            <i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star"></i><i class="fa fa-star-half-full"></i>
                                        </span>
                                        <br/><span class="media-date">${video.getTop(i).date} , by: ${video.getTop(i).author}</span>
                                    </div>
                                </div>
                            </c:forEach>
<%-- 跳转 视频页面 --%>
                            <p class="widget_divider"><a href="videos" target="_self">更多&#xA0;&#171;</a></p>
                        </div>
                <!-- Reviews Videos -->
                </div>
                <!-- Right Section -->
                </div>
                <!-- Row -->
            </div>
            <!-- Container -->
        </section>
        <!-- Category News Section -->
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
    <script src="assets/js/jquery-2.1.4.min.js"></script>
    <!-- Bootstrap -->
    <script src="assets/js/bootstrap.min.js"></script>
    <!-- Theme Menu -->
    <script src="assets/js/mobile-menu.js"></script>
    <!-- Owl carousel -->
    <script src="assets/js/owl.carousel.min.js"></script>
    <!-- Theme Script -->
    <script src="assets/js/script.js"></script>
</body>

</html>