package com.redis.boot.redis.DTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.redis.boot.redis.entity.Employee;

public class EmployeeMapper {
	
	@Autowired
	private static ModelMapper modelmapper;
	
	public static EmployeeDTO EmployeeToEmployeeDTO(Employee emp)
	{
		/* EmployeeDTO empdto = new EmployeeDTO();
		empdto.setEmpid(emp.getEmpid());
		empdto.setFirstname(emp.getFirstname());
		empdto.setLastname(emp.getLastname());
		empdto.setEmailid(emp.getEmailid()); */
		modelmapper=new ModelMapper();
		
		EmployeeDTO empdto = modelmapper.map(emp, EmployeeDTO.class);
		return empdto;
		//return new EmployeeDTO(emp.getEmpid(),emp.getFirstname(),emp.getLastname(),emp.getEmailid());
		
	}
	
	
	public static Employee EmployeeDTOToEmployee(EmployeeDTO empdt)
	{/*
		Employee employee = new Employee();
		//employee.setEmpid(empdt.getEmpid());
		employee.setFirstname(empdt.getFirstname());
		employee.setLastname(empdt.getLastname());
		employee.setEmailid(empdt.getEmailid()); */
		
modelmapper=new ModelMapper();
		
		Employee emp = modelmapper.map(empdt, Employee.class);
		return emp;
		
		
		//return new Employee(empdt.getFirstname(),empdt.getLastname(),empdt.getEmailid());	
		
	}
	
	
	

}
