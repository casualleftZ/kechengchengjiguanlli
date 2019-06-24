package com.example.demo.service;

import com.example.demo.entity.Course_class;
import com.example.demo.entity.Teacher;
import com.example.demo.entity.Teacher_class;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Course_classDaoService {
    //查询开班信息
    List<Course_class> getclass();
    //根据老师id查询所带课程
    List<Teacher_class> getteacherclass(int teacher_id);
}
