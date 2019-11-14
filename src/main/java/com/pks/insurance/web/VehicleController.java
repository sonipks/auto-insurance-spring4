package com.pks.insurance.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pks.insurance.domain.Vehicle;
import com.pks.insurance.repository.VehicleRepository;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	
	@Autowired
	VehicleRepository vehicleRepository;
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public Vehicle save(Vehicle vehicle) {
		return vehicleRepository.save(vehicle);
	}
	
	@RequestMapping(value = "/findAll",method = RequestMethod.GET)
	public List<Vehicle> findAll(Vehicle vehicle) {
		return vehicleRepository.findAll();
	}
	

}
