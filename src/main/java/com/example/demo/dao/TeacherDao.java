package com.example.demo.dao;


import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TeacherDao {
    Teacher checkUserLoginDao(@Param("loginName")String name, @Param("loginPwd")String pwd);
}
