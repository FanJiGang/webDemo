<%@ page import="cn.fan.Bean02" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/2 0002
  Time: 下午 4:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>bean01页面</h2>
    <%
        Bean02 bean02 = new Bean02("wuyu");
        session.setAttribute("bean",bean02);
    %>
</body>
</html>
