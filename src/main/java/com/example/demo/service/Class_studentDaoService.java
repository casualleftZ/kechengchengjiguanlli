package com.example.demo.service;

import com.example.demo.dao.Class_studentDao;
import com.example.demo.entity.Class_student;
import com.example.demo.entity.Student2;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface Class_studentDaoService {
    //查询课程下的学生
    List<Student2> getclassstudent(int course_id);


}
