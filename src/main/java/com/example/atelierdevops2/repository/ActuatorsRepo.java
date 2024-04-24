package com.example.atelierdevops2.repository;

import com.example.atelierdevops2.entity.Actuators;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ActuatorsRepo extends JpaRepository<Actuators,Integer> {
}
