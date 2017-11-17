//Created by Doston Hamrakulov
// 23.02.2017

package Second_work;
// Library class

public class Inventory_humanResource extends EmployeeStore {
	
	public void addEmployee(int id, String name, String address, String position, Employee.Type type, int yearOfExperience){
		if(getEmployeeCount() < MAX_SIZE){
			Employee newEmployee = new Employee(id, name, address, position, type, yearOfExperience);
			if(!employeeExist(newEmployee)){
				employeeList.add(newEmployee);
			}
		}
	}
	public Employee findEmployee(Employee query){
		
		return employeeList.stream()
				.filter(b -> b != null)
                .filter(b -> compare(query, b))
                .findFirst()
                .orElse(null);
	}
	public boolean employeeExist(Employee employ){
		return findEmployee(employ) != null;
	}
	private boolean compare(Employee query, Employee employee){
		if(query.getId() > 0){
			return query.getId() == employee.getId();
		} else if (query.getName() != null){
			return query.getName().equalsIgnoreCase(employee.getName());
		} else if (query.getAddress() != null){
			return query.getAddress().equalsIgnoreCase(employee.getAddress());
		} else if (query.getPosition() != null){
			return query.getPosition().equalsIgnoreCase(employee.getPosition());
		} else if (query.getType() != null){
			return query.getType().equals(employee.getType());
		} else if (query.getYearOfExperience() > 0){
			return query.getYearOfExperience() == employee.getYearOfExperience();
		} else{
			return false;
		}
				
				
	}
	
}

