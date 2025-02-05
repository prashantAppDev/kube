package com.prashant.kube.dao;

import com.prashant.kube.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> { }
