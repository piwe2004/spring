<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../head.jsp" %>
      <article id="pg_board_wrap">
        <div id="nt_view">
	       	<div id="nt_view_title">
	       		<p id="nt_title">${vo.title}</p>
	       		<p id="nt_date">${vo.rdate.substring(2, 10)}</p>
	       	</div>
	       	<div id="nt_view_file">
	       		<p id="nt_file">${fvo.oldName}</p>
	       	</div>
	       	<div id="nt_view_content">
	       		${vo.content }
	       	</div>
	       	<div id="np_div">
	        	<ul>
		       		<c:if test="${next != null }">
		        		<li id="next_view">
		        			<p class="np_sub_tit">Next</p>
		        			<a class="np_tit" href="/mins/view?cate=notice&seq=${vo.seq +1}">${next.title}</a>
		        		</li>
		       		</c:if>
		       		<c:if test="${pre != null }">
		        		<li id="prev_view">
		        			<p class="np_sub_tit">Prev</p>
		        			<a class="np_tit" href="/mins/view?cate=notice&seq==${vo.seq -1}">${pre.title}</a>
		        		</li>
		       		</c:if>
	        	</ul>
	      	 </div>
        </div>
      </article>
<%@ include file="../tail.jsp" %>
