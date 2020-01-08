<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="widget reviews m30">
	<div class="widget_title widget_black">
		<h2>
			<a href="${pageContext.request.contextPath}/video/showRefreh">视频</a>
		</h2>
	</div>
	<c:forEach var="i" begin="0" end="3">
		<div class="media">
			<div class="media-left">
				<a
					href="${pageContext.request.contextPath}/video/showVideo?id=${video.getTop(i).id}"
					target="_self"> <img class="media-object"
					src="${video.getTop(i).image}"
					alt="Generic placeholder image" width="150" height="100" /></a>
			</div>
			<div class="media-body">
				<h3 class="media-heading">
					<a
						href="${pageContext.request.contextPath}/video/showVideo?id=${video.getTop(i).id}"
						target="_self">${video.getTop(i).title}</a>
				</h3>
				<span class="rating"> <i class="fa fa-star"></i><i
					class="fa fa-star"></i><i class="fa fa-star"></i><i
					class="fa fa-star"></i><i class="fa fa-star-half-full"></i>
				</span> <br />
				<span class="media-date">${video.getTop(i).date} , by:
					${video.getTop(i).author}</span>
			</div>
		</div>
	</c:forEach>
	<p class="widget_divider">
		<a href="${pageContext.request.contextPath}/video/showRefreh"
			target="_self">更多&#xA0;&#171;</a>
	</p>
</div>
<!-- Popular Videos -->