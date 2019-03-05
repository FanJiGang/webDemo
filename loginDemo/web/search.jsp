<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/27 0027
  Time: 下午 7:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>搜索</title>
    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
    <script type="text/javascript" src="js/sousou.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#word").keyup(moreWords);
        });
    </script>
</head>
<body>
    <h2 style="margin-left: 40%;">好好搜</h2>
    <form action="" style="margin: auto;width: 60%">
        <input name="tip" style="font-size: 42px;width:80%;height: 50px;" id="word">&nbsp;&nbsp;
        <input type="submit" value="搜索一下" style="height: 48px;">
        <br/>
        <p  style="border:1px solid black;width: 80%;height: 300px;margin-top: 0px;" id="msg">
    </form>
</body>
</html>