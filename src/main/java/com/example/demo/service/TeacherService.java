package com.example.demo.service;

import com.example.demo.entity.Course_class;
import com.example.demo.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TeacherService  {
    Teacher checkUserLoginDao(String name, String pwd);
    //根据老师id查询所带课程

}
