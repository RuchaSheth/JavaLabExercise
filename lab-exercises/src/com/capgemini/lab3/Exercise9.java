package com.capgemini.lab3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise9 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter date in (dd/MM/yyyy) format :");
		String date = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			//Date d1 = sdf.parse(date);
			LocalDate date1= LocalDate.parse(date,formatter);
			LocalDate date2 = LocalDate.now();
			Period diff = Period.between(date1, date2);
			System.out.println("Entered Date is: "+date1);
			System.out.println("Current Date is: "+date2);
			System.out.println("Difference Between Two Dates is: "
					+ ""+diff.getYears()+" yrs "+diff.getMonths()+" months "+diff.getDays()+" days");
		
	}

}
