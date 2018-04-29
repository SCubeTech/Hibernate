package com.example.demo.model;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {

	
	private String twoWheelerhandle;

	public String getTwoWheelerhandle() {
		return twoWheelerhandle;
	}

	public void setTwoWheelerhandle(String twoWheelerhandle) {
		this.twoWheelerhandle = twoWheelerhandle;
	}


	
}
