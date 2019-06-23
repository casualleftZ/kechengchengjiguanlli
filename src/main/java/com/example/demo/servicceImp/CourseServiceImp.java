package com.example.demo.servicceImp;

import com.example.demo.dao.Class_studentDao;
import com.example.demo.dao.TimeableDao;
import com.example.demo.entity.Class_student;
import com.example.demo.entity.Timeable;
import com.example.demo.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImp implements CourseService {
    @Resource
    TimeableDao timeableDao;
    @Resource
    Class_studentDao class_studentDao;
    @Override
    public List<Timeable> selectclass() {
        return timeableDao.selectclass();   //查看课程表
    }

    @Override
    public Class_student addclass(int course_class_id,int stu_id) {
        return class_studentDao.addclass(course_class_id,stu_id);
    }
}
