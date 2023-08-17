package com.youssef.springdemo.student;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.time.LocalDate;
@Entity
@Table(name = "student")
public class Student {


    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String lastname;
    private LocalDate localDate;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String firstname, String lastname, LocalDate localDate, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.localDate = localDate;
        this.email = email;
        this.age = age;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student() {
    }

}
