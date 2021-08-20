<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="sp" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<sp:forEach items="${ posts }" var="post">
			<li>${ post.title }/ ${ post.content }</li>
		</sp:forEach>
	</ul>
</body>
</html>