package com.pks.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pks.insurance.domain.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, String>{

}
