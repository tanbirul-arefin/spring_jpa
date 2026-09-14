package com.real.spring_jpa.service;

import com.real.spring_jpa.model.Student;
import com.real.spring_jpa.repository.studentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StudentService {

    private final studentRepo studentRepo;

    public void saveStudent(Student student){

    }

    public List<Student> getStudents(){
        return studentRepo.findAll();
    }

    public Student getStudent(int id){
        return null;
    }

    public List<Student> getStudentsByDepartment(String name){
        return null;
    }
    public void updateStudent(Student student){

    }
    public void deleteStudent(int id){

    }
}
