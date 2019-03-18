<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>글보기</title> 
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
			<h3>글보기</h3>
			<div class="view">
				<form action="#" method="post">
					<table>
						<tr>
							<td>제목</td>
							<td><input type="text" name="title" value="${boardVO.title}" readonly />
							</td>
						</tr>
						
						<tr>
							<td>첨부파일</td>
							<td>
								<a href="#">${newName}</a>
								<span>3회 다운로드</span>
							</td>
						</tr>
						
						<tr>
							<td>내용</td>
							<td>
								<textarea name="content" rows="20" readonly>${vo.content }</textarea>
							</td>
						</tr>
					</table>
					<div class="btns">
						<a href="#" class="cancel del">삭제</a>
						<a href="#" class="cancel mod">수정</a>
						<a href="#" class="cancel">목록</a>
					</div>
				</form>
			</div><!-- view 끝 -->
			
			<!-- 댓글리스트 -->
			<section class="comments">
				<h3>댓글목록</h3>
				
				<div class="comment">
					<span>
						<span>홍길동</span>
						<span>18-03-01</span>
					</span>
					<textarea>테스트 댓글입니다.</textarea>
					<div>
						<a href="#" class="del">삭제</a>
						<a href="/sboard/modify" class="mod">수정</a>
					</div>
				</div>
			
				<p class="empty">
					등록된 댓글이 없습니다.
				</p>
				
			</section>
			
			<!-- 댓글쓰기 -->
			<section class="comment_write">
				<h3>댓글쓰기</h3>
				<div>
					<form action="#" method="post">
						<textarea name="comment" rows="5"></textarea>
						<div class="btns">
							<a href="#" class="cancel">취소</a>
							<input type="submit" class="submit" value="작성완료" />
						</div>
					</form>
				</div>
			</section>
		</div><!-- board 끝 -->
	</body>

</html>










