<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/14 0014
  Time: 下午 7:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jstl</title>
</head>
<body>
    <c:set var="name" value="zhangsan" scope="session"></c:set>
    <p>值:${pageScope.name };${name};${sessionScope.name}</p>
    <%--<c:set var="age" value="19"></c:set>
    <c:if test="${age>16 }" var="flag" scope="request">
        年龄大于16岁
    </c:if>
    ${requestScope.flag}--%>
    <c:forEach begin="1" end="10" var="i" step="3">
        ${i }:${name }
    </c:forEach>
    <br/><p>-------------------------------</p><br/>
    <%
        List<String> list=new ArrayList<String>();
        list.add("zh");
        list.add("cn");
        list.add("wang");
        list.add("fan");
        request.setAttribute("names",list);
    %>
    <c:forEach items="${names }" var="username">
        ${username }<br/>
    </c:forEach>

</body>
</html>
