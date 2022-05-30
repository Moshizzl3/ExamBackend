package com.example.exam.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Rider {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int riderId;
  private String riderName;
  private int riderNumber;
  private LocalDate riderBirthDate;
  private String riderCountry;


  @ManyToOne
  @JoinColumn(name = "team_id")
  private Team team;

  @OneToMany
  @JoinColumn(name = "rider_id")
  private List<Result> resultList;

  public int getRiderId() {
    return riderId;
  }

  public String getRiderName() {
    return riderName;
  }

  public void setRiderName(String riderName) {
    this.riderName = riderName;
  }

  public int getRiderNumber() {
    return riderNumber;
  }

  public void setRiderNumber(int riderNumber) {
    this.riderNumber = riderNumber;
  }

  public LocalDate getRiderBirthDate() {
    return riderBirthDate;
  }

  public void setRiderBirthDate(LocalDate riderBirthDate) {
    this.riderBirthDate = riderBirthDate;
  }

  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  public String getRiderCountry() {
    return riderCountry;
  }

  public void setRiderCountry(String riderCountry) {
    this.riderCountry = riderCountry;
  }

  public List<Result> getResultList() {
    return resultList;
  }

  public void setResultList(List<Result> resultList) {
    this.resultList = resultList;
  }
}
