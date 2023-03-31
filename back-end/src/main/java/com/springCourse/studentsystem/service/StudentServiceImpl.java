package com.springCourse.studentsystem.service;
//java.util.List <com.springCourse.studentsystem.model.Student>


import com.springCourse.studentsystem.model.Student;
import com.springCourse.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    //Override
    //using ctrl o

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

//    @Override
//    public List<Student> getAllStudents() {
//        return studentRepository.findAll();
//    }


    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
