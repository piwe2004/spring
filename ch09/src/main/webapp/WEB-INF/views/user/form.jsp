<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user</title>
	</head>
	<body>
		<h1>사용자 등록</h1>
		<form action="/ch09/user/regist.do" method="post">
			<table border="1">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="uid"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="hp"></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="addr"></td>
				</tr>
				<tr>
					<td>직책</td>
					<td><input type="text" name="pos"></td>
				</tr>
				<tr>
					<td>부서</td>
					<td><input type="text" name="dep"></td>
				</tr>
			</table>
			<input type="submit" value="전송"> 
		</form>
	</body>
</html>