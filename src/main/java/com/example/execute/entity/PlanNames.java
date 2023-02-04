package com.example.execute.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="plan_names")
public class PlanNames {
	@Id
	private Integer planId;
	private String planName;
}
