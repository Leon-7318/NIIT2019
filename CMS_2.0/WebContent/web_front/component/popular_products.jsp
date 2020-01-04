<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="widget">
	<div class="widget_title widget_black">
		<h2><a href="${pageContext.request.contextPath}/product/showProducts?type=phone">产品</a></h2>
	</div>
	<c:forEach var="i" begin="0" end="3">
		<div class="media">
			<div class="media-left">
				<a href="${pageContext.request.contextPath}/product/showProduct?id=${product.getNow(i).id}" target="_self"> <img class="media-object" src="${product.getNow(i).image}" alt="Generic placeholder image" width="150" height="100" /></a>
			</div>
			<div class="media-body">
				<h3 class="media-heading">
					<a href="${pageContext.request.contextPath}/product/showProduct?id=${product.getNow(i).id}" target="_self">${product.getNow(i).name}</a>
				</h3>
				<span class="media-date">${product.getNow(i).date} , by: ${product.getNow(i).brand}</span>
				<div class="widget_article_social">
					<span><a href="#" target="_self"> <i class="fa fa-share-alt"></i>424
					</a> Shares</span> <span><a href="#" target="_self"><i class="fa fa-comments-o"></i>4</a> Comments</span>
				</div>
			</div>
		</div>
	</c:forEach>
	<p class="widget_divider">
		<a href="${pageContext.request.contextPath}/product/showProducts?type=phone" target="_self">更多&#xA0;&#171;</a>
	</p>
</div>
<!-- Popular Products -->