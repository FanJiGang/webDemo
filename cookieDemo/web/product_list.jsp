<%@ page import="java.beans.Encoder" %>
<%@ page import="java.net.URLDecoder" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/7 0007
  Time: 下午 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>购物车</title>
    <style type="text/css">
        table{
            border: 1px solid red;
            width: 60%;
        }
        td,tr{
            border: 1px solid red;
            font-size: 14px;
        }
    </style>
</head>
<body>
    <h3>商品列表</h3>
    <div>
        <table>
            <tr>
                <td><a href="show?name=第一件商品">第一件商品</a></td>
                <td><a href="show?name=第二件商品">第二件商品</a></td>
                <td><a href="show?name=第三件商品">第三件商品</a></td>
                <td><a href="show?name=第四件商品">第四件商品</a></td>
                <td><a href="show?name=第五件商品">第五件商品</a></td>
            </tr>
            <tr>
                <td><a href="show?name=第21件商品">第21件商品</a></td>
                <td><a href="show?name=第22件商品">第22件商品</a></td>
                <td><a href="show?name=第23件商品">第23件商品</a></td>
                <td><a href="show?name=第24件商品">第24件商品</a></td>
                <td><a href="show?name=第25件商品">第25件商品</a></td>
            </tr>
        </table>
    </div>
    <h3>历史记录</h3>
    <div>
        <table>
            <tr>
                <%  String get_name1="";
                    String get_name2="";
                    String get_name3="";
                    Cookie[] cookies = request.getCookies();
                    if (cookies != null) {
                        for (Cookie cookie : cookies) {
                            if ("name1".equals(cookie.getName())){
                                get_name1 =URLDecoder.decode(cookie.getValue(),"utf-8");
                            }
                            if ("name2".equals(cookie.getName())){
                                get_name2 =URLDecoder.decode(cookie.getValue(),"utf-8");
                            }
                            if ("name3".equals(cookie.getName())){
                                get_name3 =URLDecoder.decode(cookie.getValue(),"utf-8");
                            }
                        }
                    }
                %>
                <td><a href="show?name="+<%=get_name1 %>><%=get_name1 %></a></td>
                <td><a href="show?name="+<%=get_name2 %>><%=get_name2 %></a></td>
                <td><a href="show?name="+<%=get_name3 %>><%=get_name3 %></a></td>
            </tr>
            <a href="clear">清空历史记录</a>
        </table>
    </div>



</body>
</html>
