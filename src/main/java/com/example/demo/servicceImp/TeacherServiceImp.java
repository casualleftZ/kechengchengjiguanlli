package com.example.demo.servicceImp;

import com.example.demo.dao.TeacherDao;
import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TeacherServiceImp implements TeacherService {
    @Resource
    TeacherDao teacherDao;
    @Override
    public Teacher checkUserLoginDao(String name, String pwd){
     return  teacherDao.checkUserLoginDao(name,pwd);
    }

}
