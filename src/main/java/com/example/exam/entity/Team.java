package com.example.exam.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Team {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int teamId;
  private String teamName;
  private String teamCountry;

  @OneToMany
  @JoinColumn(name = "team_id")
  @JsonIgnore
  private List<Rider> riders;

  public int getTeamId() {
    return teamId;
  }

  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public String getTeamCountry() {
    return teamCountry;
  }

  public void setTeamCountry(String country) {
    this.teamCountry = country;
  }

  public List<Rider> getRiders() {
    return riders;
  }

  public void setRiders(List<Rider> riders) {
    this.riders = riders;
  }



}
