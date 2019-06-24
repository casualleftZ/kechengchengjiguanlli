<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>教师管理系统</title>
</head>
<body>
<p>欢迎<%out.println(session.getAttribute("uname"));%>登录 <u><a href="http://localhost:8080/login" ><font color="blue">退出登录</font></a></u> </p>

<center>
    <h1>教师管理系统</h1><hr>
    <tr>
        <td width="10%"><a href="http://127.0.0.1:8080/teacherclass" >我的课程表</a></td>
    </tr>



</center>
</body>
</html>
