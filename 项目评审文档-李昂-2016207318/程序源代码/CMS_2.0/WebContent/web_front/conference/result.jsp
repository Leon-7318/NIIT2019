<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>TECH-发布会-查询结果</title>
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
								href="${pageContext.request.contextPath}/conf/showRefreh">发布会</a></li>
							<li><a href="#">查询结果</a></li>
						</ol>
					</div>
				</div>
				</section>

				<div class="container">
					<div class="row">
						<table>
							<c:forEach var="i" begin="0" end="${conf.res.size()-1}" step="3">
								<tr>
									<td>
										<div class="entity_wrapper">
											<div class="entity_title">
												<h1>
													<a
														href="${pageContext.request.contextPath}/conf/showConference?id=${conf.getRes(i).id}">${conf.getRes(i).name}</a>
												</h1>
											</div>
											<div class="entity_thumb">
												<a
													href="${pageContext.request.contextPath}/conf/showConference?id=${conf.getRes(i).id}">
													<img class="img-responsive" src="${conf.getRes(i).poster}"
													width="400" height="250" alt="feature-top" />
												</a>
											</div>
											<div class="entity_content">
												<a
													href="${pageContext.request.contextPath}/conf/showConference?id=${conf.getRes(i).id}"><p>${conf.getRes(i).sketch}</p></a>
											</div>
											<div class="entity_meta">${conf.getRes(i).date}, by:
												${conf.getRes(i).author}</div>
										</div>
									</td>
									<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
									<td>
										<div class="entity_wrapper">
											<div class="entity_title">
												<h1>
													<a
														href="${pageContext.request.contextPath}/conf/showConference?id=${conf.getRes(i+1).id}">${conf.getRes(i+1).name}</a>
												</h1>
											</div>
											<div class="entity_thumb">
												<a
													href="${pageContext.request.contextPath}/conf/showConference?id=${conf.getRes(i+1).id}">
													<img class="img-responsive"
													src="${conf.getRes(i+1).poster}" width="400" height="250"
													alt="feature-top" />
												</a>
											</div>
											<div class="entity_content">
												<a
													href="${pageContext.request.contextPath}/conf/showConference?id=${conf.getRes(i+1).id}"><p>${conf.getRes(i+1).sketch}</p></a>
											</div>
											<div class="entity_meta">${conf.getRes(i+1).date}, by:
												${conf.getRes(i+1).author}</div>
										</div>
									</td>
									<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
									<td>
										<div class="entity_wrapper">
											<div class="entity_title">
												<h1>
													<a
														href="${pageContext.request.contextPath}/conf/showConference?id=${conf.getRes(i+2).id}">${conf.getRes(i+2).name}</a>
												</h1>
											</div>
											<div class="entity_thumb">
												<a
													href="${pageContext.request.contextPath}/conf/showConference?id=${conf.getRes(i+2).id}">
													<img class="img-responsive"
													src="${conf.getRes(i+2).poster}" width="400" height="250"
													alt="feature-top" />
												</a>
											</div>
											<div class="entity_content">
												<a
													href="${pageContext.request.contextPath}/conf/showConference?id=${conf.getRes(i+2).id}"><p>${conf.getRes(i+2).sketch}</p></a>
											</div>
											<div class="entity_meta">${conf.getRes(i+2).date}, by:
												${conf.getRes(i+2).author}</div>
										</div>
									</td>
								</tr>
								<br />
							</c:forEach>
						</table>

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
