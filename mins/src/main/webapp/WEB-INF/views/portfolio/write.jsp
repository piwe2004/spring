<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="kr.co.mins.vo.MemberVO"%>
<%

MemberVO member = (MemberVO)session.getAttribute("member");
if(member == null){
	
	response.sendRedirect("/mins/list?cate=portfolio");
}

%>
<%@ include file="../head.jsp" %>
      <article id="pg_board_wrap">
        <div id="nt_write">
	        <form action="/mins/write?cate=portfolio" method="post" enctype="multipart/form-data">
	        	<ul class="wt_ul">
	        		<li class="wt_li">
	        			<input type="checkbox" name="notice_chk" id="wt_check" value="1" />
	        			<label for="wt_check">공지사항</label>
	        		</li>
	        		<li class="wt_li wt_tit">
	        			<input type="text" name="title" id="wt_title" class="wr_input" placeholder="제목을 입력하세요." />
	        		</li>
	        		<li class="wt_li wt_ct">
	        			<textarea rows="20" name="content" id="wt_content" class="wr_input" placeholder="내용을 입력하세요." ></textarea>
	        		</li>
	        		<li class="wt_li wt_file">
	        			<input type="file" name="fname" id="wt_file" />
	        		</li>
	        		<li class="wt_li wt_btn">
	        			<div>
	        				<input type="reset" id="board_reset" value="초기화" class="board_btn"/>
	        			</div>
						<div>
						<input type="submit" name="submit" value="작성완료" id="board_submit" class="board_btn"/>
						</div>	        			
	        		</li>
	        	</ul>
        	</form>
        </div>
      </article>
<%@ include file="../tail.jsp" %>
