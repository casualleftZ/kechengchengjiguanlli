package com.example.demo.dao;


import com.example.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentDao {
    Student checkUserLoginDao(@Param("loginName") String name, @Param("loginPwd") String pwd);
}
