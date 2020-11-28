package com.cg.training.pl;

import java.util.Map;
import java.util.Scanner;

import com.cg.training.service.EmployeeService;

public class EmployeeTester {
	private static EmployeeService service= new EmployeeService();
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double totalSal= service.sumOfSalaries();
		System.out.println("Total salary= "+ totalSal);
		
		System.out.println("\n\n-----department names and count of employees in each department-----");
        Map<String,Long> map= service.getDept();
       
        map.forEach((dept, count) -> {
            System.out.println(dept + " -> " + count);
        });
		
		System.out.println("\n\n----Senior Employee----");
		service.seniorEmp();
		
		System.out.println("\n\n----Employees Name with Duration----");
		service.empDuration();
		
		System.out.println("\n\n----Employee Without Department----");
		service.empWithoutDept().stream()
		.forEach(System.out::println);
		
//		System.out.println("\n\n----Department without Employees");
//		Map<Object, Long> empMap = service.deptWithoutEmp();
//		for(Entry<Object,Long> e:empMap.entrySet())
//			System.out.println(e);
//		
		System.out.println("\n\n---- Employee's Hire Details---- ");
		service.showHireDetails();
		
		System.out.println("\n\n---Employees Joined on Friday----");
		service.fridayJoinedEmp().stream()
		.forEach(System.out::println);;

		System.out.println("\n\n---Employee Without Manager----");
		service.empWithoutManager().stream()
		.forEach(System.out::println);
		
		System.out.println("\n\n----Salary Hike----");
		service.salaryHike();
		
//		System.out.println("\n\n----Subordinates of Manager----");
//		System.out.println("Enter FirstName and LastName of Manager to get his/her Subordinates:");
//		String fname = sc.next();
//		String lname = sc.next();
//		service.getSubordinates(fname,lname).stream()
//		.forEach(System.out::println);
		
		System.out.println("\n\n----Sorted Using Employee Id----");
		service.sortByEmpId().stream()
		.forEach(System.out::println);
		
		System.out.println("\n\n----Sorted using Department Id----");
		service.sortByDeptId().stream()
		.forEach(System.out::println);
		
		System.out.println("\n\n----Sorted using Employee First Name----");
		service.sortByFirstName().stream()
		.forEach(System.out::println);
	}

}
