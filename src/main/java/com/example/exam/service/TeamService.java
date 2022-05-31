package com.example.exam.service;

import com.example.exam.entity.Team;
import com.example.exam.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

  @Autowired
  TeamRepository teamRepository;

  public void saveTeam(Team team) {
     teamRepository.save(team);
  }

  public List<Team> findAllTeams() {
    return teamRepository.findAll();
  }
}
