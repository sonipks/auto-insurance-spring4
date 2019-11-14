package com.pks.insurance.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {

	@Id
	private Long id;

	private int budget;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userId", orphanRemoval = true)
	private List<Vehicle> vehicles;

}
