package com.example.demodatabase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {
    private List<StudentRespond> list = new ArrayList<>();
    private StudentRepository studentRepository;

    public HomeController (StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @GetMapping("/home")
    public List<StudentRespond> getList() {
        return studentRepository.getList();
    }
}
