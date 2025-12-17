package com.example.demo.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudentRepository student;
    @Override 
    public StudentEntity postData(StudentEntity stu){
        return student.save(stu);
    }
}
