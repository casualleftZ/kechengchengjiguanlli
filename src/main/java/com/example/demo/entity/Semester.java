package com.example.demo.entity;

import lombok.Data;

@Data
public class Semester {
    private int id;
    private String name;

    public Semester(int id, String name) {
        this.id = id;
        this.name = name;
    }
    private Semester(){

    }
}
