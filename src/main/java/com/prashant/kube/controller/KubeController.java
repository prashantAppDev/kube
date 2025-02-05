package com.prashant.kube.controller;

import com.prashant.kube.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubeController {

    @GetMapping("/")
    public ResponseEntity<Student> getHelloWorld() {
        return ResponseEntity.ok(new Student("01", "Ryan", 25));
    }
}
