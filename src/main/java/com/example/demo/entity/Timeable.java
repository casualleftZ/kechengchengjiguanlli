package com.example.demo.entity;

import lombok.Data;

@Data
public class Timeable {
    private int id;
    private String cname;
    private String tname;
    private int num;
    private int tchour;
    private int tlhour;
    private String class_place;
    private String class_time;

    public Timeable(int id, String cname,int number, String tname, int tchour, int tlhour, String class_place, String class_time) {
        this.id = id;
        this.cname = cname;
        this.tname = tname;
        this.tchour = tchour;
        this.tlhour = tlhour;
        this.class_place = class_place;
        this.class_time = class_time;
        this.num=num;
    }

    public Timeable(){

    }
}

