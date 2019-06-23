package com.example.demo.dao;

import com.example.demo.entity.Timeable;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TimeableDao {
    List<Timeable> selectclass();
}
