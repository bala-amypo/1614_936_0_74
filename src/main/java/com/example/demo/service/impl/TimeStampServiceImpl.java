package com.example.demo.service.impl;
import java.util.*;
import com.example.demo.service.TimeStampService;
import com.example.demo.repository.TimeStampRepository;
import com.example.demo.entity.TimeStampEntity;
import com.example.demo.exception.ValidationException;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TimeStampServiceImpl implements TimeStampService{
     @Autowired TimeStampRepository dent;
     
          @Override
          public TimeStamp post1(TimeStamp c){
               return dent.save(c);
          }
}