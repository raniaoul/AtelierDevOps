package com.example.atelierdevops2.repository;


import com.example.backend_auto.entity.Sensors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorsRepo extends JpaRepository<Sensors,Integer> {
}
