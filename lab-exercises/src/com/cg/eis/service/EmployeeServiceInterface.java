package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeServiceInterface {
	void getEmployeeDetails(Employee emp);
	String getFindInsuranceScheme(Employee emp);
	void showEmpDetails(Employee emp);
}
