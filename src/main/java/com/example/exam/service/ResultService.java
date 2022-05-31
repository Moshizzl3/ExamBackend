package com.example.exam.service;

import com.example.exam.entity.Result;
import com.example.exam.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultService {

  @Autowired
  private ResultRepository resultRepository;

  public List<Result> getAllResults() {
    return  resultRepository.findAll();
  }

  public void saveResult(Result result){
    resultRepository.save(result);
  }
}
