<%@ page import="com.example.demo.entity.TimeCourse" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.demo.entity.Course_class" %>
<%@ page import="com.example.demo.entity.Teacher_class" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>教师管理系统</title>
</head>
<body>
<script type="text/javascript">
    function select( a) {


        window.location.href='http://127.0.0.1:8080/teacherclassstudent?data=' + a;
    }

</script>
<p>欢迎<%out.println(session.getAttribute("uname"));%>登录
    <u><a href="http://127.0.0.1:8080/login"><font color="blue">退出登录</font></a></u></p>
<center>
    <h1>教师管理系统</h1><hr>
    <table width="80%" border="1">

        <caption><strong> <%out.println(session.getAttribute("uname"));%>的课程</strong></caption>

        <tr>
            <th >课程序号</th>
            <th >课程名称</th>
            <th >上课时间</th>
            <th >上课地点</th>
            <th >查看课程学生</th>
        </tr>
        <%  ArrayList<Teacher_class>teacher_classes ;
            teacher_classes= (ArrayList<Teacher_class>) request.getAttribute("teacher_classes");
            for(int i=0;i<=teacher_classes.size()-1;i++){%>
        <tr>
            <td><%=i+1%></td>
            <td><%=teacher_classes.get(i).getCname()%></td>
            <td><%=teacher_classes.get(i).getClass_time()%></td>
            <td><%=teacher_classes.get(i).getClass_place()%></td>
            <td><button type="button" name="select" onclick="select(<%=teacher_classes.get(i).getCourse_id()%>);">选择</button></td>
        </tr>
        <% }%>
    </table>
</center>

</body>
</html>