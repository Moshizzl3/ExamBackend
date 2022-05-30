package com.example.exam.repository;

import com.example.exam.entity.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RiderRepository extends JpaRepository<Rider,Integer> {

  List<Rider> findByTeamTeamId(int id);

}
