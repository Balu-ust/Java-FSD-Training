package com.ust.springboot;

import java.util.List;

public interface EmpService {
	List <Emp> getemployees();
	void saveEmployee(Emp employee);
	Emp getEmployeeById(long id);

	void deleteEmployeeById(long id);
}
