package com.example.demo.entity;

import lombok.Data;

@Data
public class Class {
    private int id;
    private String name;
    private int enroll_year;
    private int major_id;

    public Class(int id, String name, int enroll_year, int major_id) {
        this.id = id;
        this.name = name;
        this.enroll_year = enroll_year;
        this.major_id = major_id;
    }
    public Class(){

    }
}
