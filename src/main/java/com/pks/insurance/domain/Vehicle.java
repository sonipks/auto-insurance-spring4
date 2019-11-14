package com.pks.insurance.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {

	@Id
	@GeneratedValue
	private Long id;

	private Long userId;
	
	@Column(length = 4)
	private String mfYear;
	
	@Column(length = 10)
	private String model;
	
	@Column(length = 10)
	private String make;
	
	@Column(length = 10)
	private int policyAmount;
	
	@Column(precision = 1)
	private int totalAccident;
	
	@Temporal(TemporalType.DATE)
	private Date quoteDate;

}
