package com.example.demo.entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
public class Course {
    private int id;
    private String num;
    private String cname;
    private String ename;
    private int score;
    private int chour;  //周理论学时
    private int ihour;  //周实验学士
    private int tchour; //理论总学时
    private int tlhour; //实验总学时

    public Course(int id, String num, String cname, String ename, int score, int chour, int ihour, int tchour, int tlhour) {
        this.id = id;
        this.num = num;
        this.cname = cname;
        this.ename = ename;
        this.score = score;
        this.chour = chour;
        this.ihour = ihour;
        this.tchour = tchour;
        this.tlhour = tlhour;
    }
    public Course(){

    }
}
