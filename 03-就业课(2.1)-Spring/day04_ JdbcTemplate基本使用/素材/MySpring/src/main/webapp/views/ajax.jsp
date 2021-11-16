<%--
  Created by IntelliJ IDEA.
  User: pioneerrr
  Date: 2021/11/16
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

<%--   用于导入Jquery包 --%>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.3.1.js"></script>

    <script>
        var userList=new Array();
        userList.push({name:"xiaoA",age:123});
        userList.push({name:"xiaoB",age:124});

        $.ajax({
              type:"POST",
              url:" ${pageContext.request.contextPath}/home/index14",
              data:JSON.stringify(userList),
              contentType:"application/json;charset=utf-8"
            })

    </script>
</head>
<body>

</body>
</html>
