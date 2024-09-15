package com.redis.boot.redis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.redis.boot.redis.DTO.EmployeeDTO;
import com.redis.boot.redis.entity.Employee;
import com.redis.boot.redis.emprepository.*;

public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	private emprepository emprepository;

	@Override
	public EmployeeDTO createemployee(Employee employee) {
		// TODO Auto-generated method stub
		              Employee newemp = emprepository.save(employee);
		              
	}

	@Override
	public EmployeeDTO getemployee(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmployeeDTO> getemployees(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeDTO updatemployee(Long id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteemployee(Long id) {
		// TODO Auto-generated method stub
		
	}

}
