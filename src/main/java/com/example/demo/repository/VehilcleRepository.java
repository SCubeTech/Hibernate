package com.example.demo.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Vehicle;

public interface VehilcleRepository extends PagingAndSortingRepository<Vehicle, Long> {

	
	//Instead of table name use the object name
	@Query("from Vehicle where vehicleName =:name")
	public List<Vehicle> findAllVehicle(@Param("name") String name,Pageable pageable);
	
	
	//Named Queries Example
	@Query(nativeQuery=true)
	public List<Vehicle> findByVehicleId(@Param("vehicleId")Long vehicleId);
	
	@Query(nativeQuery=true)
	public List<Vehicle> findByVehicleName(@Param("vehicleName")String vehicleName);
	
	
	
}
