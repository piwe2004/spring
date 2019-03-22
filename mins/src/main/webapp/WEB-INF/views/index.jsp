<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>MINSWEB</title>
    <link rel="stylesheet" href="/mins/css/font.css">
    <link rel="stylesheet" href="/mins/css/basic.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="//naver.github.io/egjs-jquery-transform/release/latest/dist/transform.js"></script>
    <script>
      $(document).ready(function(){
        var wh = $(window).height();
        $("#pf_main").css("height",wh);
        // $(".pf_line").animate({
        //   opacity:"1"
        // },1000);
        $("#pf_line1, #pf_line3").animate({
          width:"100%"
        }, 800);
        $("#pf_line2, #pf_line4").animate({
          height:"100%"
        }, 800);

        $("#pf_main_text").delay(650).fadeIn();

        setInterval(function(){
          var font_leng = $("#pf_text_top").children('p');
          for(i = 0; i <= font_leng.length; i++){
            var j = i * 150;
            // console.log(j);
            // alert(i);
            $("#pf_text_top > p").eq(i).delay(j).animate({
              opacity:1
            });
          }
          $("#pf_main_text").delay(2100).animate({
            marginTop:"-50px"
          }, 600);
          $("#pf_mv_btn").delay(2900).fadeIn(1000);
        }, 1300);

      });
      $(window).resize(function(){
        var wh = $(window).height();
        $("#pf_main").css("height",wh);
      });
    </script>
  </head>
  <body>
    <div id="pf_area">
      <div id="pf_main">
        <!-- <div id="pf_main_img">
          <img src="/image/pf/pf_main.jpg" alt="">
        </div> -->
        <div id="pf_main_line">
          <!-- <div class="pf_line" id="pf_line"></div> -->
          <div class="pf_line2" id="pf_line1"></div>
          <div class="pf_line2" id="pf_line2"></div>
          <div class="pf_line2" id="pf_line3"></div>
          <div class="pf_line2" id="pf_line4"></div>
          <!-- <div class="pf_line" id="pf_line2"></div>
          <div class="pf_line" id="pf_line3"></div>
          <div class="pf_line" id="pf_line4"></div> -->
          <div id="pf_main_text">
            <div id="pf_text_top">
              <p>W</p>
              <p>E</p>
              <p>B</p>
              <p>&nbsp</p>
              <p>P</p>
              <p>U</p>
              <p>B</p>
              <p>L</p>
              <p>I</p>
              <p>S</p>
              <p>H</p>
              <p>E</p>
              <p>R</p>
            </div>
          </div>
          <div id="pf_mv_btn">
            <a href="/mins/main">HOME</a>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
