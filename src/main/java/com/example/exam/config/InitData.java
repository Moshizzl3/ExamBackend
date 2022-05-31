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
    rider2.setRiderBirthDate(LocalDate.parse("1990-11-11"));
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
    team1.setTeamCountry("GR");
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
    result2.setSprintPoint(2);
    result2.setRider(rider);
    result2.setStage(3);
    result2.setTime(LocalTime.parse("01:18:01"));
    resultService.saveResult(result2);

    Result result3 = new Result();
    result3.setMountainPoint(1);
    result3.setSprintPoint(0);
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
    result8.setMountainPoint(0);
    result8.setSprintPoint(0);
    result8.setRider(rider2);
    result8.setStage(3);
    result8.setTime(LocalTime.parse("01:16:11"));
    resultService.saveResult(result8);

    Result result9 = new Result();
    result9.setMountainPoint(0);
    result9.setSprintPoint(0);
    result9.setRider(rider3);
    result9.setStage(1);
    result9.setTime(LocalTime.parse("01:19:01"));
    resultService.saveResult(result9);

    Result result10 = new Result();
    result10.setMountainPoint(0);
    result10.setSprintPoint(2);
    result10.setRider(rider3);
    result10.setStage(2);
    result10.setTime(LocalTime.parse("03:44:01"));
    resultService.saveResult(result10);

    Result result11 = new Result();
    result11.setMountainPoint(0);
    result11.setSprintPoint(0);
    result11.setRider(rider3);
    result11.setStage(3);
    result11.setTime(LocalTime.parse("01:36:11"));
    resultService.saveResult(result11);

    Result result12 = new Result();
    result12.setMountainPoint(2);
    result12.setSprintPoint(0);
    result12.setRider(rider4);
    result12.setStage(1);
    result12.setTime(LocalTime.parse("01:16:01"));
    resultService.saveResult(result12);

    Result result13 = new Result();
    result13.setMountainPoint(0);
    result13.setSprintPoint(2);
    result13.setRider(rider4);
    result13.setStage(2);
    result13.setTime(LocalTime.parse("02:44:01"));
    resultService.saveResult(result13);

    Result result14 = new Result();
    result14.setMountainPoint(0);
    result14.setSprintPoint(0);
    result14.setRider(rider4);
    result14.setStage(3);
    result14.setTime(LocalTime.parse("01:56:11"));
    resultService.saveResult(result14);

    Result result15 = new Result();
    result15.setMountainPoint(2);
    result15.setSprintPoint(0);
    result15.setRider(rider5);
    result15.setStage(1);
    result15.setTime(LocalTime.parse("01:11:01"));
    resultService.saveResult(result15);

    Result result16 = new Result();
    result16.setMountainPoint(7);
    result16.setSprintPoint(2);
    result16.setRider(rider5);
    result16.setStage(2);
    result16.setTime(LocalTime.parse("02:30:01"));
    resultService.saveResult(result16);

    Result result17 = new Result();
    result17.setMountainPoint(0);
    result17.setSprintPoint(9);
    result17.setRider(rider5);
    result17.setStage(3);
    result17.setTime(LocalTime.parse("01:40:11"));
    resultService.saveResult(result17);

    Result result18 = new Result();
    result18.setMountainPoint(2);
    result18.setSprintPoint(1);
    result18.setRider(rider6);
    result18.setStage(1);
    result18.setTime(LocalTime.parse("02:10:01"));
    resultService.saveResult(result15);

    Result result19 = new Result();
    result19.setMountainPoint(0);
    result19.setSprintPoint(3);
    result19.setRider(rider6);
    result19.setStage(2);
    result19.setTime(LocalTime.parse("02:25:01"));
    resultService.saveResult(result19);

    Result result20 = new Result();
    result20.setMountainPoint(3);
    result20.setSprintPoint(2);
    result20.setRider(rider6);
    result20.setStage(3);
    result20.setTime(LocalTime.parse("01:27:11"));
    resultService.saveResult(result20);

    Result result21 = new Result();
    result21.setMountainPoint(2);
    result21.setSprintPoint(4);
    result21.setRider(rider7);
    result21.setStage(1);
    result21.setTime(LocalTime.parse("02:11:01"));
    resultService.saveResult(result21);

    Result result22 = new Result();
    result22.setMountainPoint(0);
    result22.setSprintPoint(0);
    result22.setRider(rider7);
    result22.setStage(2);
    result22.setTime(LocalTime.parse("02:11:01"));
    resultService.saveResult(result22);

    Result result23 = new Result();
    result23.setMountainPoint(1);
    result23.setSprintPoint(3);
    result23.setRider(rider7);
    result23.setStage(3);
    result23.setTime(LocalTime.parse("01:11:11"));
    resultService.saveResult(result23);

    Result result24 = new Result();
    result24.setMountainPoint(4);
    result24.setSprintPoint(4);
    result24.setRider(rider8);
    result24.setStage(1);
    result24.setTime(LocalTime.parse("01:11:01"));
    resultService.saveResult(result24);

    Result result25 = new Result();
    result25.setMountainPoint(0);
    result25.setSprintPoint(1);
    result25.setRider(rider8);
    result25.setStage(2);
    result25.setTime(LocalTime.parse("02:50:01"));
    resultService.saveResult(result22);

    Result result26 = new Result();
    result26.setMountainPoint(1);
    result26.setSprintPoint(4);
    result26.setRider(rider8);
    result26.setStage(3);
    result26.setTime(LocalTime.parse("02:12:11"));
    resultService.saveResult(result26);

    Result result27 = new Result();
    result27.setMountainPoint(4);
    result27.setSprintPoint(4);
    result27.setRider(rider9);
    result27.setStage(1);
    result27.setTime(LocalTime.parse("01:09:01"));
    resultService.saveResult(result27);

    Result result28 = new Result();
    result28.setMountainPoint(0);
    result28.setSprintPoint(1);
    result28.setRider(rider9);
    result28.setStage(2);
    result28.setTime(LocalTime.parse("02:51:01"));
    resultService.saveResult(result28);

    Result result29 = new Result();
    result29.setMountainPoint(2);
    result29.setSprintPoint(4);
    result29.setRider(rider9);
    result29.setStage(3);
    result29.setTime(LocalTime.parse("02:13:11"));
    resultService.saveResult(result29);

    Result result30 = new Result();
    result30.setMountainPoint(2);
    result30.setSprintPoint(3);
    result30.setRider(rider10);
    result30.setStage(1);
    result30.setTime(LocalTime.parse("01:29:01"));
    resultService.saveResult(result30);

    Result result31 = new Result();
    result31.setMountainPoint(3);
    result31.setSprintPoint(1);
    result31.setRider(rider10);
    result31.setStage(2);
    result31.setTime(LocalTime.parse("02:32:01"));
    resultService.saveResult(result31);

    Result result32 = new Result();
    result32.setMountainPoint(2);
    result32.setSprintPoint(5);
    result32.setRider(rider10);
    result32.setStage(3);
    result32.setTime(LocalTime.parse("02:12:11"));
    resultService.saveResult(result32);

    Result result33 = new Result();
    result33.setMountainPoint(2);
    result33.setSprintPoint(3);
    result33.setRider(rider11);
    result33.setStage(1);
    result33.setTime(LocalTime.parse("01:22:01"));
    resultService.saveResult(result33);

    Result result34 = new Result();
    result34.setMountainPoint(3);
    result34.setSprintPoint(1);
    result34.setRider(rider11);
    result34.setStage(2);
    result34.setTime(LocalTime.parse("02:33:01"));
    resultService.saveResult(result34);

    Result result35 = new Result();
    result35.setMountainPoint(3);
    result35.setSprintPoint(2);
    result35.setRider(rider11);
    result35.setStage(3);
    result35.setTime(LocalTime.parse("02:05:11"));
    resultService.saveResult(result35);

    Result result36 = new Result();
    result36.setMountainPoint(1);
    result36.setSprintPoint(4);
    result36.setRider(rider13);
    result36.setStage(1);
    result36.setTime(LocalTime.parse("01:12:01"));
    resultService.saveResult(result36);

    Result result37 = new Result();
    result37.setMountainPoint(0);
    result37.setSprintPoint(0);
    result37.setRider(rider13);
    result37.setStage(2);
    result37.setTime(LocalTime.parse("02:13:01"));
    resultService.saveResult(result37);

    Result result38 = new Result();
    result38.setMountainPoint(3);
    result38.setSprintPoint(2);
    result38.setRider(rider13);
    result38.setStage(3);
    result38.setTime(LocalTime.parse("02:11:11"));
    resultService.saveResult(result38);

    Result result39 = new Result();
    result39.setMountainPoint(1);
    result39.setSprintPoint(4);
    result39.setRider(rider14);
    result39.setStage(1);
    result39.setTime(LocalTime.parse("01:13:01"));
    resultService.saveResult(result39);

    Result result40 = new Result();
    result40.setMountainPoint(1);
    result40.setSprintPoint(2);
    result40.setRider(rider14);
    result40.setStage(2);
    result40.setTime(LocalTime.parse("02:14:01"));
    resultService.saveResult(result40);

    Result result41 = new Result();
    result41.setMountainPoint(2);
    result41.setSprintPoint(2);
    result41.setRider(rider14);
    result41.setStage(3);
    result41.setTime(LocalTime.parse("02:15:11"));
    resultService.saveResult(result41);

  }

}
