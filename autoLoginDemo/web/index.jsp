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
    <title>网站首页</title>
    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
    <script type="text/javascript">
        $(function(){
            if(${empty result}){
                $("#login_msg").html("<a href='login.jsp'>点击登录</a>");
            }else if(${result.status==0}) {
                $("#login_msg").html("欢迎<a href=''> ${result.data.user_name} 访问</a>");
            }
        });
    </script>
</head>
<body>
    <h2>欢迎访问</h2>
    <p id="login_msg"></p>
</body>
</html>
