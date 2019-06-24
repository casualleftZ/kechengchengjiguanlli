<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>教师管理系统</title>
</head>
<body>
<p>欢迎<%out.println(session.getAttribute("uname"));%>登录
    <u><a href="http://127.0.0.1:8080/login"><font color="blue">退出登录</font></a></u></p>
<center>
    <h1>教师管理系统</h1><hr>
    <table>
    <caption><strong> <%out.println(session.getAttribute("uname"));%>的课程</strong></caption>

        <tr>
            <th width="8%">课程序号</th>
            <th width="15%">课程名称</th>
            <th width="20%">上课时间</th>
            <th width="20%">上课地点</th>
        </tr>

        <%  ArrayList<TimeCourse> timeCourse;
            timeCourse= (ArrayList<TimeCourse>) request.getAttribute("timeCourse");
            for(int i=0;i<=timeCourse.size()-1;i++){%>
        <tr>
            <td><%=i%></td>
            <td><%=timeCourse.get(i).getCname()%></td>
            <td><%=timeCourse.get(i).getTname()%></td>
            <td><%=timeCourse.get(i).getClass_place()%></td>
            <td><%=timeCourse.get(i).getClass_time()%></td>
        </tr>
        <% }%>
    </table>
</center>

</body>
</html>