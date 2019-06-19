package com.example.demo.entity;

import com.sun.deploy.panel.ITreeNode;

public class Student {
    private int id;
    private int scode;
    private String name;
    private String gender;
    private String photo;
    private int class_id;

    public Student(int id, int scode, String name, String gender, String photo, int class_id) {
        this.id = id;
        this.scode = scode;
        this.name = name;
        this.gender = gender;
        this.photo = photo;
        this.class_id = class_id;
    }
    public Student(){

    }
}
