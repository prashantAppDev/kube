package com.prashant.kube.service;

import com.prashant.kube.dao.StudentRepository;
import com.prashant.kube.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudentById(String id) {
        Optional<Student> optional = studentRepository.findById(id);
        return optional.orElse(null);
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }

    public void addStudent(Student s) {
        studentRepository.save(s);
    }

}
