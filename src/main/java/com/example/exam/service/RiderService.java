package com.example.exam.service;

import com.example.exam.entity.Rider;
import com.example.exam.repository.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

  public List<Rider> getAllRidersByStage(int id) {
    return riderRepository.findByResultListStage(id);
  }

  public void deleteRiderById(int id) {
    riderRepository.deleteById(id);
  }

  public Optional<Rider> findById(int id) {
    return riderRepository.findById(id);
  }

}
