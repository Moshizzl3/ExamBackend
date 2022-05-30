package com.example.exam.config;

import com.example.exam.entity.Rider;
import com.example.exam.entity.Team;
import com.example.exam.service.RiderService;
import com.example.exam.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class InitData implements CommandLineRunner {

  @Autowired
  RiderService riderService;

  @Autowired
  TeamService teamService;


  @Override
  public void run(String... args) throws Exception {

    List<Rider> riders = new ArrayList<>();
    List<Rider> riders1 = new ArrayList<>();

    Rider rider = new Rider();
    rider.setRiderName("Bjarne Riis");
    rider.setRiderNumber(1);
    rider.setRiderBirthDate(LocalDate.now());
    rider.setRiderCountry("DK");
    riders.add(rider);
    riderService.saveRider(rider);


    Rider rider1 = new Rider();
    rider1.setRiderName("Flemmijng Hansen");
    rider1.setRiderNumber(1);
    rider1.setRiderBirthDate(LocalDate.now());
    rider1.setRiderCountry("DK");
    riders1.add(rider1);
    riderService.saveRider(rider1);

    Team team = new Team();
    team.setRiders(riders);
    team.setTeamCountry("DK");
    team.setTeamName("Team Easy On");
    teamService.saveTeam(team);

    Team team1 = new Team();
    team1.setRiders(riders1);
    team1.setTeamCountry("DK");
    team1.setTeamName("Team 2");
    teamService.saveTeam(team1);



  }

}
