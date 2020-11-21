package com.capgemini.lab5;

import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

public class Exercise3 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Employee Name :");
		String name = sc.nextLine();
		System.out.println("Enter Employee Salary :");
		Integer salary = sc.nextInt();
		
		try {
			if(salary<3000)
				throw new EmployeeException("Entered Details Doesn't Meet "
						+ "Requirements. \nSalary must be greater than 3000");
			System.out.println("Welcome "+name+" !");
		}catch(EmployeeException emp) {
			emp.printStackTrace();
		}
		
	}

}
