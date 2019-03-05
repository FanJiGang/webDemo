<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/26 0026
  Time: 下午 7:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/ajax.js"></script>
    <script type="text/javascript">
        function post() {
            var xhr=getXhr();
            xhr.open("post","demo01",true);
            xhr.setRequestHeader("content-type","application/x-www-form-urlencoded");
            xhr.onreadystatechange = function(){
                if(xhr.readyState==4 && xhr.status==200){
                    alert(xhr.responseText);
                }
            }
            xhr.send("password=杰哥不要啊&username=杰森");
        }
    </script>
</head>
<body>
    <a href="" onclick="post()">使用ajax发送post请求</a>
</body>
</html>
