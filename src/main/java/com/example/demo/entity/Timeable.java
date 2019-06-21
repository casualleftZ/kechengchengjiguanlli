package com.example.demo.entity;

import lombok.Data;

@Data
public class Timeable {
    private int id;
    private String cname;
    private String stu_name;

    public Timeable(int id, String cname, String stu_name) {
        this.id = id;
        this.cname = cname;
        this.stu_name = stu_name;
    }
    public Timeable(){

    }
}

