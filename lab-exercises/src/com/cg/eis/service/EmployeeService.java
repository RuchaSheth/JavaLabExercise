package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Designation;
import com.cg.eis.bean.Employee;

public class EmployeeService implements EmployeeServiceInterface{
	
	
	
	@Override
	public void getEmployeeDetails(Employee emp) {
		// TODO Auto-generated method stub
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter Emp id :");
		emp.setEmpId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter Emp Name: ");
		emp.setEmpName(sc.nextLine());
		
		
		
		System.out.println("Enter Designation (MANAGER,HR,SYSTEM_ASSOSIATE,DEVELOPER) :"
				);
		String designation  = sc.nextLine();
		
		if(designation.equalsIgnoreCase("manager"))
		{
			emp.setDesignation(Designation.MANAGER.toString());
		}
	else if(designation.equalsIgnoreCase("hr"))
		{
			emp.setDesignation(Designation.HR.toString());			
		}
	else if(designation.equalsIgnoreCase("system_assosiate"))
		{
		  emp.setDesignation(Designation.SYSTEM_ASSOSIATE.toString());		  
		}
	else if(designation.equalsIgnoreCase("developer"))
		{
			emp.setDesignation(Designation.DEVELOPER.toString());			
		}
		
		System.out.println("Enter Salary: "
		        + "\n1.MANAGER(Salary Range 15000-25000)"
				+ "\n2.HR(Salary Range 26000-35000)"
				+ "\n3.SYSTEM_ASSOSIATE(Salary Range 36000-45000)"
				+ "\n4.DEVELOPER(Salary Range 46000-55000): ");
		double salary = Double.parseDouble(sc.nextLine()); 
		emp.setSalary(salary);
//		else
//			System.out.println("Invalid Details !!");
		sc.close();
	}

	@Override
	public String getFindInsuranceScheme(Employee emp) {
		
		String designation = emp.getDesignation();
		double salary = emp.getSalary();
		String scheme="default";
		if((designation.equalsIgnoreCase("manager"))&&(salary>15000)&&(salary<=25000))
		{
			scheme="Scheme A";
		}
	else if((designation.equalsIgnoreCase("hr")&&(salary>26000)&&(salary<=35000)))
		{
			scheme="Scheme B";
		}
	else if((designation.equalsIgnoreCase("system_assosiate"))&&(salary>36000)&&(salary<=45000))
		{
		  scheme="Scheme C";
		}
	else if((designation.equalsIgnoreCase("developer"))&&(salary>46000)&&(salary<=55000))
		{
			scheme="Scheme D";
		}
		
		emp.setInsuranceScheme(scheme);
		return scheme; 
	}

	@Override
	public void showEmpDetails(Employee emp) {
		
		if(emp.getInsuranceScheme().equals("default"))
		{
			System.out.println("\nInvalid Details !!! ");
		}
		else
		{
			System.out.println("-----Employee Details-----");
			System.out.println(emp);
		}
	}

}
