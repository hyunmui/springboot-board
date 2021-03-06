<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="/jsp-view/common/header.jsp" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>게시글 상세</title>
<style>
form {
	width: 500px;
}

input, textarea, label {
	width: 100%;
}
</style>
</head>
<body>
	<form:form method="post" action="/post/write.do" modelAttribute="post">
		<form:hidden path="postId" />
		<form:label path="title">title</form:label>
		<form:input path="title" />
		<form:label path="content">content</form:label>
		<form:textarea path="content" rows="3"
			placeholder="enter the contents"></form:textarea>

		<button>write</button>
		<button type="reset" onclick="history.back(-1);">cancel</button>
	</form:form>
</body>
</html>