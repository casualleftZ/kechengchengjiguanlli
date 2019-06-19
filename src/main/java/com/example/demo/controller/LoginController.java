package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.service.StudentService;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller

public class LoginController {
    @Autowired
    private StudentService studentService;
    private TeacherService teacherService;

    @RequestMapping("/login")

    public String login() {
        return "login/login";
    }

    @RequestMapping("/validateStudent")
    public String Login(String name, String password, String consumer,
                         Model model, HttpSession session) {
        if(consumer.equals("student")){
//            Student student=studentService.checkUserLoginDao(name,password);
//            if(student!=null){
//                return "login/login";
//            }else{
                return  "student/studentmanage";
//            }
        }
        else{
//            Teacher teacher=teacherService.checkUserLoginDao(name,password);
//            if(teacher!=null){
//                return "login/login";
//            }else{
                return "teacher/teachermanage";
            }
//        return "login/login";

        }


    @RequestMapping("/test")

    public String test() {
        return "student/studentmanage";
    }

    }

