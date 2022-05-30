package com.example.exam.controller;

import com.example.exam.entity.Result;
import com.example.exam.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/result")
@CrossOrigin
public class ResultRestController {

  @Autowired
  ResultService resultService;

  @GetMapping("all-results")
  public List<Result> getAllResults(){
    return resultService.getAllResults();
  }

}
