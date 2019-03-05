<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/4 0004
  Time: 上午 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
    <h2>欢迎登录</h2>
    <form action="login" method="post">
        <table>
            <tr>
                <td>用户名:</td>
                <td><input type="text" name="username"/></td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="password" name="pwd"></td>
            </tr>
            <tr>
                <td><input type="checkbox" name="auto_login">自动登录</td>
                <td><input type="submit" value="登录"></td>
            </tr>
        </table>
    </form>
</body>
</html>
