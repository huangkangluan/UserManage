<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/14
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh-CN">
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="../../css/common.css">
  <link rel="stylesheet" href="../../css/main.css">
  <script type="text/javascript" src="../../js/jquery.min.js"></script>
  <script type="text/javascript" src="../../js/colResizable-1.3.min.js"></script>
  <script type="text/javascript" src="../../js/common.js"></script>

  <script type="text/javascript">
    $(function(){
      $(".list_table").colResizable({
        liveDrag:true,
        gripInnerHtml:"<div class='grip'></div>",
        draggingClass:"dragging",
        minWidth:30
      });

    });
  </script>
  <title>Document</title>
</head>
<body>

<div id="forms" class="mt10">
  <div class="box">
    <div class="box_border">
      <div class="box_top"><b class="pl15">新增角色</b></div>
      <div class="box_center">
        <form action="" class="jqtransform">
          <table class="form_table pt15 pb15" width="100%" border="0" cellpadding="0" cellspacing="0" style="text-align: center">
            <tr>
              <td align="right">用户名称：</td>
              <td align="left">
                <input type="text" name="userName" id="userName" class="input-text lh30" size="40">&nbsp;&nbsp;<span style="color: red">*</span>
              </td>
            </tr>
            <tr>
              <td align="right">用户密码：</td>
              <td align="left">
                <input type="password" name="password" id="password" class="input-text lh30" size="40">&nbsp;&nbsp;<span style="color: red">*</span>
              </td>
            </tr>
            <tr>
              <td align="right">确认密码：</td>
              <td align="left">
                <input type="password" name="password2" id="password2" class="input-text lh30" size="40">&nbsp;&nbsp;<span style="color: red">*</span>
              </td>
            </tr>
            <tr >
              <td class="td_right">下拉框：</td>
              <td class="">

                    <span class="fl">
                      <div class="select_border">
                        <div class="select_containers ">
                          <select name="" class="select">
                            <option>北京</option>
                            <option>天津</option>
                            <option>上海</option>
                            <option>重庆</option>
                          </select>
                        </div>
                      </div>
                    </span>
              </td>
            </tr>
            <tr>
              <td>&nbsp;</td>
              <td align="left">
                <input type="button" name="button" class="btn btn82 btn_save2" value="新增">
                <input type="reset" name="button" class="btn btn82 btn_res" value="重置">
              </td>
            </tr>
          </table>
        </form>
      </div>
    </div>
  </div>
</div>
</div>
<script>
  $(function(){
    $(".btn_save2").click(function(){
      $.post("adduser_role",{"userName":$("#userName").val(),"roleDescribe":$("#roleDescribe").val()},function(data){
        if(data==true){
          alert("新增成功");
        }else{
          alert("新增失败");
        }
      });
    });
    $("#roleName").focusout(function(){
      var roleName = $(this).val();
      if(roleName==""){
        alert("角色名不能为空！")
      }
    });
  });
</script>
</body>
</html>

