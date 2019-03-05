<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/26 0026
  Time: 下午 1:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
    <script type="text/javascript" src="js/ajax.js"></script>
    <script type="text/javascript">
        function get(){
            //创建xmlhttprequest对象
            var xhr=getXhr();
            //发送请求
            xhr.open("get","demo01?username='张三'&password='123456'",true);
            xhr.onreadystatechange = function(){
                if(xhr.readyState==4 && xhr.status==200){
                    alert(xhr.responseText);
                }
            }
            xhr.send(null);
        }
    </script>
</head>
<body>
    <a href="" onclick="get()">使用ajax方式发送get请求</a>
</body>
</html>
