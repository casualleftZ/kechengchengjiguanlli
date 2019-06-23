package com.example.demo.service;

import com.example.demo.dao.TimeableDao;
import com.example.demo.entity.Timeable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    List<Timeable> selectclass();
}
