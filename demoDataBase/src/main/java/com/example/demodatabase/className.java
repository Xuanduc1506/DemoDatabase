package com.example.demodatabase;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "class")
public class className {
    @Id
    @Column(name ="id")
    private int id;

    @Column(name ="name")
    private String name;
}
