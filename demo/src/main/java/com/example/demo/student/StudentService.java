package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Mano Jalil",
                        "mano@gmail.com",
                        LocalDate.of(1994, Month.JULY, 17),
                        27
                )
        );
    }
}
