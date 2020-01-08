<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>TECH-发布会</title>
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
				<%@ include file="../component/header.jsp"%>
				<!-- header_section_wrapper -->

				<section class="breadcrumb_section">
				<div class="container">
					<div class="row">
						<ol class="breadcrumb">
							<li><a href="${pageContext.request.contextPath}/front/home">首页</a></li>
							<li><a
								href="${pageContext.request.contextPath}/conf/showRefreh">发布会</a></li>
						</ol>
					</div>
				</div>
				</section>
				<div class="container">
					<div class="row">
						<div class="col-md-8">
							<%-- 打印发布会内容 --%>
							<c:forEach var="i" begin="0" end="${conf.num-1}" step="1">
								<div class="entity_wrapper">
									<div class="entity_title">
										<h1>
											<a
												href="${pageContext.request.contextPath}/conf/showConference?id=${conf.getNow(i).id}">${conf.getNow(i).name}</a>
										</h1>
									</div>
									<!-- entity_title -->
									<div class="entity_meta">${conf.getNow(i).date},by:
										${conf.getNow(i).author}</div>
									<!-- entity_meta -->
									<div class="rating">
										<i class="fa fa-star"></i><i class="fa fa-star"></i><i
											class="fa fa-star"></i><i class="fa fa-star"></i> <i
											class="fa fa-star-half-full"></i>
									</div>
									<!-- rating -->
									<div class="entity_social">
										<a href="#" class="icons-sm sh-ic"><i
											class="fa fa-share-alt"></i><b>424</b><span class="share_ic">Shares</span></a>
										<a href="#" class="icons-sm fb-ic"><i
											class="fa fa-facebook"></i></a> <a href="#"
											class="icons-sm tw-ic"><i class="fa fa-twitter"></i></a> <a
											href="#" class="icons-sm inst-ic"><i
											class="fa fa-google-plus"> </i></a> <a href="#"
											class="icons-sm tmb-ic"><i class="fa fa-ge"> </i></a> <a
											href="#" class="icons-sm rss-ic"><i class="fa fa-rss">
										</i></a> <span class="arrow">&#187;</span>
									</div>
									<!-- entity_social -->
									<div class="entity_thumb">
										<a
											href="${pageContext.request.contextPath}/conf/showConference?id=${conf.getNow(i).id}">
											<img class="img-responsive" src="${conf.getNow(i).poster}"
											alt="feature-top" />
										</a>
									</div>
									<div class="entity_content">
										<a
											href="${pageContext.request.contextPath}/conf/showConference?id=${conf.getNow(i).id}"><p>${conf.getNow(i).sketch}</p></a>
									</div>
								</div>
								<br />
							</c:forEach>
							<nav aria-label="Page navigation" class="pagination_section">
							<ul class="pagination">
								<a href="${pageContext.request.contextPath}/conf/previous">
									<button class="active">上一页</button>
								</a>
								<c:forEach var="i" begin="1" end="${conf.page_num}">
									<a
										href="${pageContext.request.contextPath}/conf/jumpTo?id=${i}">
										<button>${i}</button>
									</a>&nbsp;
            					</c:forEach>
								<a href="${pageContext.request.contextPath}/conf/next">
									<button class="active">下一页</button>
								</a>
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
							<!-- Advertisement_3 -->
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
