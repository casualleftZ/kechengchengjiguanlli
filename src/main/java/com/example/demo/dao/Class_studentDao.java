package com.example.demo.dao;

import com.example.demo.entity.Class_student;

import java.util.List;

public interface Class_studentDao {
    //查询课程下的学生
    List<Class_student> getclassstudent(Integer course_id);

    Class_student addclass(int course_class_id,int stu_id);
}
