package com.example.execute.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.execute.entity.KidDetails;

public interface KidDetailsRepo extends JpaRepository<KidDetails, Serializable> {

}