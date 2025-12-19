package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentIdCard{
    @OneToOne
    @JoinColumn(name="student_id")
    private StudentDetails detail;
    private String idCardNum;
}