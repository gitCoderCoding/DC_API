package com.example.execute.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Education_Details")
public class EducationDetails {

	@Id
	@GeneratedValue
	private Integer educationId;
	private String highestDegree;
	private Integer graduateYear;
	private String universityName;

	private Plans plan;
}
