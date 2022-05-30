package com.example.exam.controller;

import com.example.exam.entity.Team;
import com.example.exam.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/team")
@CrossOrigin
public class TeamRestController {

  @Autowired
  TeamService teamService;

  @GetMapping("/all-teams")
  public List<Team> getAllTeam(){
    return teamService.findAllTeams();
  }

  @PostMapping("/")
  @ResponseStatus(HttpStatus.CREATED)
  public void postTeam(@RequestBody Team team){
    System.out.println("bla bla");
    teamService.saveTeam(team);
  }

}
