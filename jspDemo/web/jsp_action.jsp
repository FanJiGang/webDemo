<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/13 0013
  Time: 下午 5:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<jsp:include page=""></jsp:include>
    <jsp:param name="" value=""></jsp:param>
    <jsp:forward page=""></jsp:forward>--%>
    这是jsp_action页面
    <%--<jsp:include page="add.jsp"/>--%>
    <%--<jsp:forward page="demo.jsp">
        <jsp:param name="username" value="zhangsansan"/>
    </jsp:forward>--%>

    <p>存值...</p>
    <%
        pageContext.setAttribute("username","zhangsan");
        request.setAttribute("age","34");
        request.setAttribute("username","lisi");
        session.setAttribute("sex","男");
        application.setAttribute("pwd","123456");
    %>
    <p>取值...</p>
    ${requestScope.username } ;${age }; ${sex }; ${pwd}

    <%--<jsp:forward page="jsp01.jsp"></jsp:forward>--%>
    <%--<%response.sendRedirect("jsp02.jsp"); %>--%>
    <%
        String[] ss={"aa","bb","cc"};
        pageContext.setAttribute("array",ss);
    %>
    <p>EL取值(数组):</p>
    ${array[0] };${array[1] };${array[2] }

    <%
        List<String> list=new ArrayList<String>();
        list.add("zhangsan");
        list.add("list");
        list.add("wangwu");
        request.setAttribute("array",list);
    %>
    <p>EL取值(list集合):</p>
    ${array[0]};${array[1]};${array[2]};
    ${requestScope.array[0] };${requestScope.array[1] };${requestScope.array[2] }

    <%
        Map<String,String> map=new HashMap<String,String>();
        map.put("name","goudao");
        map.put("age.value","18");
        map.put("sex.value","nan");
        session.setAttribute("map",map);
    %>
    <p>EL取值(Map):</p>
    ${map.name };${map["age.value"] };${map["sex.value"] }
    ${}
</body>
</html>
