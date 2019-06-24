package com.example.demo.servicceImp;

import com.example.demo.dao.Course_classDao;
import com.example.demo.entity.Course_class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Course_classDaoServiceimp implements com.example.demo.service.Course_classDaoService {

    @Autowired
    private Course_classDao course_classDao;
    @Override
    public List<Course_class> getclass() {
        List<Course_class> list=course_classDao.getclass();
        return list;
    }

    @Override
    public List<Course_class> getteacherclass(Integer teacher_id) {
        return course_classDao.getteacherclass(teacher_id);
    }
}
