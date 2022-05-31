package com.example.exam.config;

import com.example.exam.entity.Result;
import com.example.exam.entity.Rider;
import com.example.exam.entity.Team;
import com.example.exam.service.ResultService;
import com.example.exam.service.RiderService;
import com.example.exam.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class InitData implements CommandLineRunner {

  @Autowired
  RiderService riderService;

  @Autowired
  TeamService teamService;

  @Autowired
  ResultService resultService;


  @Override
  public void run(String... args) throws Exception {

    List<Rider> riders = new ArrayList<>();
    List<Rider> riders1 = new ArrayList<>();
    List<Rider> riders2 = new ArrayList<>();
    List<Rider> riders3 = new ArrayList<>();
    List<Rider> riders4 = new ArrayList<>();

    Rider rider = new Rider();
    rider.setRiderName("Bjarne Riis");
    rider.setRiderNumber(1);
    rider.setRiderBirthDate(LocalDate.parse("1992-10-01"));
    rider.setRiderCountry("DK");
    riders.add(rider);
    riderService.saveRider(rider);


    Rider rider1 = new Rider();
    rider1.setRiderName("Flemming Hansen");
    rider1.setRiderNumber(1);
    rider1.setRiderBirthDate(LocalDate.parse("1992-10-01"));
    rider1.setRiderCountry("UK");
    riders1.add(rider1);
    riderService.saveRider(rider1);

    Rider rider2 = new Rider();
    rider2.setRiderName("Søren Bo");
    rider2.setRiderNumber(1);
    rider2.setRiderBirthDate(LocalDate.parse("1993-11-11"));
    rider2.setRiderCountry("DK");
    riders1.add(rider2);
    riderService.saveRider(rider2);

    Rider rider3 = new Rider();
    rider3.setRiderName("Kasper Korndal");
    rider3.setRiderNumber(1);
    rider3.setRiderBirthDate(LocalDate.parse("1989-09-01"));
    rider3.setRiderCountry("SE");
    riders1.add(rider3);
    riderService.saveRider(rider3);

    Rider rider4 = new Rider();
    rider4.setRiderName("Henrik Hansen");
    rider4.setRiderNumber(1);
    rider4.setRiderBirthDate(LocalDate.parse("1999-10-01"));
    rider4.setRiderCountry("SE");
    riders1.add(rider4);
    riderService.saveRider(rider4);

    Rider rider5 = new Rider();
    rider5.setRiderName("Silke VoidCat");
    rider5.setRiderNumber(1);
    rider5.setRiderBirthDate(LocalDate.parse("2002-10-01"));
    rider5.setRiderCountry("SE");
    riders1.add(rider5);
    riderService.saveRider(rider5);


    Rider rider6 = new Rider();
    rider6.setRiderName("Mohamad Ibrahim");
    rider6.setRiderNumber(2);
    rider6.setRiderBirthDate(LocalDate.parse("2003-10-01"));
    rider6.setRiderCountry("PA");
    riders2.add(rider6);
    riderService.saveRider(rider6);


    Rider rider7 = new Rider();
    rider7.setRiderName(" Benny Hansen");
    rider7.setRiderNumber(13);
    rider7.setRiderBirthDate(LocalDate.parse("2005-12-01"));
    rider7.setRiderCountry("UK");
    riders2.add(rider7);
    riderService.saveRider(rider7);

    Rider rider8 = new Rider();
    rider8.setRiderName("August den Skæggede");
    rider8.setRiderNumber(3);
    rider8.setRiderBirthDate(LocalDate.parse("2006-08-11"));
    rider8.setRiderCountry("NO");
    riders2.add(rider8);
    riderService.saveRider(rider8);

    Rider rider9 = new Rider();
    rider9.setRiderName("Basil Mus");
    rider9.setRiderNumber(7);
    rider9.setRiderBirthDate(LocalDate.parse("2009-09-01"));
    rider9.setRiderCountry("SE");
    riders2.add(rider9);
    riderService.saveRider(rider9);

    Rider rider10 = new Rider();
    rider10.setRiderName("Kristian Kryger");
    rider10.setRiderNumber(420);
    rider10.setRiderBirthDate(LocalDate.parse("1999-10-01"));
    rider10.setRiderCountry("IT");
    riders2.add(rider10);
    riderService.saveRider(rider10);

    Rider rider11 = new Rider();
    rider11.setRiderName("Andreas Viking");
    rider11.setRiderNumber(11);
    rider11.setRiderBirthDate(LocalDate.parse("2006-10-01"));
    rider11.setRiderCountry("SE");
    riders.add(rider11);
    riderService.saveRider(rider11);

    Rider rider12 = new Rider();
    rider12.setRiderName("Anders Madsen");
    rider12.setRiderNumber(11);
    rider12.setRiderBirthDate(LocalDate.parse("2009-10-01"));
    rider12.setRiderCountry("GR");
    riders.add(rider12);
    riderService.saveRider(rider12);

    Rider rider13 = new Rider();
    rider13.setRiderName("Søren Banjomus");
    rider13.setRiderNumber(11);
    rider13.setRiderBirthDate(LocalDate.parse("2007-10-01"));
    rider13.setRiderCountry("SE");
    riders.add(rider13);
    riderService.saveRider(rider13);

    Rider rider14 = new Rider();
    rider14.setRiderName("Andreas Viking");
    rider14.setRiderNumber(11);
    rider14.setRiderBirthDate(LocalDate.parse("2002-10-01"));
    rider14.setRiderCountry("SE");
    riders.add(rider14);
    riderService.saveRider(rider14);


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

    Team team2 = new Team();
    team2.setRiders(riders2);
    team2.setTeamCountry("FR");
    team2.setTeamName("Team 3");
    teamService.saveTeam(team2);

    Result result = new Result();
    result.setMountainPoint(2);
    result.setSprintPoint(3);
    result.setRider(rider);
    result.setStage(1);
    result.setTime(LocalTime.parse("01:10:01"));
    resultService.saveResult(result);

    Result result1 = new Result();
    result1.setMountainPoint(1);
    result1.setSprintPoint(3);
    result1.setRider(rider);
    result1.setStage(2);
    result1.setTime(LocalTime.parse("02:10:01"));
    resultService.saveResult(result1);

    Result result2 = new Result();
    result2.setMountainPoint(0);
    result2.setSprintPoint(6);
    result2.setRider(rider);
    result2.setStage(3);
    result2.setTime(LocalTime.parse("01:18:01"));
    resultService.saveResult(result2);

    Result result3 = new Result();
    result3.setMountainPoint(1);
    result3.setSprintPoint(4);
    result3.setRider(rider1);
    result3.setStage(1);
    result3.setTime(LocalTime.parse("01:39:01"));
    resultService.saveResult(result3);

    Result result4 = new Result();
    result4.setMountainPoint(7);
    result4.setSprintPoint(2);
    result4.setRider(rider1);
    result4.setStage(2);
    result4.setTime(LocalTime.parse("03:12:01"));
    resultService.saveResult(result4);

    Result result5 = new Result();
    result5.setMountainPoint(1);
    result5.setSprintPoint(5);
    result5.setRider(rider1);
    result5.setStage(3);
    result5.setTime(LocalTime.parse("01:11:01"));
    resultService.saveResult(result5);

    Result result6 = new Result();
    result6.setMountainPoint(7);
    result6.setSprintPoint(6);
    result6.setRider(rider2);
    result6.setStage(1);
    result6.setTime(LocalTime.parse("01:29:01"));
    resultService.saveResult(result6);

    Result result7 = new Result();
    result7.setMountainPoint(7);
    result7.setSprintPoint(2);
    result7.setRider(rider2);
    result7.setStage(2);
    result7.setTime(LocalTime.parse("03:14:01"));
    resultService.saveResult(result7);

    Result result8 = new Result();
    result8.setMountainPoint(3);
    result8.setSprintPoint(4);
    result8.setRider(rider2);
    result8.setStage(3);
    result8.setTime(LocalTime.parse("01:16:11"));
    resultService.saveResult(result8);

    Result result6 = new Result();
    result6.setMountainPoint(7);
    result6.setSprintPoint(6);
    result6.setRider(rider2);
    result6.setStage(1);
    result6.setTime(LocalTime.parse("01:29:01"));
    resultService.saveResult(result6);

    Result result7 = new Result();
    result7.setMountainPoint(7);
    result7.setSprintPoint(2);
    result7.setRider(rider2);
    result7.setStage(2);
    result7.setTime(LocalTime.parse("03:14:01"));
    resultService.saveResult(result7);

    Result result8 = new Result();
    result8.setMountainPoint(3);
    result8.setSprintPoint(4);
    result8.setRider(rider2);
    result8.setStage(3);
    result8.setTime(LocalTime.parse("01:16:11"));
    resultService.saveResult(result8);


  }

}
