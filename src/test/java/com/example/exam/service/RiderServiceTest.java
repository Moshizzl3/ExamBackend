package com.example.exam.service;

import com.example.exam.entity.Rider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@Import(RiderService.class)
class RiderServiceTest {

  @Autowired
 RiderService riderService;

  @Test
  void saveRiderSucess() {

    //Arrange
    List<Rider> riders = new ArrayList<>();

    Rider rider = new Rider();
    rider.setRiderName("test");
    rider.setRiderNumber(1);
    rider.setRiderBirthDate(LocalDate.parse("1992-10-01"));
    rider.setRiderCountry("DK");
    riders.add(rider);
    riderService.saveRider(rider);

    //act
    String expectedValue = "test";

    //assert

    Assertions.assertEquals(expectedValue, riderService.getRiderById(1).getRiderName());


  }

  @Test
  void getRiderByIdSucces() {
    //Arrange
    List<Rider> riders = new ArrayList<>();

    Rider rider = new Rider();
    rider.setRiderName("test");
    rider.setRiderNumber(1);
    rider.setRiderBirthDate(LocalDate.parse("1992-10-01"));
    rider.setRiderCountry("DK");
    riders.add(rider);
    riderService.saveRider(rider);

    //act
    int expectedValue = 3;

    //assert

    Assertions.assertEquals(expectedValue, riderService.getRiderById(3).getRiderId());
  }

  @Test
  void getAllRidersSucces() {

    //Arrange
    List<Rider> riders = new ArrayList<>();

    Rider rider = new Rider();
    rider.setRiderName("test");
    rider.setRiderNumber(1);
    rider.setRiderBirthDate(LocalDate.parse("1992-10-01"));
    rider.setRiderCountry("DK");
    riders.add(rider);
    riderService.saveRider(rider);

    //Act
    List<Rider> ridersActual = riderService.getAllRiders();

    //Assert
    Assertions.assertEquals(true, ridersActual.size() > 0);
  }
}