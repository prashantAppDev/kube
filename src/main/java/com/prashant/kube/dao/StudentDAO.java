package com.prashant.kube.dao;

import com.prashant.kube.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentDAO extends CrudRepository<Student, String> { }
