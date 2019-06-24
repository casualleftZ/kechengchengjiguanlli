package com.example.demo.controller;


import com.example.demo.entity.Class_student;
import com.example.demo.entity.Teacher_class;
import com.example.demo.service.Class_studentDaoService;
import com.example.demo.service.Course_classDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class TeacherManageController {

    @Autowired
    private Course_classDaoService course_classDaoService;
    @Autowired
    private Class_studentDaoService class_studentDaoService;

    /*
    传入teacher_id,得到该教师所带的课程
     */
    @RequestMapping("/teacherclass")
    public String Teacherclass(HttpServletRequest req, HttpServletResponse resp, HttpSession sessionint){
        HttpSession id=req.getSession();
        int id2=(int)id.getAttribute("id");

        List<Teacher_class> teacher_classes=course_classDaoService.getteacherclass(id2);
        req.setAttribute("teacher_classes",teacher_classes);

        System.out.println(teacher_classes);
        return "/teacher/teacherclass";
    }
    /*
       传入course_id,得到该课程的学生
        */
    @RequestMapping("/teacherclassstudent")
    public String teacherclassstudent(Integer course_id){

        return "/teacher/classstudent";
    }

}
