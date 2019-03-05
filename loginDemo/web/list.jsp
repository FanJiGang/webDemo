<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/27 0027
  Time: 下午 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
    <c:forEach items="${words}" var="w">
        <tr><td>${w.word}</td></tr>
    </c:forEach>
</table>
