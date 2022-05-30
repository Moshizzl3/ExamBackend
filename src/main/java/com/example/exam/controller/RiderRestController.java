package com.example.exam.controller;

import com.example.exam.entity.Rider;
import com.example.exam.service.RiderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/rider")
@CrossOrigin
public class RiderRestController {

  @Autowired
  RiderService riderService;



  @GetMapping("/all-riders")
  public List<Rider> getAllRiders(){
    return riderService.getAllRiders();
  }

  @GetMapping("/all-riders-by-team/{id}")
  public List<Rider> getAllRidersByTeam(@PathVariable int id){
    return riderService.getAllRidersByTeam(id);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteRider(@PathVariable int id){
    try {
      riderService.deleteRiderById(id);
      return new ResponseEntity<>("Deleted rider by id: " + id, HttpStatus.OK);
    }catch (Exception err){
      return new ResponseEntity<>("Could not delete rider by id: " + id, HttpStatus.NOT_FOUND);
    }
  }

  @PutMapping("/{id}")
  public ResponseEntity<Rider> updateRider(@PathVariable int id, @RequestBody Rider rider){
    Optional<Rider> optionalRider = riderService.findById(id);
    if (optionalRider.isPresent()){
      riderService.saveRider(rider);
      return  new ResponseEntity<>(rider, HttpStatus.OK);
    } else {
      Rider riderNotFound = new Rider();
      riderNotFound.setRiderName("No rider with id: " + id);
      return  new ResponseEntity<>(rider, HttpStatus.NOT_FOUND);
    }
  }

  @PostMapping("/")
  @ResponseStatus(HttpStatus.CREATED)
  public void postRider(@RequestBody Rider rider){
    System.out.println("bla bla");
     riderService.saveRider(rider);
  }

}
