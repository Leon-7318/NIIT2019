<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>TECH-视频</title>
<!-- web-fonts -->
<link
	href='https://fonts.googleapis.com/css?family=Roboto:100,300,400,700,500'
	rel='stylesheet' type='text/css' />
<!-- favicon -->
<link href="../assets/img/favicon.png" rel="icon" />
<!-- Bootstrap -->
<link href="../assets/css/bootstrap.min.css" rel="stylesheet" />
<!--font-awesome-->
<link href="../assets/fonts/font-awesome/font-awesome.min.css"
	rel="stylesheet" />
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
		<div id="preloader">
			<div id="status">
				<div class="status-mes"></div>
			</div>
		</div>
		<!-- preloader -->
		<div class="uc-mobile-menu-pusher">
			<div class="content-wrapper">
				<%@ include file="../component/header.jsp"%>
				<!-- header_section_wrapper -->

				<section class="breadcrumb_section">
				<div class="container">
					<div class="row">
						<ol class="breadcrumb">
							<li><a href="${pageContext.request.contextPath}/front/home">首页</a></li>
							<li><a
								href="${pageContext.request.contextPath}/video/showRefreh">视频</a></li>
						</ol>
					</div>
				</div>
				</section>

				<div class="container">
					<div class="row">
						<div class="col-md-8">
							<div class="entity_wrapper">
								<div class="entity_title header_purple">
									<a
										href="${pageContext.request.contextPath}/video/showVideo?id=${video.getTop(0).id}"
										target="_blank">
										<h1>${video.getTop(0).title}</h1>
									</a>
								</div>
								<div class="entity_thumb">
									<video src="${video.getTop(0).url}" alt="ææ¶æ æ³æ­æ¾"
										width="750" height="450" controls="controls"></video>
								</div>
								<div class="entity_content">${video.getTop(0).sketch}</div>
								<div class="entity_meta">${video.getTop(0).date},by:
									${video.getTop(0).author}</div>
								<div class="entity_social">
									<span><i class="fa fa-share-alt"></i>424 <a href="#">Shares</a>
									</span> <span><i class="fa fa-comments-o"></i>4 <a href="#">Comments</a>
									</span>
								</div>
								<!-- entity_social -->
							</div>
							<!-- æ¨èè§é¢-->
							<c:forEach var="i" begin="0" end="${video.num-1}" step="2">
								<div class="widget_advertisement">
									<img class="img-responsive"
										src="../assets/img/category_advertisement.jpg"
										alt="feature-top" />
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="category_article_body">
											<div class="entity_thumb">
												<video src="${video.getNow(i).url}" alt="ææ¶æ æ³æ­æ¾"
													width="340" height="220" controls="controls"></video>
											</div>
											<div class="category_article_title">
												<h5>
													<a
														href="${pageContext.request.contextPath}/video/showVideo?id=${video.getNow(i).id}">${video.getNow(i).title}</a>
												</h5>
											</div>
											<div class="article_date">${video.getNow(i).date},by:
												${video.getNow(i).author}</div>
											<div class="category_article_content">
												${video.getNow(i).sketch}</div>
											<div class="article_social">
												<span><a href="#"><i class="fa fa-share-alt"></i>424
												</a> Shares</span> <span><i class="fa fa-comments-o"></i><a
													href="#">4</a> Comments</span>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="category_article_body">
											<div class="entity_thumb">
												<video src="${video.getNow(i+1).url}"
													alt="ææ¶æ æ³æ­æ¾" width="340" height="220"
													controls="controls"></video>
											</div>
											<div class="category_article_title">
												<h5>
													<a
														href="${pageContext.request.contextPath}/video/showVideo?id=${video.getNow(i+1).id}">${video.getNow(i+1).title}</a>
												</h5>
											</div>
											<div class="article_date">${video.getNow(i+1).date},
												by: ${video.getNow(i+1).author}</div>
											<div class="category_article_content">
												${video.getNow(i+1).sketch}</div>
											<div class="article_social">
												<span><a href="#"><i class="fa fa-share-alt"></i>424
												</a> Shares</span> <span><i class="fa fa-comments-o"></i><a
													href="#">4</a> Comments</span>
											</div>
										</div>
									</div>
								</div>
							</c:forEach>
							<nav aria-label="Page navigation" class="pagination_section">
							<ul class="pagination">
								<a href="${pageContext.request.contextPath}/video/previous"><button
										aria-label="Previous">上一页</button></a>&nbsp;
								<c:forEach var="i" begin="1" end="${video.page_num}">
									<a
										href="${pageContext.request.contextPath}/video/jumpTo?id=${i}"><button>${i}</button></a>&nbsp;
            </c:forEach>
								<a href="${pageContext.request.contextPath}/video/next"><button
										aria-label="Next" class="active">下一页</button></a>
							</ul>
							</nav>
							<!-- navigation -->
						</div>
						<!-- col-md-8 -->
						<div class="col-md-4">
							<%@ include file="../component/popular_news.jsp"%>
							<!-- Popular News -->
							<%@ include file="../component/advertisement_1.jsp"%>
							<!-- Advertisement_1-->
							<%@ include file="../component/advertisement_2.jsp"%>
							<!-- Advertisement_2-->
							<%@ include file="../component/popular_videos.jsp"%>
							<!-- Popular Videos -->
							<%@ include file="../component/advertisement_3.jsp"%>
							<!-- Advertisement_3-->
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
		<a href="#" class="crunchify-top" style="display: block;"><i
			class="fa fa-angle-up" aria-hidden="true"></i></a>
	</div>
	<!-- #main-wrapper -->

	<%@ include file="../component/footer.jsp"%>
	<!-- footer -->

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
