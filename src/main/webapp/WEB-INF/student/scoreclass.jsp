<%@ page import="com.fasterxml.jackson.annotation.JsonTypeInfo" %>
<%@ page import="com.example.demo.entity.Student" %>
<%@ page import="com.example.demo.entity.Class_student2" %>
<%@ page import="java.util.ArrayList" %>
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
        <table width=60% border="1"  >
            <caption><strong> <%out.println(session.getAttribute("uname"));%>的课程</strong></caption>

                <tr>
                    <th >课程序号</th>
                    <th >课程名称</th>
                    <th >平时成绩</th>
                    <th >理论成绩</th>
                    <th >实践成绩</th>
                    <th > 总成绩</th>
                </tr>


            <%  ArrayList<Class_student2> class_student2;
                class_student2= (ArrayList<Class_student2>) request.getAttribute("class_student2");
                for(int i=0;i<=class_student2.size()-1;i++){%>
            <tr>
                <td><%=i+1%></td>
                <td><%=class_student2.get(i).getCname()%></td>
                <td><%=class_student2.get(i).getGpa_score()%></td>
                <td><%=class_student2.get(i).getPaper_score()%></td>
                <td><%=class_student2.get(i).getPractice_score()%></td>
                <td><%=class_student2.get(i).getScore()%></td>
            </tr>
            <% }%>
        </table>
    </center>
        </head>
<body>

</body>