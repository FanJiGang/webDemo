<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/13 0013
  Time: 下午 2:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="true" errorPage="error.jsp" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
    <p>算术:<%=10/1 %></p>
    <%@include file="add.jsp"%>
    <p>参数:${param.username }</p>
</body>
</html>
