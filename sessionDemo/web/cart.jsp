<%@ page import="java.util.Map" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/12 0012
  Time: 下午 8:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
</head>
<body>
    <h2>购物车</h2>
    <h3><a href="clear">清空购物车</a></h3>
    <ul>
        <%
            Map<String,Integer> map = (Map<String, Integer>) session.getAttribute("cart");
            if (map == null) {
                map=new HashMap<String, Integer>();
            }
            Set<String> products = map.keySet();
            for (String product : products) {
        %>
            <li>
                <%=product%>:<%=map.get(product)%>个
            </li>
        <%
            }
        %>
    </ul>
    <a href="product_list.jsp">再逛一逛</a>
</body>
</html>
