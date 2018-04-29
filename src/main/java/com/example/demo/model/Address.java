package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String address;
	private String pin;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	

}
