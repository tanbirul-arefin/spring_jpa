package com.real.spring_jpa.repository;

import com.real.spring_jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository<Student,Integer> {

}
