package com.example.demodatabase;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "student")
public class Student {
    @Id
    @Column(name ="id")
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name ="age")
    private int age;

    @Column(name ="schoolid")
    private int schoolid;

    @Column(name ="classid")
    private int classid;

}
