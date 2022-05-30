package com.example.exam.service;

import com.example.exam.entity.Rider;
import com.example.exam.repository.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderService {

  @Autowired
  RiderRepository riderRepository;

  public void saveRider(Rider rider){
     riderRepository.save(rider);
  }

  public Rider getRiderById(int id){
    return riderRepository.findById(id).get();
  }

  public List<Rider> getAllRiders() {
    return riderRepository.findAll();
  }

  public List<Rider> getAllRidersByTeam(int id) {
    return riderRepository.findByTeamTeamId(id);
  }
}
