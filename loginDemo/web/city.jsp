<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/28 0028
  Time: 下午 5:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>省市联动</title>
    <script type="text/javascript" src="js/jquery-1.11.0.js"></script>
    <script type="text/javascript" src="js/city.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#province").change(getCities02);
        });
    </script>
</head>
<body>
    省份:
    <select name="province" id="province">
        <option value="0">-请选择-</option>
        <option value="1">广东</option>
        <option value="2">湖南</option>
        <option value="3">湖北</option>
        <option value="4">四川</option>
    </select>
    城市:
    <select name="city" id="city">
        <option>-请选择-</option>
    </select>
</body>
</html>
