<%@ page import="com.fasterxml.jackson.annotation.JsonTypeInfo" %>
<%@ page import="com.example.demo.entity.Student" %>
<%@ page import="java.awt.*" %>
<%@ page import="com.example.demo.entity.Timeable" %>
<%@ page import="com.example.demo.service.CourseService" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生管理系统</title>
</head>
<body>
    <script type="text/javascript">
        function select() {
            alert("选择课程成功");

            window.location.href='http://127.0.0.1:8080/addclass';

        }
    </script>
<p>欢迎<%out.println(session.getAttribute("uname"));%>登录   <u><a href="http://127.0.0.1:8080/login"><font color="blue">退出登录</font></a></u></p>
<center>
    <h1>学生管理系统</h1><hr>

    <tr>
        <td width="10%"><a href="http://127.0.0.1:8080/studentclass">我的课程表</a></td>
        <td width="10%"><font color="blue">选课</font> </td>
        <td width="10%"><a href="">课程得分</a> </td>
    </tr></br>


        <table width=60% border="1"  method='get'>

        <caption><strong> <%out.println(session.getAttribute("uname"));%>的课程</strong></caption>

        <tr>
            <th >课程序号</th>
            <th >课程名称</th>
            <th >任课老师</th>
            <th >选课人数</th>
            <th >理论总学时</th>
            <th >实验总学时</th>
            <th >上课时间</th>
            <th >上课地点</th>
            <th >选课</th>
            <th >退选</th>
        </tr>

        <%
            ArrayList<Timeable> timeable;
            timeable= (ArrayList<Timeable>) request.getAttribute("timeable");
        for(int i = 1; i<=timeable.size()-1; i++){%>
        <tr>
            <td name=class_id value=<%=timeable.get(i).getId() %>><%=timeable.get(i).getId()%></td>
            <td><%=timeable.get(i).getCname()%></td>
            <td><%=timeable.get(i).getTname()%></td>
            <td><%=timeable.get(i).getNum()%></td>
            <td><%=timeable.get(i).getTchour()%></td>
            <td><%=timeable.get(i).getTlhour()%></td>
            <td><%=timeable.get(i).getClass_time()%></td>
            <td><%=timeable.get(i).getClass_place()%></td>
            <td><button type="button" name="select"  onclick="select();"><% %>选择</button></td>
            <td><button type="button" name="delete"><% %>退选</button></td>
        </tr>
         <%};%>

    </table>

</center>


</body>
</html>