<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../head.jsp" %>
      <article id="pg_board_wrap">
        <div id="nt_list">
        	<ul class="nt_ul">
	        	<c:forEach var="vo" items="${list}">
	        		<li class="nt_li">
	        			<p class="nt_num">${count=count-1}</p>
	        			<a class="nt_title" href="/mins/notice/view?seq=${vo.seq}">${vo.title}</a>
	        			<p class="nt_nick">${vo.usernick}</p>
	        			<p class="nt_hit">${vo.hit}</p>
	        			<p class="nt_date">${vo.rdate.substring(2, 10)}</p>
	        		</li>
	       		</c:forEach>
        	</ul>
        </div>
      </article>
<%@ include file="../tail.jsp" %>
