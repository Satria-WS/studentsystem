package com.springCourse.studentsystem.service;

import com.springCourse.studentsystem.model.Student;
import com.springCourse.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService {
    //Override
    //using ctrl o

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return null;
    }
}
