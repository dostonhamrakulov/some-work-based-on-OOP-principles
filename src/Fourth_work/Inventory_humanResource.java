//Created by Doston Hamrakulov
// 18.04.2017

package Fourth_work;


//Library class

public class Inventory_humanResource extends EmployeeStore {
	
	
	@Override
	public void addEmployee(int id, String name, EmployeeSpec  employeeSpec){
		Employee newEmployee = new Employee(id, name, employeeSpec);
		if(getEmployeeCount() < MAX_SIZE){
			if(!employeeExist(newEmployee)){
				employeeList.add(newEmployee);
			}
		}
	}
	@Override
	public Employee findEmployee(EmployeeSpec query){
		
		return employeeList.stream()
			.filter(b -> b != null)
			.filter(b -> b.get_Spec() != null)
           .filter(b -> query.matches(b.get_Spec()))
           .findFirst()
           .orElse(null);
	}
	
	public boolean employeeExist(Employee employ){
		return employeeList.stream().anyMatch(b -> compare(b, employ));
	}
	private boolean compare(EmployeeSpec s1, EmployeeSpec s2){
		if(s1.getAddress() != null){
			return s1.getAddress().equalsIgnoreCase(s2.getAddress());
		} else if (s1.getPosition() != null){
			return s1.getPosition().equalsIgnoreCase(s2.getPosition());
		} else if (s1.getType() != null){
			return s1.getType().equals(s2.getType());
		} else {
			return false;
		}
	}
	private boolean compare(Employee query, Employee employee){
		if(query.getId() > 0){
			return query.getId() == employee.getId();
		} else if (query.getName() != null){
			return query.getName().equalsIgnoreCase(employee.getName());
		} else if (query.get_Spec() != null){
			return compare(query.get_Spec(), employee.get_Spec());
		} else {
			return false;
		}
				
				
	}
	
}

