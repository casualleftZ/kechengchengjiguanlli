package com.example.demo.dao;

import com.example.demo.entity.Class;
import com.example.demo.entity.Class_student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Class_studentDao {
    //查询课程下的学生
    List<Class_student> getclassstudent(Integer course_id);

    Class_student addclass(int course_class_id,int stu_id);

    Class_student selectclass(int course_class_id,int stu_id);  //课程号查找课程

    Class_student deleteclass(int course_class_id,int stu_id);   //删除课程
}
