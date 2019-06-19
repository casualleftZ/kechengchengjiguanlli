package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.service.StudentService;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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
    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/login")

    public String login() {
        return "login/login";
    }

    @RequestMapping("/validateStudent")
    public String Login(String name, String password, String consumer,
                        ModelMap map, HttpSession session) {
      if (consumer.equals("student")) {
            Student student = studentService.checkUserLoginDao(name, password);
            if (student!=null) {
               return "/student/studentmanage";
            } else{
                String message = "账号密码输入错误";
                map.put("message", message);

                return login();
                  }
          } else {
           Teacher teacher = teacherService.checkUserLoginDao(name, password);
           if (teacher!= null) {
               return "/teacher/teachermanage";
           } else {
               String message = "账号密码输入错误";
               map.put("message", message);
               return login();
            }
        }
    }
}



