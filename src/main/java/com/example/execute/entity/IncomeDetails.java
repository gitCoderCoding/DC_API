package com.example.execute.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class IncomeDetails {
	@Id
	@GeneratedValue
	private Integer incomeId;
	private Double monthlySal;
	private Integer rent;
	private String property;
	
	
	private Plans plan;
}
