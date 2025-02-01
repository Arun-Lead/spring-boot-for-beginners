package com.alibou.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> findAllStudents(){
        return List.of(
                new Student(
                        "Ali",
                        "AMST",
                        LocalDate.now(),
                        "contact@aliamstcoding.com",
                        34
                ),
                new Student(
                        "Arun",
                        "AMST",
                        LocalDate.now(),
                        "contact@aliamstcoding.com",
                        28
                )
        );
    } 

}
