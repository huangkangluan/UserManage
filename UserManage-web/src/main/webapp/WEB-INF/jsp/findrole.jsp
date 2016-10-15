<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/14
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
      <div class="box_center">
        <form action="" class="jqtransform">
          <table width="100%" border="0" cellpadding="0" cellspacing="0" class="list_table" style="text-align: center">

            <tr>
              <th width="80">选择</th>
              <th width="200">角色名称</th>
              <th width="500">角色描述</th>
              <th>编辑</th>
              <th>删除</th>
              <c:forEach items="${roleList}" var="r">
            </tr>
            <tr class="tr">
              <td class="td_center"><input type="checkbox" value="${r.roleId}"></td>
              <td>${r.roleName}</td>
              <td>${r.roleDescribe}</td>
              <td><input type="button" name="button" class="btn btn82 btn_add" value="编辑"></td>
              <td><input type="button" name="button" class="btn btn82 btn_del" value="删除"></td>
            </tr>
            </c:forEach>

          </table>
          <a href="" class="ext_btn"><span class="add"></span>添加</a>
        </form>
      </div>
    </div>
  </div>
</div>
</div>
</body>
</html>

