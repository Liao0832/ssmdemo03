package com.example.service.service;

import com.example.mybatis.entity.Student;

import java.util.List;

public interface studentService {
    List<Student> allStudents();
    Student selectStudentById(int id);
    int addStudent(Student student);
    List<Student> studentList();
    int updateStudent(Student student);
    int deleteStudentById(int id);
}
