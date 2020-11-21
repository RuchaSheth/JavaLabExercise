package com.cg.eis.bean;

public class Employee {
	private int empId;
	private String empName;
	private Double salary;
	private String designation;
	private String insuranceScheme;
	
	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	@Override
	public String toString() {
		return "empId=" + empId + "\nempName=" + empName + "\nsalary=" + salary + "\ndesignation="
				+ designation + "\ninsuranceScheme=" + insuranceScheme;
	}
	
	
	
}
