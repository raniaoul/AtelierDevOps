package com.example.backauto.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RemoteControl {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    boolean remoteChecked;
    float levelRemote;
}
