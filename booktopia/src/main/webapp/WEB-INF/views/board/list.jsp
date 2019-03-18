<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>글목록</title> 
		<link href="/booktopia/resources/css/style.css" rel="stylesheet" type="text/css" media="screen">
  <link href="/booktopia/resources/css/basic-jquery-slider.css" rel="stylesheet" type="text/css" media="screen">
  <link href="/booktopia/resources/css/mobile.css" rel="stylesheet" type="text/css">
  <script src="/booktopia/resources/js/jquery-1.6.2.min.js" type="text/javascript"></script>
  <script src="/booktopia/resources/js/jquery.easing.1.3.js" type="text/javascript"></script>
  <script src="/booktopia/resources/js/stickysidebar.jquery.js" type="text/javascript"></script>
  <script src="/booktopia/resources/js/basic-jquery-slider.js" type="text/javascript"></script>
  <script src="/booktopia/resources/js/tabs.js" type="text/javascript"></script>
  <script src="/booktopia/resources/js/carousel.js" type="text/javascript"></script>
	</head>
	<body>
		<div id="board">
			<h3>글목록</h3>
			<!-- 리스트 -->
			<div class="list">
				<p class="logout">${member.getName()} 반갑습니다. <a href="/sboard/member/logout">[로그아웃]</a><p>
				<table>
					<tr>
						<td>번호</td>
						<td>제목</td>
						<td>글쓴이</td>
						<td>날짜</td>
						<td>조회</td>
					</tr>
					<c:forEach var="vo" items="${list}">
					<tr>
						<td>${count=count-1}</td>
						<td><a href="/sboard/view?seq=${vo.seq}">${vo.title}</a>&nbsp;${vo.comment}</td>
						<td>${vo.nick}</td>
						<td>${vo.rdate.substring(2, 10)}</td>
						<td>${vo.hit}</td>
					</tr>
					</c:forEach>
				</table>
			</div>
			<!-- 페이징 -->
			<nav class="paging">
				<span> 
				<c:if test="${groupStartEnd[0] > 1 }">
					<a href="#" class="prev">이전</a>
				</c:if>
				<c:forEach var="i" begin="${groupStartEnd[0]}" end="${groupStartEnd[1] }">
					<a href="/sboard/list?pg=${i }" class="num">${i }</a>
				</c:forEach>
				<c:if test="${groupStartEnd[0] < 1 }">
					<a href="#" class="next">다음</a>
				</c:if>
				</span>
			</nav>
			<a href="/sboard/write" class="btnWrite">글쓰기</a>
		</div>
	</body>

</html>










