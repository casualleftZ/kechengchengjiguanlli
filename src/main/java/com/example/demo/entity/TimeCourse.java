package com.example.demo.entity;

import lombok.Data;

@Data
public class TimeCourse {
    private String cname;
    private String tname;
    private String class_place;
    private String class_time;

    public TimeCourse(String cname, String tname, String class_place, String class_time) {
        this.cname = cname;
        this.tname = tname;
        this.class_place = class_place;
        this.class_time = class_time;
    }

    public TimeCourse(){

    }
}
