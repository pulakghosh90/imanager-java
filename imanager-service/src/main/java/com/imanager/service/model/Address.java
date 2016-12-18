package com.imanager.service.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "addresses")
public class Address extends BaseDocument {

	private String street;
	private String city;
	private String state;
	private String pin;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", pin=" + pin + "]";
	}

	@Override
	public String getKeyName() {
		return null;
	}

	@Override
	public Long getKeyValue() {
		return null;
	}

	@Override
	public void setKeyValue(Long value) {

	}

}
