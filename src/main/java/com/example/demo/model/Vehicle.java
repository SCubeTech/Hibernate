package com.example.demo.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries(value = { @NamedQuery(name = "vehilce.byVehicleId", query = "from Vehicle where vehicleId = :vehicleId"),
@NamedQuery(name = "vehilce.byVehicleName", query = "from Vehicle where vehicleId = :vehicleName") })
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="vehicle_type", 
discriminatorType = DiscriminatorType.STRING )
public class Vehicle {
	
	@Override
	public String toString() {
		return String.format("Vehicle [vehicleId=%s, vehicleName=%s]", vehicleId, vehicleName);
	}
	@Id @GeneratedValue
	private Long vehicleId;
	private String vehicleName;
	
	
	public Long getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	

}
