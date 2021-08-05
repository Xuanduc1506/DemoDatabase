package com.example.demodatabase;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentRespond {
    private int id;
    private String name;
    private int age;
    private String schoolName;
    private String className;

}
