package com.cg.training.service;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.cg.training.bean.Department;
import com.cg.training.bean.Employee;
import com.cg.training.dao.EmployeeRepository;

public class EmployeeService {
	
	public Double sumOfSalaries() {
		 List<Employee> employeeList= EmployeeRepository.getEmployees();
		 
		 Optional<Double> optional= employeeList.stream()
		.map((e)->e.getSalary())
		.reduce((a,b)->a+b);
		 
		 if(optional.isPresent()) {
			 return optional.get();
		 }else {
			 return 0.0;
		 }
		 
	}
	//List out department names and count of employees in each department
	public Map<String, Long> getDept() 
	    {
	        List<Employee> employeeList = EmployeeRepository.getEmployees();

	        Map<String, Long> employeeCountByDepartment = employeeList.stream()
	                .filter((emp) -> emp.getDepartment() != null )
	                .collect(Collectors.groupingBy(dept -> dept.getDepartment().getDepartmentName(), 
	                        Collectors.counting()));
	        return employeeCountByDepartment;
	    }
		
	//Find out the senior most employee of an organization. 
	public void seniorEmp() {
		
		Optional<Employee> old = EmployeeRepository.getEmployees().stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getHireDate)));
		System.out.println(old.get().getFirstName());
			
	}
	
	//List employee name and duration of their service in months and days
	public void empDuration() {
		List<Employee> employeeList= EmployeeRepository.getEmployees();
        employeeList.stream()
        .forEach(e -> {
            Period period =e.getHireDate().until(LocalDate.now());
            System.out.println(e.getFirstName()+" "+e.getLastName()+
                    " ==> Month:"+ChronoUnit.MONTHS.between(e.getHireDate(), LocalDate.now())
                    +" Days:"+period.getDays());
        });
		
	}

	//Find out employees without department
	public List<Employee> empWithoutDept() {
		List<Employee> empList	= EmployeeRepository.getEmployees()
						.stream()
						.filter((employee)->employee.getDepartment()==null)
						.collect(Collectors.toList());
		 return empList;
	}
	
	// List Department without Employees
	/*
		public Map<String, Long> deptWithoutEmp(){
			 Map<String, Long> employeeCountByDepartment = EmployeeRepository.getEmployees()
					    .stream()
		                .filter((emp) -> emp.getDepartment() != null)
		                .collect(Collectors.groupingBy(
		                		dept -> dept.getDepartment().getDepartmentName(), 
		                        Collectors.counting()))
			 return employeeCountByDepartment;
		}
	*/
	
	//List employee name, hire date and day of week on which employee has started
	public void showHireDetails()   {
		List<Employee> employeeList = EmployeeRepository.getEmployees();
		employeeList.stream()
		.forEach((emp) -> {
			System.out.println("Name: " + emp.getFirstName() + " " + emp.getLastName() +
					" | Hire Date: " + emp.getHireDate() + " | " + emp.getHireDate().getDayOfWeek().toString());
		});
	}

	//List employee joined on Friday.
	public List<Employee> fridayJoinedEmp() {
		List<Employee> list=  EmployeeRepository.getEmployees().stream()
				.filter((employee)->employee.getHireDate().
						getDayOfWeek().toString().equals("FRIDAY"))
				.collect(Collectors.toList());
		
		return list;
		}
	
	//salary hike
	public void salaryHike() {
	List<Employee> emp=EmployeeRepository.getEmployees().stream()
			.collect(Collectors.toList());
	for ( Employee employee : emp) {
		System.out.println("Name: "+employee.getFirstName()
		+"\nSalary Hiked: "+employee.getSalary()*1.15);
		}
	}
	
	// List employees who didn't report to anyone(emp without manager)	
	public List<Employee> empWithoutManager(){
		List<Employee> empList = EmployeeRepository.getEmployees().stream()
				.filter((emp)-> emp.getManagerId()==null)
				.collect(Collectors.toList());
		
		return empList;
	}
	
	 //sort employees by emp id
	public List<Employee> sortByEmpId(){
		List<Employee> list = EmployeeRepository.getEmployees().stream() 
				.sorted(Comparator.comparingInt(Employee::getEmployeeId))
				.collect(Collectors.toList());
		
		return list;
	}
	
   //sort employees by dept id	
   public List<Employee> sortByDeptId(){
	 List<Employee> list = EmployeeRepository.getEmployees().stream()
				.filter((emp)->emp.getDepartment()!=null)
				.sorted(Comparator.
						comparing((emp)->emp.getDepartment().getDepartmentId()))
				.collect(Collectors.toList());
	 
	 return list;
	}
	// sort employee by first name
   public List<Employee> sortByFirstName(){
	   List<Employee> empList = EmployeeRepository.getEmployees().stream()
			   .sorted(Comparator.comparing((emp)->
			   emp.getFirstName().toLowerCase()))
			   .collect(Collectors.toList());
	   return empList;
   }
   
   //Print name of all subordinates of manager
	/*
	 * public List<Employee> getSubordinates(String firstName,String lastName) {
	 * List<Employee> managerEmployeeList =
	 * EmployeeRepository.getEmployees().stream()
	 * .filter((e)->e.getFirstName().equalsIgnoreCase(firstName)&&e.getLastName().
	 * equalsIgnoreCase(lastName)) .collect(Collectors.toList());
	 * 
	 * List<Employee>subordinates= EmployeeRepository.getEmployees().stream()
	 * .filter((e)->e.getManagerId().equals(managerEmployeeList.get(0).getEmployeeId
	 * ())) .collect(Collectors.toList());
	 * 
	 * if(subordinates.isEmpty()) {
	 * System.out.println("No Subordinates found for this manager"); return null; }
	 * else return subordinates; }
	 */
}
