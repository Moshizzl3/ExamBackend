package com.example.exam.controller;

import com.example.exam.entity.Rider;
import com.example.exam.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/rider")
@CrossOrigin
public class RiderRestController {

  @Autowired
  RiderService riderService;



  @GetMapping("/all-riders")
  public List<Rider> getAllRiders(){
    return riderService.getAllRiders();
  }

  @GetMapping("/all-riders-by-team/{id}")
  public List<Rider> getAllRidersByTeam(@PathVariable int id){
    return riderService.getAllRidersByTeam(id);
  }

}
