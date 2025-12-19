package com.example.demo.entity;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentIdCard{
    private int id;
    private String idCardNum;
}