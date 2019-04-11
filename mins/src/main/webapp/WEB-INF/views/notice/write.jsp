<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@page import="kr.co.mins.vo.MemberVO"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%

MemberVO member = (MemberVO)session.getAttribute("member");
if(member == null){
	
	response.sendRedirect("/mins/list?cate=notice");
}

%>
<%@ include file="../head.jsp" %>
<script src="<%=request.getContextPath() %>/ckeditor/ckeditor.js"></script>
<script>
	$(function(){
	    
	    CKEDITOR.replace( 'content', {//해당 이름으로 된 textarea에 에디터를 적용
	        width:'100%',
	        height:'400px',
	        filebrowserImageUploadUrl: '/photoUpload' //여기 경로로 파일을 전달하여 업로드 시킨다.
	    });
	
	    CKEDITOR.on('dialogDefinition', function( ev ){
	        var dialogName = ev.data.name;
	        var dialogDefinition = ev.data.definition;
	
	        switch (dialogName) {
	            case 'image': //Image Properties dialog
	            //dialogDefinition.removeContents('info');
	            dialogDefinition.removeContents('Link');
	            dialogDefinition.removeContents('advanced');
	            break;
	        }
	    });
	 });
</script>
<article id="pg_board_wrap">
  <div id="nt_write">
   <form action="/mins/write_result" method="post" id="wr_form" enctype="multipart/form-data">
   <input type="hidden" name="cate" value="notice">
   	<ul class="wt_ul">
   		<li class="wt_li">
   			<input type="checkbox" name="notice_chk" id="wt_check" value="1" />
   			<label for="wt_check">공지사항</label>
   		</li>
   		<li class="wt_li wt_tit">
   			<input type="text" name="title" id="wt_title" class="wr_input" placeholder="제목을 입력하세요." required/>
   		</li>
   		<li class="wt_li wt_ct">
   			<textarea rows="20" name="content" id="wt_content" class="wr_input" placeholder="내용을 입력하세요." required></textarea>
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
