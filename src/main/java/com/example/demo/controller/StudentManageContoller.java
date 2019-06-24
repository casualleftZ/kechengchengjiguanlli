package com.example.demo.controller;

import com.example.demo.dao.TimeCourseDao;
import com.example.demo.entity.Class_student;
import com.example.demo.entity.Class_student2;
import com.example.demo.entity.TimeCourse;
import com.example.demo.entity.Timeable;
import com.example.demo.service.CourseService;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class StudentManageContoller {
    @Autowired
    private StudentService studentService;
    @Autowired
    private CourseService courseService;
    @RequestMapping("/selectclass")  //选课
    public String StudentManage(HttpServletRequest req, HttpServletResponse resp,HttpSession session)throws IOException{
//        HttpSession uname=req.getSession();
//        String name=(String)uname.getAttribute("uname");
//        System.out.println("StudentManage.service"+name);
        List<Timeable> timeable=courseService.selectclass();
        req.setAttribute("timeable",timeable);



 //       System.out.println(timeable);

        //是
        return "/student/selectclass";
    }
    @RequestMapping("/addclass")  //添加课程表
    public String  Addclass(HttpServletRequest req,HttpServletResponse resp,HttpSession session){
        HttpSession id=req.getSession();
        String a=req.getParameter("data");
        int class_id=Integer.parseInt(a);
        int id2=(int)id.getAttribute("id");
        List<Timeable> timeable=courseService.selectclass();
        req.setAttribute("timeable",timeable);
        courseService.addclass(class_id,id2);
        return "/student/selectclass";
    }

    @RequestMapping("/deleteclass")  //删除课程表
    public String  Deleteclass(HttpServletRequest req,HttpServletResponse resp,HttpSession session){
        HttpSession id=req.getSession();
        String a=req.getParameter("data");
        int class_id=Integer.parseInt(a);
        int id2=(int)id.getAttribute("id");
        List<Timeable> timeable=courseService.selectclass();
        req.setAttribute("timeable",timeable);
        courseService.deleteclass(class_id,id2);
        return "/student/selectclass";
    }

    @RequestMapping("/studentclass")    //学生课表
    public String StudentClass(HttpServletRequest req, HttpServletResponse resp,HttpSession session)throws IOException{
        HttpSession id=req.getSession();
        String a=req.getParameter("data");
        int id2=(int)id.getAttribute("id");
        List<TimeCourse> timeCourse=courseService.lookcourse(id2);
        req.setAttribute("timeCourse",timeCourse);
        return "/student/studentclass";
    }

    @RequestMapping("/studentscore")   //学生分数
    public String Studentscore(HttpServletRequest req,HttpSession session){
        HttpSession id=req.getSession();
        int id2=(int)id.getAttribute("id");
        List<Class_student2>class_student2=courseService.selectscore(id2);
        req.setAttribute("class_student2",class_student2);
        return "/student/scoreclass";
    }
}
