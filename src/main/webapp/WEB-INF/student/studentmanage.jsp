<%@ page import="com.fasterxml.jackson.annotation.JsonTypeInfo" %>
<%@ page import="com.example.demo.entity.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生管理系统</title>
</head>
<body>

<p>欢迎<%out.println(session.getAttribute("uname"));%>登录   <u><a href="http://localhost:8080/login"><font color="blue">退出登录</font></a></u></p>
<center>
    <frame cols="187,*" frameborder="no" border="0" framespacing="0">
        <jsp:include   page="top.jsp"  flush="true"/>
    </frameset>
</center>

</body>
</html>
