package com.youssef.springdemo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @GetMapping
    public List<Student> findAllStudent(){
        return List.of(
                new Student(
                firstname: "Youssef",
                lastname: "Gharbi",
                LocalDate.now(),
                email: "gh.youssef.arbi@gmail.com",
                age: 25
            ),
        new Student(
                firstname: "Joe",
                lastname: "Gharbi",
                LocalDate.now(),
                email: "joe.arbi@gmail.com",
                age: 25
            )
        );
    }



}
