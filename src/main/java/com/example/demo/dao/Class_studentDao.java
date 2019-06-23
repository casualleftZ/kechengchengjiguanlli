package com.example.demo.dao;

import com.example.demo.entity.Class_student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Class_studentDao {
    Class_student addclass(int course_class_id,int stu_id);
}
