package com.redis.boot.redis.DTO;

import com.redis.boot.redis.entity.Employee;

public class EmployeeMapper {
	
	
	
	public static EmployeeDTO EmployeeToEmployeeDTO(Employee emp)
	{
		EmployeeDTO empdto = new EmployeeDTO();
		empdto.setEmployeeid(emp.getEmpid());
		empdto.setFirstname(emp.getFirstname());
		empdto.setLastname(emp.getLastname());
		empdto.setEmailid(emp.getEmaild());
		
		return empdto;
		
		
	}
	
	
	public static Employee EmployeeDTOToEmployee(EmployeeDTO empdt)
	{
		Employee employee = new Employee();
		employee.setEmpid(empdt.getEmployeeid());
		employee.setFirstname(empdt.getFirstname());
		employee.setLastname(empdt.getLastname());
		employee.setEmaild(empdt.getEmailid());
		
		return employee;
		
		
	}
	
	
	

}
