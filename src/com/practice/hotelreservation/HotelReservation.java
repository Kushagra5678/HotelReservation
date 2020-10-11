package com.practice.hotelreservation;

import java.util.*;

public class HotelReservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Hotel Reservation Program");
		Scanner s = new Scanner(System.in);
		int choice = 0;
		while (true) {
			System.out.println("Enter choice\n1. Add Hotel\n2. Exit");
			choice = s.nextInt();
			if (choice == 1) {
				System.out.println("Enter Hotel Name: ");
				String hotelName = s.next();
				System.out.println("Enter Hotel Rate for Regular Customer: ");
				int hotelRateRegularCustomer = s.nextInt();
				HotelList.addHotel(hotelName, hotelRateRegularCustomer);
			} else if (choice == 2) {
				break;
			}

		}
	}

}
