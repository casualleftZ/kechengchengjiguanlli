package com.example.demo.dao;

import com.example.demo.entity.TimeCourse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TimeCourseDao {
    List<TimeCourse>lookcourse(int stu_id);
}
