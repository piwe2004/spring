<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@page import="kr.co.mins.vo.MemberVO"%>
<%

MemberVO member = (MemberVO)session.getAttribute("member");
if(member == null){
	
	response.sendRedirect("/mins/list?cate=portfolio");
}

%>
<%@ include file="../head.jsp" %>
      <article id="pg_board_wrap">
        <div id="nt_warp">
        	<ul class="nt_ul">
        		<li class="nt_li">
        			<p class="nt_num">0</p>
        			<a class="nt_title" href="#">글제목</a>
        			<p class="nt_nick">최고관리자</p>
        			<p class="nt_hit">0</p>
        			<p class="nt_date">03-18</p>
        		</li>
        	</ul>
        </div>
      </article>
<%@ include file="../tail.jsp" %>
