package com.example.atelierdevops2.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Actuators {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    Date time; //LocalDateTime
    double fillingValveRate;
    double drainingValveRate;
}
