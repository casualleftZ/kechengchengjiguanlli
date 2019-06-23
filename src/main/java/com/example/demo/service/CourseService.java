package com.example.demo.service;

import com.example.demo.dao.TimeableDao;
import com.example.demo.entity.Class_student;
import com.example.demo.entity.Timeable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    List<Timeable> selectclass();      //显示课程

    Class_student addclass(int course_class_id,int stu_id);  //添加课程
}
