package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

public class Exercise2Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		EmployeeService empService = new EmployeeService();
		empService.getEmployeeDetails(emp1);
		empService.getFindInsuranceScheme(emp1);
		empService.showEmpDetails(emp1);
	}

}
