<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/14
  Time: 20:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="zh-CN">
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="../../css/common.css">
  <link rel="stylesheet" href="../../css/style.css">
  <script type="text/javascript" src="../../js/jquery.min.js"></script>
  <script type="text/javascript" src="../../js/jquery.SuperSlide.js"></script>
  <script type="text/javascript">
    $(function(){
      $(".sideMenu").slide({
        titCell:"h3",
        targetCell:"ul",
        defaultIndex:0,
        effect:'slideDown',
        delayTime:'500' ,
        trigger:'click',
        triggerTime:'150',
        defaultPlay:true,
        returnDefault:false,
        easing:'easeInQuint',
        endFun:function(){
          scrollWW();
        }
      });
      $(window).resize(function() {
        scrollWW();
      });
    });
    function scrollWW(){
      if($(".side").height()<$(".sideMenu").height()){
        $(".scroll").show();
        var pos = $(".sideMenu ul:visible").position().top-38;
        $('.sideMenu').animate({top:-pos});
      }else{
        $(".scroll").hide();
        $('.sideMenu').animate({top:0});
        n=1;
      }
    }

    var n=1;
    function menuScroll(num){
      var Scroll = $('.sideMenu');
      var ScrollP = $('.sideMenu').position();
      /*alert(n);
       alert(ScrollP.top);*/
      if(num==1){
        Scroll.animate({top:ScrollP.top-38});
        n = n+1;
      }else{
        if (ScrollP.top > -38 && ScrollP.top != 0) { ScrollP.top = -38; }
        if (ScrollP.top<0) {
          Scroll.animate({top:38+ScrollP.top});
        }else{
          n=1;
        }
        if(n>1){
          n = n-1;
        }
      }
    }
  </script>
  <title>后台首页</title>
</head>
<body>
<div class="top">
  <div id="top_t">
    <div id="logo" class="fl"></div>
    <div id="photo_info" class="fr">
      <div id="photo" class="fl">
        <a href="#"><img src="../../images/a.png" alt="" width="60" height="60"></a>
      </div>
      <div id="base_info" class="fr">
        <div class="help_info">
          <a href="1" id="hp">&nbsp;</a>
          <a href="2" id="gy">&nbsp;</a>
          <a href="3" id="out">&nbsp;</a>
        </div>
        <div class="info_center">
          ${userVo.userName}
          <span id="nt">${role.roleName}</span>
        </div>
      </div>
    </div>
  </div>
  <div id="side_here">
    <div id="side_here_l" class="fl"></div>
    <div id="here_area" class="fl">当前位置：</div>
  </div>
</div>
<div class="side">
  <div class="sideMenu" style="margin:0 auto">
    <%--循环显示UesrVo中的moduleList的数据--%>
    <c:forEach items="${sessionScope.userVo.moduleList}" var="v">
      <%--判断如果父模块ID为0，那么循环显示父模块的名称--%>
      <c:if test="${v.parentModuleId==0}">
        <h3><a href="#">${v.moduleName}</a></h3>

        <ul>
          <c:forEach items="${sessionScope.userVo.moduleList}" var="vo">
            <%--判断如果模块ID与父模块ID相等，那么该模块属于当前父模块中的子模块--%>
            <%--如果条件成立，显示模块名称，这个模块名称就是字模块的名称--%>
            <c:if test="${v.moduleId==vo.parentModuleId}">
              <li><a href="${vo.moduleAddress}" target="right">${vo.moduleName}</a></li>

            </c:if>
          </c:forEach>
        </ul>
      </c:if>
    </c:forEach>

  </div>
</div>
<div class="main">
  <iframe name="right" id="rightMain" src="../../main.html" frameborder="no" scrolling="auto" width="100%" height="auto" allowtransparency="true"></iframe>
</div>
<div class="bottom">
  <div id="bottom_bg">版权</div>
</div>
<div class="scroll">
  <a href="javascript:;" class="per" title="使用鼠标滚轴滚动侧栏" onclick="menuScroll(1);"></a>
  <a href="javascript:;" class="next" title="使用鼠标滚轴滚动侧栏" onclick="menuScroll(2);"></a>
</div>
</body>

</html>


