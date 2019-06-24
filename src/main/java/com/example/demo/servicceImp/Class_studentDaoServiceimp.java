package com.example.demo.servicceImp;

import com.example.demo.dao.Class_studentDao;
import com.example.demo.entity.Class_student;
import com.example.demo.entity.Student2;
import com.example.demo.service.Class_studentDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class Class_studentDaoServiceimp implements Class_studentDaoService {
    @Resource
    Class_studentDao class_studentDao;


    @Override
    public List<Student2> getclassstudent(int course_id) {
        return class_studentDao.getclassstudent(course_id);
    }
}
