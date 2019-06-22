package com.example.demo.entity;

import lombok.Data;

@Data
public class Timeable {
    private int id;
    private String cname;  //课程名字
    private String stu_name;//1

    public Timeable(int id, String cname, String stu_name) {
        this.id = id;
        this.cname = cname;
        this.stu_name = stu_name;
    }
    public Timeable(){

    }
}

