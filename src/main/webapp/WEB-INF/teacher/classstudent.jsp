<%@ page import="com.example.demo.entity.Student2" %>
<%@ page import="java.util.ArrayList" %>
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
    <table width="60%" border="1">
        <caption><strong> <%out.println(session.getAttribute("uname"));%>的课程</strong></caption>
        <tr>
        <th >学生序号</th>
        <th >学生名字</th>
        <th >学生性别</th>
        <th >学生班级</th>
        <th >打分</th>
        </tr>
      <%  ArrayList<Student2> student2 ;
            student2= (ArrayList<Student2>) request.getAttribute("student2s");
            for(int i=0;i<=student2.size()-1;i++){%>
        <tr>
            <td><%=i+1%></td>
            <td><%=student2.get(i).getSname()%></td>
            <td><%=student2.get(i).getGender()%></td>
            <td><%=student2.get(i).getName()%></td>
            <td><button type="button" name="select" onclick="select(<%=student2.get(i).getId()%>);">打分</button></td>
        </tr>
        <% }%>
    </table>
</center>

</body>
</html>