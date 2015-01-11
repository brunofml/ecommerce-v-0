<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello there man.

	<c:forEach var="user" items="${users}">
		<tr>
			<th><c:out value="${user.username}"></c:out></th>
			<th><c:out value="${user.email}"></c:out></th>
		</tr>
	</c:forEach>
</body>
</html>