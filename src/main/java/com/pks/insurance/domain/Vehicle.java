package com.pks.insurance.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	/**
	 * Social service number of the citizen
	 */
	@Id
	private String ssn;
	/**
	 * Specifies 2 for two wheeler and 4 for four wheeler
	 */
	private String type;
	/**
	 * Various models of the company
	 */
	private String model;
	/**
	 * Make is the company of vehicle
	 */
	private String make;
	/**
	 * Registration number of vehicle
	 */
	private String regNo;
	/**
	 * Type of insurance policy
	 */
	private String policyType;
	/**
	 * Amount of insurance policy
	 */
	private int policyAmount;
	/**
	 * Manufacturing year of the vehicle
	 */
	@Column(name = "MF_YEAR", length = 4)
	private String mfYear;
	/**
	 * No of accidents done by user
	 */
	@Column(name = "TOTAL_ACCIDENT", precision = 1)
	private int totalAccident;
	/**
	 * Date on which quotation generated for the user
	 */
	@Temporal(TemporalType.DATE)
	private Date quoteDate;


}
