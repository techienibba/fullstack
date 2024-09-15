package com.redis.boot.redis.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class EmployeeDTO {
	
	
	private Long Employeeid;
	
	private String firstname;
	
	private String lastname;
	
	private String emailid;

}
