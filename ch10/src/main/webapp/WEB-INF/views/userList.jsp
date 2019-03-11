<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>UserList</title>
	</head>
	<body>
		<h1>회원출력</h1>
		<table border="1">
		<tr>
			<td>번호</td>
			<td>아이디</td>
			<td>이름</td>
			<td>전화번호</td>
			<td>주소</td>
			<td>직책</td>
			<td>부서</td>
			<td>시간</td>
		</tr>
		<c:forEach var="user" items="${userList}">
		<tr>
			<td>${user.seq }</td>
			<td><a href="/ch10/userView/?seq=${user.seq}">${user.uid }</a></td>
			<td>${user.name }</td>
			<td>${user.hp }</td>
			<td>${user.addr }</td>
			<td>${user.pos }</td>
			<td>${user.dep }</td>
			<td>${user.rdate }</td>
		</tr>
		</c:forEach>
		</table>
	</body>
</html>