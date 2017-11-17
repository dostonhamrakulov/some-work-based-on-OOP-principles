//Created by Doston Hamrakulov
// 30.05.2017

package Seventh_work;

import java.util.*;
import java.util.stream.Collectors;

public class Inventory_humanResource extends EmployeeStore {
	
	
	@Override
	public void addEmployee(int id, String name, EmployeeSpec  employeeSpec){
		Employee newEmployee = new Employee(id, name, employeeSpec);
		
		if(!employeeExist(newEmployee)){
			employeeList.add(newEmployee);
		}
		
	}
	@Override
	public Employee findEmployee(EmployeeSpec query){
		
		return findAllEmployee(query)
				.stream()
				.findFirst()
				.orElse(null);

	}
	@Override
	List<Employee> findAllEmployee(EmployeeSpec employeeSpec){
		return employeeList.stream()
				.filter(b -> b.get_Spec().matches(employeeSpec))
				.collect(Collectors.toList());
	}
	private boolean employeeExist(Employee employee){
		return findAllEmployee(employee.get_Spec()).size() > 0;
	}
}

