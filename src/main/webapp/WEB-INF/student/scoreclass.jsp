<%@ page import="com.fasterxml.jackson.annotation.JsonTypeInfo" %>
<%@ page import="com.example.demo.entity.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <p>欢迎<%out.println(session.getAttribute("uname"));%>登录   <u><a href="http://127.0.0.1:8080/login"><font color="blue">退出登录</font></a></u></p>
    <center>
        <h1>学生管理系统</h1><hr>

        <tr>
            <td width="10%"><a href="http://127.0.0.1:8080/studentclass">我的课程表</a></td>
            <td width="10%"><a href="http://127.0.0.1:8080/selectclass">选课</a></font> </td>
            <td width="10%"><font color="blue">课程得分 </font></td>
        </tr></br>

    </center>
        </head>
<body>

</body>