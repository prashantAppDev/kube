package com.prashant.kube.controller;

import com.prashant.kube.entity.Student;
import com.prashant.kube.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class KubeController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@RequestParam(name = "id") String id) {
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping
    public ResponseEntity<UUID> addStudent(@RequestBody Student student) {
        Student s = studentService.addStudent(student);
        return ResponseEntity.status(201).body(s.getId());
    }

    @GetMapping("/greetings")
    public ResponseEntity<String> getGreetings() {
        return ResponseEntity.ok("Hello from Springboot!");
    }
}
