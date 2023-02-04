package com.example.execute.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.execute.entity.IncomeDetails;

public interface IncomeDetailsRepo extends JpaRepository<IncomeDetails, Serializable> {

}