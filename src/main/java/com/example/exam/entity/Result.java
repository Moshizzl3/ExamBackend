package com.example.exam.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalTime;

@Entity
public class Result {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int resultId;
  private int sprintPoint;
  private int mountainPoint;
  @JsonFormat(pattern = "HH:mm:ss")
  private LocalTime time;
  private int stage;

  @ManyToOne
  @JsonIgnore
  @JoinColumn(name = "rider_id")
  private Rider rider;

  public int getResultId() {
    return resultId;
  }

  public int getSprintPoint() {
    return sprintPoint;
  }

  public void setSprintPoint(int sprintPoint) {
    this.sprintPoint = sprintPoint;
  }

  public int getMountainPoint() {
    return mountainPoint;
  }

  public void setMountainPoint(int mountainPoint) {
    this.mountainPoint = mountainPoint;
  }

  public LocalTime getTime() {
    return time;
  }

  public void setTime(LocalTime time) {
    this.time = time;
  }

  public Rider getRider() {
    return rider;
  }

  public void setRider(Rider rider) {
    this.rider = rider;
  }

  public int getStage() {
    return stage;
  }

  public void setStage(int stage) {
    this.stage = stage;
  }
}
