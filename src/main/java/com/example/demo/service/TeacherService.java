package com.example.demo.service;

import com.example.demo.entity.Teacher;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService  {
    Teacher checkUserLoginDao(String name, String pwd);
}
