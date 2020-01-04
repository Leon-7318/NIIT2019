<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>TECH-产品</title>
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
								href="${pageContext.request.contextPath}/product/showProducts?type=phone">产品</a></li>
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
									<img class="img-responsive" src="${product.getTop(0).image}"
										alt="feature-top" />
								</div>
								<!-- entity_thumb -->
								<div class="entity_title">
									<a
										href="${pageContext.request.contextPath}/product/showProduct?id=${product.getTop(0).id}"
										target="_blank">
										<h3>${product.getTop(0).name}</h3>
									</a>
								</div>
								<!-- entity_title -->
								<div class="entity_meta">${product.getTop(0).date},by:
									${product.getTop(0).brand}</div>
								<!-- entity_meta -->
								<div class="entity_content">${product.getTop(0).sketch}</div>
								<!-- entity_content -->
								<div class="entity_social">
									<span><i class="fa fa-share-alt"></i>424 <a href="#">Shares</a>
									</span> <span><i class="fa fa-comments-o"></i>4 <a href="#">Comments</a>
									</span>
								</div>
								<!-- entity_social -->
							</div>
							<!-- 推荐产品-->
							<c:forEach var="i" begin="0" end="${product.num-1}" step="2">
								<div class="widget_advertisement">
									<img class="img-responsive"
										src="../assets/img/category_advertisement.jpg"
										alt="feature-top" />
								</div>
								<div class="row">
									<div class="col-md-6">
										<div class="category_article_body">
											<div class="top_article_img">
												<img class="img-responsive" src="${product.getNow(i).image}"
													alt="feature-top" />
											</div>
											<div class="category_article_title">
												<h5>
													<a
														href="${pageContext.request.contextPath}/product/showProduct?id=${product.getNow(i).id}"
														target="_blank">${product.getNow(i).name}</a>
												</h5>
											</div>
											<div class="article_date">${product.getNow(i).date},
												by: ${product.getNow(i).brand}</div>
											<div class="category_article_content">
												${product.getNow(i).sketch}</div>
											<div class="article_social">
												<span><a href="#"><i class="fa fa-share-alt"></i>424
												</a> Shares</span> <span><i class="fa fa-comments-o"></i><a
													href="#">4</a> Comments</span>
											</div>
										</div>
									</div>
									<div class="col-md-6">
										<div class="category_article_body">
											<div class="top_article_img">
												<img class="img-responsive"
													src="${product.getNow(i+1).image}" alt="feature-top" />
											</div>
											<div class="category_article_title">
												<h5>
													<a
														href="${pageContext.request.contextPath}/product/showProduct?id=${product.getNow(i+1).id}"
														target="_blank">${product.getNow(i+1).name}</a>
												</h5>
											</div>
											<div class="article_date">${product.getNow(i+1).date},
												by: ${product.getNow(i+1).brand}</div>
											<div class="category_article_content">
												${product.getNow(i+1).sketch}</div>
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
								<a href="${pageContext.request.contextPath}/product/previous"><button
										aria-label="Previous">上一页</button></a>&nbsp;
								<c:forEach var="i" begin="1" end="${product.page_num}">
									<a
										href="${pageContext.request.contextPath}/product/jumpTo?id=${i}"><button>${i}</button></a>&nbsp;
            </c:forEach>
								<a href="${pageContext.request.contextPath}/product/next"><button
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
