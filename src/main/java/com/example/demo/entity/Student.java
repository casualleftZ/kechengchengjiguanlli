package com.example.demo.entity;


import lombok.Data;

@Data
public class Student {
    private int id;
    private int scode;
    private String sname;
    private String gender;
    private String photo;
    private int class_id;
    private String pwd;

    public Student(int id, int scode, String sname, String gender, String photo, int class_id,String pwd) {
        this.id = id;
        this.scode = scode;
        this.sname = sname;
        this.gender = gender;
        this.photo = photo;
        this.class_id = class_id;
        this.pwd=pwd;
    }
    public Student(){

    }

}
