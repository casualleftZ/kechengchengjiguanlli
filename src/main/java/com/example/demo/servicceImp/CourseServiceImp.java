package com.example.demo.servicceImp;

import com.example.demo.dao.TimeableDao;
import com.example.demo.entity.Timeable;
import com.example.demo.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImp implements CourseService {
    @Resource
    TimeableDao timeableDao;

    @Override
    public List<Timeable> selectclass() {
        return timeableDao.selectclass();
    }
}
