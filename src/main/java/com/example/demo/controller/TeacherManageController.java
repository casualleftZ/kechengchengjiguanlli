package com.example.demo.controller;


import com.example.demo.entity.Class_student;
import com.example.demo.entity.Course_class;
import com.example.demo.entity.Teacher;
import com.example.demo.service.Class_studentDaoService;
import com.example.demo.service.Course_classDaoService;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
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
        List<Course_class> courseClassList=course_classDaoService.getteacherclass(id2);
        req.setAttribute("courseClassList",courseClassList);
        System.out.println(courseClassList);
        return "/teacher/teacherclass";
    }
    /*
       传入course_id,得到该课程的学生
        */
    @GetMapping("/teacherclassstudent")
    public List<Class_student> teacherclassstudent(Integer course_id){
        List<Class_student> class_studentList=class_studentDaoService.getclassstudent(3);
        return class_studentList;
    }

}
