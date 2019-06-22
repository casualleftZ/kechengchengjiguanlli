package com.example.demo.dao;

import com.example.demo.entity.Course_class;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Course_classDao {
    //根据教师ID查询教师的课
    List<Course_class> getclass(Integer teacher_id);
}
