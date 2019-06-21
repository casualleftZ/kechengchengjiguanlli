package com.example.demo.controller;

import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class StudentManageContoller {
    @Autowired
    private StudentService studentService;
    @RequestMapping("/studentclass")
    public String StudentManage(HttpServletRequest req, HttpServletResponse resp,HttpSession session)throws IOException{
//        HttpSession uname=req.getSession();
//        String name=(String)uname.getAttribute("uname");
//        System.out.println("StudentManage.service"+name);



        return "student/studentclass";
    }

}
