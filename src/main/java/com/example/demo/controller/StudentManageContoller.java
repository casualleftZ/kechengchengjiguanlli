package com.example.demo.controller;

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
    public String  Addclass(int class_id,HttpServletRequest req,HttpServletResponse resp,HttpSession session){
        HttpSession uname=req.getSession();
        String name=(String)uname.getAttribute("uname");
        List<Timeable> timeable=courseService.selectclass();
        req.setAttribute("timeable",timeable);

        System.out.println(class_id);
        System.out.println(name);
        return "/student/selectclass";
    }
    @RequestMapping("/studentclass")    //学生课表
    public String StudentClass(HttpServletRequest req, HttpServletResponse resp,HttpSession session)throws IOException{

        return "/student/studentclass";
    }
}
