<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>教师管理系统</title>
</head>
<body>
<center>
    <h1>教师管理系统</h1><hr>
    <table width="60%" border="1">
        <caption><strong> <%out.println(session.getAttribute("uname"));%>的课程</strong></caption>
        <tr>
        <th >学生序号</th>
        <th >学生名字</th>
        <th >学生性别</th>
        <th >学生班级</th>
        <th >打分</th>
        </tr>

    </table>
</center>

</body>
</html>