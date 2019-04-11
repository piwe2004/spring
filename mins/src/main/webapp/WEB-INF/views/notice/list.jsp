<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../head.jsp" %>
<script>
	$(document).ready(function(){
		var list_width = $("#list_num_area > ul").outerWidth(); 
		$("#list_num_area").css("width", list_width);
		
		
		$.urlParam = function(name){
		    var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
		    if (results==null){
		       return null;
		    }
		    else{
		       return results[1] || 0;
		    }
		}
		//$.urlParam('pg');
		//console.log($.urlParam('pg'));
		var list_num = $(".num");
		if($.urlParam('pg') == list_num.text()){
			console.log(list_num.text());
			var num = list_num.text();
			list_num.parent("li").addClass("list_on");
			list_num.parent("li").text(num);
			list_num.remove();
		}
	});
</script>
      <article id="pg_board_wrap">
        <div id="nt_list">
        	<ul class="nt_ul">
	        	<c:forEach var="vo" items="${list}">
	        		<li class="nt_li">
	        			<p class="nt_num">${count=count-1}</p>
	        			<a class="nt_title" href="/mins//view?cate=notice&seq=${vo.seq}">${vo.title}</a>
	        			<p class="nt_nick">${vo.usernick}</p>
	        			<p class="nt_hit">${vo.hit}</p>
	        			<p class="nt_date">${vo.rdate.substring(2, 10)}</p>
	        		</li>
	       		</c:forEach>
        	</ul>
        </div>
        <div id="list_num_area">
			<ul> 
				<c:if test="${groupStartEnd[0] > 1 }">
					<li class="list_pn list_num" id="list_prev">
						<a href="#" class="prev">이전</a>
					</li>
				</c:if>
				<c:forEach var="i" begin="${groupStartEnd[0]}" end="${groupStartEnd[1] }">
					<li class="list_num">
						<a href="/mins/notice/list?pg=${i }" class="num">${i }</a>
					</li>
				</c:forEach>
				<c:if test="${groupStartEnd[0] < 1 }">
					<li class="list_pn list_num" id="list_next">
						<a href="#" class="next">다음</a>
					</li>
				</c:if>
			</ul>
		</div>
      </article>
<%@ include file="../tail.jsp" %>
