package com.lti.view;

import com.lti.model.Employee;

public class EmpView {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpid(1001);
		emp.setEnpname("James");
		
		System.out.println("Id"+emp.getEmpid());
		System.out.println("Name"+emp.getEnpname());
	}

}
