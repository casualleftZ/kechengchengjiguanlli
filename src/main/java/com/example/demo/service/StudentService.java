package com.example.demo.service;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    Student checkUserLoginDao(String name, String pwd);
}
