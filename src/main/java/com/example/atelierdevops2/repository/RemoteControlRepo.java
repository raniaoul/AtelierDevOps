package com.example.atelierdevops2.repository;

import com.example.backend_auto.entity.RemoteControl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemoteControlRepo extends JpaRepository<RemoteControl,Integer> {
}
