<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>TECH-首页</title>
<!-- favicon -->
<link href="assets/img/favicon.png" rel="icon" />
<!-- web-fonts -->
<link
	href='https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,500'
	rel='stylesheet' type='text/css' />
<!-- Bootstrap -->
<link href="assets/css/bootstrap.min.css" rel="stylesheet" />
<!-- font-awesome -->
<link href="assets/fonts/font-awesome/font-awesome.min.css"
	rel="stylesheet" />
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
		<div id="preloader">
			<div id="status">
				<div class="status-mes"></div>
			</div>
		</div>
		<!-- preloader -->
		<div class="uc-mobile-menu-pusher">
			<div class="content-wrapper">

				<%@ include file="component/header.jsp"%>
				<!-- header_section_wrapper -->

				<section id="feature_news_section" class="feature_news_section">
				<div class="container">
					<div class="row">
						<div class="col-md-7">
							<div class="feature_article_wrapper">
								<div class="feature_article_img">
									<%--* 图片 置顶发布会 --%>
									<img src="${conf.top.poster}"
										class="img-responsive top_static_article_img" width="955"
										height="832" />
								</div>
								<!-- feature_article_img -->
								<div class="feature_article_inner">
									<%-- 跳转页面 发布会 --%>
									<div class="tag_lg red">
										<a href="${pageContext.request.contextPath }/conf/showRefreh">发布会</a>
									</div>
									<%--* 跳转到当前发布会 显示当前发布会的详情 --%>
									<div class="feature_article_title">
										<h1>
											<a
												href="${pageContext.request.contextPath }/conf/showConference?id=${conf.top.id}">${conf.top.name}</a>
										</h1>
									</div>
									<!-- feature_article_title -->
									<div class="feature_article_date">${conf.top.address},
										${conf.top.date}</div>
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
									<img class="img-responsive" src="${news.top.image}"
										alt="feature-top" width="670" height="395" />
								</div>
								<!-- feature_article_img -->
								<div class="feature_article_inner">
									<%-- 跳转 新闻页面 --%>
									<div class="tag_lg purple">
										<a href="#">新闻</a>
									</div>
									<%--* 跳转/显示 当前新闻详情 --%>
									<div class="feature_article_title">
										<h1>
											<a
												href="${pageContext.request.contextPath }/news/showNews?id=${news.top.id}">${news.top.title}</a>
										</h1>
									</div>
									<!-- feature_article_title -->
									<div class="feature_article_date">${news.top.author},
										${news.top.date}</div>
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
									<img src="${video.top.image}" class="img-responsive"
										alt="feature-top" width="670" height="395" />
								</div>
								<!-- feature_article_img -->
								<div class="feature_article_inner">
									<%-- 跳转 视频页面 --%>
									<div class="tag_lg blue">
										<a href="videos.xhtml">视频</a>
									</div>
									<div class="feature_article_title">
										<%--* 跳转/显示 当前视频详情 --%>
										<h1>
											<a
												href="${pageContext.request.contextPath }/video/showVideo?id=${video.top.id}">${video.top.title}</a>
										</h1>
									</div>
									<!-- feature_article_title -->
									<div class="feature_article_date">${news.top.author},
										${news.top.date}</div>
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
				<!-- container --> </section>
				<!-- Feature News Section -->

				<section id="category_section" class="category_section">
				<div class="container">
					<div class="row">
						<div class="col-md-8">
							<div class="category_section mobile">
								<div class="article_title header_purple">
									<%--* 跳转 产品页面-手机 --%>
									<h2>
										<a
											href="${pageContext.request.contextPath }/product/showProducts?type=phone"
											target="_self">手机</a>
									</h2>

								</div>
								<!-- article_title -->
								<div class="category_article_wrapper">
									<div class="row">
										<%--* 打印 产品-手机 --%>
										<c:forEach var="i" begin="0" end="1">
											<div class="col-md-6">
												<div class="category_article_body">
													<div class="top_article_img">
														<a
															href="${pageContext.request.contextPath }/product/showProduct?id=${product.getTop_phone(i).id}"
															target="_self"> <img class="img-responsive"
															src="${product.getTop_phone(i).image}" alt="feature-top"
															height="700" width="520" />
														</a>
													</div>
													<!-- top_article_img -->
													<span class="tag pink">热销</span>

													<div class="category_article_title">
														<h2>
															<a
																href="${pageContext.request.contextPath }/product/showProduct?id=${product.getTop_phone(i).id}"
																target="_self"> ${product.getTop_phone(i).name}</a>
														</h2>
													</div>
													<!-- category_article_title -->
													<div class="article_date">${product.getTop_phone(i).date}
														, by: ${product.getTop_phone(i).brand}</div>
													<!--article_date-->
													<div class="category_article_content">
														${product.getTop_phone(i).sketch}</div>
													<!-- category_article_content -->
													<div class="media_social">
														<span><a href="#"><i class="fa fa-share-alt"></i>424
														</a> Shares</span> <span><i class="fa fa-comments-o"></i><a
															href="#">4</a> Comments</span>
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
								<p class="divider">
									<a
										href="${pageContext.request.contextPath }/product/showProducts?type=phone">更多&#xA0;&#171;</a>
								</p>
							</div>
							<!-- Phone Section -->

							<div class="category_section tablet">
								<div class="article_title header_pink">
									<%--* 跳转 产品页面-电脑 --%>
									<h2>
										<a
											href="${pageContext.request.contextPath }/product/showProducts?type=computer"
											target="_self">电脑</a>
									</h2>
								</div>
								<!-- Mobile News Section -->

								<div class="category_article_wrapper">
									<div class="row">
										<%--* 打印 产品-电脑 --%>
										<c:forEach var="i" begin="0" end="1">
											<div class="col-md-6">
												<div class="category_article_body">
													<div class="top_article_img">
														<a
															href="${pageContext.request.contextPath }/product/showProduct?id=${product.getTop_computer(i).id}"
															target="_self"> <img class="img-responsive"
															src="${product.getTop_computer(i).image}" height="700"
															width="520" alt="feature-top" />
														</a>
													</div>
													<!-- top_article_img -->
													<span class="tag pink">热销</span>
													<div class="category_article_title">
														<h2>
															<a
																href="${pageContext.request.contextPath }/product/showProduct?id=${product.getTop_computer(i).id}"
																target="_self"> ${product.getTop_computer(i).name}</a>
														</h2>
													</div>
													<!-- category_article_title -->
													<div class="article_date">${product.getTop_computer(i).date}
														, by: ${product.getTop_computer(i).brand}</div>
													<!--article_date-->
													<div class="category_article_content">${product.getTop_computer(i).sketch}</div>
													<!-- category_article_content -->
													<div class="media_social">
														<span><a href="#"><i class="fa fa-share-alt"></i>424
														</a> Shares</span> <span><i class="fa fa-comments-o"></i><a
															href="#">4</a> Comments</span>
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
								<p class="divider">
									<a
										href="${pageContext.request.contextPath }/product/showProducts?type=computer">更多&#xA0;&#171;</a>
								</p>
							</div>
							<!-- Computers Section -->

							<div class="category_section gadget">
								<div class="article_title header_black">
									<%--* 跳转 产品页面-其他 --%>
									<h2>
										<a
											href="${pageContext.request.contextPath }/product/showProducts?type=other"
											target="_self">其他</a>
									</h2>
								</div>
								<div class="category_article_wrapper">
									<div class="row">
										<%--* 打印 置顶产品 --%>
										<c:forEach var="i" begin="0" end="1">
											<div class="col-md-6">
												<div class="category_article_body">
													<div class="top_article_img">
														<a
															href="${pageContext.request.contextPath }/product/showProduct?id=${product.getTop_other(i).id}"
															target="_self"> <img class="img-responsive"
															src="${product.getTop_other(i).image}" alt="feature-top"
															height="700" width="520" />
														</a>
													</div>
													<!-- top_article_img -->
													<span class="tag pink">热销</span>
													<div class="category_article_title">
														<h2>
															<a
																href="${pageContext.request.contextPath }/product/showProduct?id=${product.getTop_other(i).id}"
																target="_self"> ${product.getTop_other(i).name}</a>
														</h2>
													</div>
													<!-- category_article_title -->
													<div class="article_date">${product.getTop_other(i).date}
														, by: ${product.getTop_other(i).brand}</div>
													<!-- article_date -->
													<div class="category_article_content">${product.getTop_other(i).sketch}</div>
													<!-- category_article_content -->
													<div class="media_social">
														<span><a href="#"><i class="fa fa-share-alt"></i>424
														</a> Shares</span> <span><i class="fa fa-comments-o"></i><a
															href="#">4</a> Comments</span>
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
									<p class="divider">
										<a
											href="${pageContext.request.contextPath }/product/showProducts?type=other">更多&#xA0;&#171;</a>
									</p>
								</div>
								<!-- Gadget News Section -->
							</div>
							<!-- Others Section -->
						</div>
						<!-- Left Section -->

						<div class="col-md-4">
							<%@ include file="component/popular_news.jsp"%>
							<!-- Popular News -->

							<div class="widget hidden-xs m30">
								<img class="img-responsive adv_img"
									src="assets/img/right_add1.jpg" alt="add_one" /> <img
									class="img-responsive adv_img" src="assets/img/right_add2.jpg"
									alt="add_one" /> <img class="img-responsive adv_img"
									src="assets/img/right_add3.jpg" alt="add_one" /> <img
									class="img-responsive adv_img" src="assets/img/right_add4.jpg"
									alt="add_one" />
							</div>
							<!-- Advertisement -->

							<div class="widget hidden-xs m30">
								<img class="img-responsive widget_img"
									src="assets/img/right_add5.jpg" alt="add_one" />
							</div>
							<!-- Advertisement -->
							<%@ include file="component/popular_videos.jsp"%>
							<!-- Popular Videos -->
						</div>
						<!-- Right Section -->
					</div>
					<!-- Row -->
				</div>
				<!-- Container --> </section>
				<!-- Category News Section -->
			</div>
			<!-- #content-wrapper -->
		</div>
		<!-- .offcanvas-pusher -->
		<a href="#" class="crunchify-top" style="display: block;"><i
			class="fa fa-angle-up" aria-hidden="true"></i></a>
	</div>
	<!-- #main-wrapper -->

	<%@ include file="component/footer.jsp"%>
	<!-- footer -->

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