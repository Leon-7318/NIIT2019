<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="/static/bootstrap-3.3.5-dist/css/bootstrap.css">
</head>
<body>
<div class="container">
    <h1 class="text-center">上传文件撒</h1>
    <c:if test="${not empty message}">
        <h2>${message}</h2>
    </c:if>

<!--
    <p class="text-info">上传</p>
    <form:form enctype="multipart/form-data" action="${pageContext.request.contextPath }/upload/static">
        <input type="file" name="uploadFile">
        <button class="btn btn-default">提交</button>
    </form:form>
--> 
    <br><br><br>
    
    <form enctype="multipart/form-data" method="post" action="${pageContext.request.contextPath }/upload/static">
        <input type="file" name="uploadFile">
        <button class="btn btn-default">提交</button>
    </form>

</div>
</body>
</html>