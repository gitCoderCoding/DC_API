package com.example.execute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.execute.entity.EducationDetails;
import com.example.execute.entity.IncomeDetails;
import com.example.execute.entity.KidDetails;
import com.example.execute.service.ServiceInterface;

public class Dccontroller {
	@Autowired
	private ServiceInterface ser;

	@GetMapping("/appId")
	public ResponseEntity<String> findByAppId() {
		String str = ser.findByAppId();
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}

	@GetMapping("/caseId")
	public ResponseEntity<String> getCaseId() {
		String str = ser.getCaseId();
		return new ResponseEntity<String>(str, HttpStatus.OK);
	}

	@GetMapping("/plans")
	public ResponseEntity<List<String>> getPlanNames() {
		List<String> planNames = ser.getPlanNames();
		return new ResponseEntity<>(planNames, HttpStatus.OK);
	}

	@PostMapping("/incomedetails")
	public String saveIncomeDetails(@RequestBody IncomeDetails incomeDetails) {
		String str = ser.saveIncomeDetails(incomeDetails);
		return "Income Details Successfully Saved";
	}

	@PostMapping("/educationdetails")
	public String saveEducationDetails(@RequestBody EducationDetails educationDetails) {
		String str = ser.saveEducationDetails(educationDetails);
		return "Education Details Successfully Saved";
	}

	@PostMapping("/kiddetails")
	public String saveKidDetails(@RequestBody KidDetails kidDetails) {
		String str = ser.saveKidDetails(kidDetails);
		return "Kid Details Successfully Saved";
	}
}
