package com.example.demo.entity;

import lombok.Data;

@Data
public class Teacher {
    private  int id;
    private  String tcode;
    private String name;
    private String gender;
    private String degree;
    private String title;
    private String introduction;
    private String photo;
    private String pwd;

    public Teacher(int id, String tcode, String name, String gender, String degree, String title, String introduction, String photo,String pwd) {
        this.id = id;
        this.tcode = tcode;
        this.name = name;
        this.gender = gender;
        this.degree = degree;
        this.title = title;
        this.introduction = introduction;
        this.photo = photo;
        this.pwd=pwd;
    }
    private Teacher(){

    }
}
