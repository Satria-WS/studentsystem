package com.springCourse.studentsystem.service;


import com.springCourse.studentsystem.model.Student;

import java.util.List;

//Saving Data into MySql database
public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
