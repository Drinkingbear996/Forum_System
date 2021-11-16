<%--
  Created by IntelliJ IDEA.
  User: pioneerrr
  Date: 2021/11/16
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/home/index13 " method="post">

    <input type="text" name="UserList[0].username">
    <input type="text" name="UserList[0].age">

    </br>
    <input type="text" name="UserList[1].username">
    <input type="text" name="UserList[1].age">

    <input type="submit">
</form>

</body>
</html>
