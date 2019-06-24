package com.example.demo.service;

import com.example.demo.entity.Class_student;
import com.example.demo.entity.Class_student2;
import com.example.demo.entity.TimeCourse;
import com.example.demo.entity.Timeable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    List<Timeable> selectclass();      //显示课程

    Class_student addclass(int course_class_id,int stu_id);  //添加课程

    Class_student selectclass(int course_class_id,int stu_id); //查找课程是否有

    Class_student deleteclass(int class_id, int id2);  //删除课程

    List<TimeCourse> lookcourse(int stu_id);   //展示课程表

    List<Class_student2> selectscore(int stu_id);   //查看分数
}

