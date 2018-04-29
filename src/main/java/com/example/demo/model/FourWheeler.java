package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle {

	private String fourWheelerHandle;

	public String getFourWheelerHandle() {
		return fourWheelerHandle;
	}

	public void setFourWheelerHandle(String fourWheelerHandle) {
		this.fourWheelerHandle = fourWheelerHandle;
	}
}
