package com.example.demo.servicceImp;

import com.example.demo.dao.Course_classDao;
import com.example.demo.entity.Course_class;
import com.example.demo.entity.Teacher_class;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Course_classDaoServiceimp implements com.example.demo.service.Course_classDaoService {

    @Resource
    private Course_classDao course_classDao;
    @Override
    public List<Course_class> getclass() {
        List<Course_class> list=course_classDao.getclass();
        return list;
    }

    @Override
    public List<Teacher_class> getteacherclass(int teacher_id) {
        return  course_classDao.getteacherclass(teacher_id);
    }

}

