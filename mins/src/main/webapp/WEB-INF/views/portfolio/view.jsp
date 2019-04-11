<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../head.jsp" %>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="./resources/editor/js/HuskyEZCreator.js" charset="utf-8"></script>
<script type="text/javascript">
    $(function(){
        //전역변수
        var obj = [];              
        //스마트에디터 프레임생성
        nhn.husky.EZCreator.createInIFrame({
            oAppRef: obj,
            elPlaceHolder: "nt_view_content",
            sSkinURI: "./resources/editor/SmartEditor2Skin.html",
            htParams : {
                // 툴바 사용 여부
                bUseToolbar : true,            
                // 입력창 크기 조절바 사용 여부
                bUseVerticalResizer : true,    
                // 모드 탭(Editor | HTML | TEXT) 사용 여부
                bUseModeChanger : true,
            }
        });
        //전송버튼
        $("#insertBoard").click(function(){
            //id가 smarteditor인 textarea에 에디터에서 대입
            obj.getById["editor"].exec("UPDATE_CONTENTS_FIELD", []);
            //폼 submit
            $("#insertBoardFrm").submit();
        });
    });
</script>
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
	    			<a class="np_tit" href="/mins/view?cate=portfolio&seq=${vo.seq +1}">${next.title}</a>
	    		</li>
	   		</c:if>
	   		<c:if test="${pre != null }">
	    		<li id="prev_view">
	    			<p class="np_sub_tit">Prev</p>
	    			<a class="np_tit" href="/mins/view?cate=portfolio&seq=${vo.seq -1}">${pre.title}</a>
	    		</li>
	   		</c:if>
	   	</ul>
	 	 </div>
	  </div>
	</article>
<%@ include file="../tail.jsp" %>
