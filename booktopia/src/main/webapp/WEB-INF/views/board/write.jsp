<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>글쓰기</title> 
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
			<h3>글쓰기</h3>
			<div class="write">
				<form action="/sboard/write" method="post" enctype="multipart/form-data">
					<table>
						<tr>
							<td>제목</td>
							<td><input type="text" name="title" placeholder="제목을 입력하세요." required /></td>
						</tr>				
						<tr>
							<td>내용</td>
							<td>
								<textarea name="content" rows="20" required></textarea>
							</td>
						</tr>
						<tr>
							<td>첨부</td>
							<td>
								<input type="file" name="fname" />
							</td>
						</tr>
					</table>
					<div class="btns">
						<a href="#" class="cancel">취소</a>
						<input type="submit" class="submit" value="작성완료" />
					</div>
				</form>
			</div>
		</div>
	</body>
</html>


