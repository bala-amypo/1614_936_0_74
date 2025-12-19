package com.example.demo.service.impl;
import java.util.*;
import com.example.demo.service.ValidationService;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.exception.ValidationException;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TimeStampServiceImpl implements TimeStampService{
     @Autowired ValidationRepository dent;
     
          @Override
          public TimeStamp post(TimeStamp stu){
               return dent.save(stu);
          }
          @Override
          public TimeStamp finddata(Long id){
               return dent.findById(id).orElseThrow(()->new ValidationException("Invalid Id"+id));
          }
}