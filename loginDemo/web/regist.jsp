<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/27 0027
  Time: 下午 12:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
    <script type="text/javascript" src="js/ajax.js"></script>
    <script type="text/javascript">
            /*function checkName() {
                var xhr=getXhr();
                xhr.open("post","checkName",true);
                xhr.setRequestHeader("content-type","application/x-www-form-urlencoded");
                xhr.onreadystatechange = function () {
                    if(xhr.readyState==4 && xhr.status==200){
                        $("#msg_username").html(xhr.responseText);
                    }
                }
                xhr.send("username="+$("#username").val());
            }*/
        function checkName(){
            //$("#msg_username").load("checkName","username="+$("#username").val());
            $("#msg_username").load("checkName","username="+$("#username").val(),function(responseTxt,statusTxt,xhr){
                if(statusTxt=="success"){
                    alert(responseTxt);
                }else {
                    alert("加载失败!");
                }
            });
        }
    </script>
</head>
<body>
    <form action="">
        <table>
            <tr>
                <td>用户名:</td>
                <td>
                    <input name="username" id="username" onblur="checkName()">
                    <span id="msg_username"></span>
                </td>
            </tr>
            <tr>
                <td>密码:</td>
                <td><input type="password" name="pwd"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="注册"></td>
            </tr>
        </table>
    </form>

</body>
</html>
