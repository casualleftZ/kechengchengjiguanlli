package com.example.demo.entity;

import lombok.Data;

@Data
public class Categoty_course {
    private int id;
    private int name;

    public Categoty_course(int id, int name) {
        this.id = id;
        this.name = name;
    }
    public Categoty_course(){

    }
}
