package com.youssef.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class StudentService {
    public List<Student> findAllStudent(){
        return List.of(
                new Student(
                        "Youssef",
                        "gharbi",
                        LocalDate.now(),
                        "gh.youssef@gmail.com",
                        23
                ),
                new Student(
                        "joe",
                        "gharbi",
                        LocalDate.now(),
                        "gh.joe@gmail.com",
                        25
                )
        );
    }
}
