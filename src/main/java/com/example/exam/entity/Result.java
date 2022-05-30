package com.example.exam.entity;

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
  private int point;
  private LocalTime time;
  private String stage;

  @ManyToOne
  @JsonIgnore
  @JoinColumn(name = "rider_id")
  private Rider rider;

  public int getResultId() {
    return resultId;
  }

  public int getPoint() {
    return point;
  }

  public void setPoint(int point) {
    this.point = point;
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

  public String getStage() {
    return stage;
  }

  public void setStage(String stage) {
    this.stage = stage;
  }
}
