<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>TECH-新闻-详情</title>
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
								<div class="entity_meta">${product.temp_product.date}, by:
									${product.temp_product.brand}</div>
								<!-- entity_meta -->
								<div class="rating">
									<i class="fa fa-star"></i><i class="fa fa-star"></i><i
										class="fa fa-star"></i><i class="fa fa-star"></i> <i
										class="fa fa-star-half-full"></i>
								</div>
								<!-- rating -->
								<div class="entity_thumb">
									<img class="img-responsive" src="${product.temp_product.image}"
										alt="feature-top" />
								</div>
								<div class="entity_content">
									<p>${product.temp_product.sketch}</p>
								</div>
								<div>
									<table class="table-striped">
										<tr>
											<td><b><c:out value="品牌 :" /></b></td>
											<td>${product.temp_product.brand}"</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
											<td><b><c:out value="价格 :" /></b></td>
											<td>${product.temp_product.price}"</td>
										</tr>
										<tr>
											<td><b><c:out value="处理器 :" /></b></td>
											<td>${product.temp_product.cpu}"</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
											<td><b><c:out value="尺寸 :" /></b></td>
											<td>${product.temp_product.size}"</td>
										</tr>
										<tr>
											<td><b><c:out value="运行内存 :" /></b></td>
											<td>${product.temp_product.ram}"</td>
											<td><b><c:out value="重量 :" /></b></td>
											<td>${product.temp_product.weight}"</td>
										</tr>
										<tr>
											<td><b><c:out value="存储空间 :" /></b></td>
											<td>${product.temp_product.rom}"</td>
											<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
											<td><b><c:out value="电池 :" /></b></td>
											<td>${product.temp_product.battery}"</td>
										</tr>
									</table>
								</div>
							</div>
							<br />
						</div>
						<!-- col-md-8 -->
						<div class="col-md-4">
							<%@ include file="../component/popular_videos.jsp"%>
							<!-- Popular Videos -->
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
