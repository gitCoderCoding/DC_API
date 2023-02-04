package com.example.execute.service;

import java.util.List;

import com.example.execute.entity.EducationDetails;
import com.example.execute.entity.IncomeDetails;
import com.example.execute.entity.KidDetails;

public interface ServiceInterface {
	public String findByAppId();

	public String getCaseId();

	public List<String> getPlanNames();

	public String saveIncomeDetails(IncomeDetails incomeDetails);

	public String saveEducationDetails(EducationDetails educationDetails);

	public String saveKidDetails(KidDetails kidDetails);
}
