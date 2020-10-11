package com.practice.hotelreservation;

public class Hotel {
	private String hotelName;
	private int hotelRateRegularCust;

	public Hotel(String hotelName, int hotelRateRegularCust) {
		this.hotelName = hotelName;
		this.hotelRateRegularCust = hotelRateRegularCust;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public void setHotelRateRegularCustomer(int hotelRateRegularCust) {
		this.hotelRateRegularCust = hotelRateRegularCust;
	}

	public String getHotelName() {
		return this.hotelName;
	}

	public int getHotelRateRegularCustomer() {
		return this.hotelRateRegularCust;
	}
}
