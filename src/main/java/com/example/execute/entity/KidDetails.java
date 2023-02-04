package com.example.execute.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class KidDetails {
	@Id
	@GeneratedValue
	private Integer kidId;
	private String kidName;
	private Integer kidAge;
	private String kSsn;
	
	
	private Plans plan;
}
