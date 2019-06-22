<%@ page import="com.fasterxml.jackson.annotation.JsonTypeInfo" %>
<%@ page import="com.example.demo.entity.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生管理系统</title>
</head>
<body>

<p>欢迎<%out.println(session.getAttribute("uname"));%>登录   <u><a href="http://127.0.0.1:8080/login"><font color="blue">退出登录</font></a></u></p>
<center>
    <h1>学生管理系统</h1><hr>

    <tr>
        <td width="10%"><font color="blue">我的课程表</font></td>
        <td width="10%"><a href="">选课</a> </td>
        <td width="10%"><a href="">课程得分</a> </td>
    </tr></br>


    <table width=60% border="1">

        <caption><strong> <%out.println(session.getAttribute("uname"));%>的课程</strong></caption>

        <tr>
            <th width="8%">课程序号</th>
            <th width="15%">课程名称</th>
            <th width="15%">任课老师</th>
            <th width="20%">上课时间</th>
            <th width="20%">上课地点</th>
        </tr>

        <% for(int i=1;i<=10;i++){%>
            <tr>
                <td>1</td>
                <td>美术</td>
                <td>余飘</td>
                <td>6:00</td>
                <td>w3401</td>
            </tr>
        <% ;}%>

    </table>

</center>


</body>
</html>