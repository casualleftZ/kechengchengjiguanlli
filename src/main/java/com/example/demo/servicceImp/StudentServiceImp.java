package com.example.demo.servicceImp;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImp implements StudentService {
    @Resource
    StudentDao studentDao;
    @Override
    public Student checkUserLoginDao(String name, String pwd) {
        return studentDao.checkUserLoginDao(name,pwd);
    }
}
