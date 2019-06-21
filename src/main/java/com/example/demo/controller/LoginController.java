package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.service.StudentService;
import com.example.demo.service.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller

public class LoginController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/login")

    public String login() {
        return "login/login";
    }

    @RequestMapping("/validateStudent")
    public String Login(String name, String password, String consumer,
                        ModelMap map, HttpServletRequest req, HttpServletResponse resp) throws IOException {

        if (consumer.equals("student")) {
            Student student = studentService.checkUserLoginDao(name, password);

            if (student!=null) {

                HttpSession id=req.getSession();
                HttpSession uname=req.getSession();
                id.setMaxInactiveInterval(30);
                uname.setMaxInactiveInterval(30);
                id.setAttribute("id",student.getId());
                uname.setAttribute("uname",name);

                return "/student/studentmanage";
            } else{
                String message = "账号密码输入错误";
                map.put("message", message);

                return login();
                  }
          } else {
           Teacher teacher = teacherService.checkUserLoginDao(name, password);
           if (teacher!= null) {
               HttpSession id=req.getSession();
               HttpSession uname=req.getSession();
//                 id.setMaxInactiveInterval(30);
//                 uname.setMaxInactiveInterval(30);
//               Cookie c1=new Cookie("id",String.valueOf(teacher.getId()));
//               c1.setMaxAge(3*24*3600);
//               c1.setPath("/cookie/abc");
               id.setAttribute("id",teacher.getId());
               uname.setAttribute("uname",name);

               return "/teacher/teachermanage";
           } else {
               String message = "账号密码输入错误";
               map.put("message", message);
               return login();
            }
        }
    }
}



