package com.example.execute.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.execute.entity.PlanNames;

public interface PlanNamesRepo extends JpaRepository<PlanNames, Serializable> {

}