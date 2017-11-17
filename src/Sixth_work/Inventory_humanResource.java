//Created by Doston Hamrakulov
// 16.05.2017

package Sixth_work;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Inventory_humanResource extends EmployeeStore {


	@Override
	public void addEmployee(Employee newEmployee) throws Exception{
		if(getEmployeeCount() < MAX_SIZE && !employeeExist(newEmployee)){
			employeeList.add(newEmployee);
		}
	}
	
	public boolean employeeExist(Employee employ) throws Exception{

		return employeeList.stream().anyMatch(b -> compare(b, employ));
	}
	
	@Override
	public Employee findEmployee(EmployeeSpec query){

		return employeeList.stream()
				.filter(b -> b != null)
				.filter(b -> b.getEmployeeSpec() != null)
				.filter(b -> query.matches(b.getEmployeeSpec()))
				.findFirst()
				.orElse(null);
	}
	public void findEmployeeById(){
		System.out.println(employeeList);
	}
	
	@Override
	public void saveEmployee(Employee employee){
		try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("test.txt")));
            employee.sendTo(objectOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
		}
	}
	
	private boolean compare (Employee query, Employee employee){
		if(query.getId() != 0){
			return query.getId() == (employee.getId());
		} else if (query.getEmployeeSpec() != null){
			return query.getEmployeeSpec().matches(employee.getEmployeeSpec());
			
		}
		return false;
		
	}
}

