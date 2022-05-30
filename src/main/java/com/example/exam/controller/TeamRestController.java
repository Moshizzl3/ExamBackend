package com.example.exam.controller;

import com.example.exam.entity.Team;
import com.example.exam.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/team")
@CrossOrigin
public class TeamRestController {

  @Autowired
  TeamRepository teamRepository;

  @GetMapping("/all-teams")
  public List<Team> getAllTeam(){
    return teamRepository.findAll();
  }

}
