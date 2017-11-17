//Created by Doston Hamrakulov
// 23.02.2017
package Second_work;
import java.util.Comparator;


public class EmployeeDatabaseService {
	
	public int averageYearOfExperience(EmployeeStore employeeStore){
		return SumOfAllYears(employeeStore) / employeeStore.getEmployeeCount();
	}
	public Employee mostExperiencedEmployee(EmployeeStore employeeStore){
		return employeeStore.employeeList.stream().max(Comparator.comparing(Employee::getYearOfExperience)).get();
	}
	public  int SumOfAllYears(EmployeeStore employeeStore){
		return employeeStore.employeeList.stream().mapToInt(Employee::getYearOfExperience).sum();
	}
	
}
