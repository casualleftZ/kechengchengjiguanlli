package com.example.demo.dao;

import com.example.demo.entity.Course_class;
import com.example.demo.entity.Teacher_class;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface Course_classDao {
    //查询开班的课程
    List<Course_class> getclass();
    //根据老师id查询所带课程
    List<Teacher_class> getteacherclass(int teacher_id);
}
