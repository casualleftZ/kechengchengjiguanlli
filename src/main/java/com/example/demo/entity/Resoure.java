package com.example.demo.entity;

import lombok.Data;

@Data
public class Resoure {
    private int id;
    private int course_id;
    private String name;
    private String resoource_url;

    public Resoure(int id, int course_id, String name, String resoource_url) {
        this.id = id;
        this.course_id = course_id;
        this.name = name;
        this.resoource_url = resoource_url;
    }
    public Resoure(){

    }
}
