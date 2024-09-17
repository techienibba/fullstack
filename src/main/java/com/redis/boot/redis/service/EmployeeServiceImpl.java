package com.redis.boot.redis.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.redis.boot.redis.DTO.EmployeeDTO;
import com.redis.boot.redis.DTO.EmployeeMapper;
import com.redis.boot.redis.Exception.ResourceNotFoundException;
import com.redis.boot.redis.entity.Employee;
import com.redis.boot.redis.emprepository.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	private emprepository emprepository;

	@Override
	@CachePut("myput")
	public EmployeeDTO createemployee(EmployeeDTO employee) {
		// TODO Auto-generated method stub
		               Employee empcreate= EmployeeMapper.EmployeeDTOToEmployee(employee);
		              Employee newempcreat = emprepository.save(empcreate);
		              return EmployeeMapper.EmployeeToEmployeeDTO(newempcreat);
		              
		              
	}

	@Override
	public EmployeeDTO getemployee(Long id) {
		// TODO Auto-generated method stub
		
		Employee emp=emprepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with id" +""+ id));
		
		EmployeeDTO empdto=EmployeeMapper.EmployeeToEmployeeDTO(emp);
		
		return empdto;
		
		
	}

	@Override
	@Cacheable("mycache")
	public List<EmployeeDTO> getemployees() {
		// TODO Auto-generated method stub
		System.out.println("Entered FindAll");
		
		List<Employee> emplist=emprepository.findAll();
		
		System.out.println("Checking for EmpMapper");
		List<EmployeeDTO> checklist=emplist.stream().map((emp)->EmployeeMapper.EmployeeToEmployeeDTO(emp)).collect(Collectors.toList());
		return checklist;
	}

	@Override
	public EmployeeDTO updatemployee(Long id, EmployeeDTO employee) {
		// TODO Auto-generated method stub
		Employee oldemp=emprepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with id"+""+ id));
		//oldemp.setEmpid(employee.getEmpid());
		oldemp.setFirstname(employee.getFirstname());
		oldemp.setLastname(employee.getLastname());
		oldemp.setEmailid(employee.getEmailid());
		Employee savedemp=emprepository.save(oldemp);
		EmployeeDTO updatedempdto = EmployeeMapper.EmployeeToEmployeeDTO(savedemp);
		return updatedempdto;
		
	}

	@Override
	@CacheEvict
	public void deleteemployee(Long id) {
		// TODO Auto-generated method stub
		Employee delemp=emprepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee does not exist with id"+""+id));
		emprepository.delete(delemp);
		
	}

}
