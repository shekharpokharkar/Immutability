package com.seleniumexpress;

public class Address {

	private String lane1;
	private String lane2;
	private String city;
	private String state;

	public void setLane1(String lane1) {
		this.lane1 = lane1;
	}

	public void setLane2(String lane2) {
		this.lane2 = lane2;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLane1() {
		return lane1;
	}

	public String getLane2() {
		return lane2;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public Address(String lane1, String lane2, String city, String state) {

		this.lane1 = lane1;
		this.lane2 = lane2;
		this.city = city;
		this.state = state;
	}

	public Address(Address address) {
		this(address.lane1, address.lane2, address.city, address.state);
	}

	@Override
	public String toString() {
		return "Address [lane1=" + lane1 + ", lane2=" + lane2 + ", city=" + city + ", state=" + state + "]";
	}

	public static Address getInstance(Address address) {

		return new Address(address.lane1, address.lane2, address.city, address.state);
	}

}
