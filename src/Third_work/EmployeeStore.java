//Created by Doston Hamrakulov
// 27.03.2017

package Third_work;

import java.util.*;


public class EmployeeStore {
	
	public static final int MAX_SIZE = 10;
	
    public List<Employee> employeeList;

    public EmployeeStore() {
    	employeeList = new ArrayList<>();
    }

    public int getEmployeeCount() {
        return employeeList.size();
    }

    public Employee getEmployee(int index) {
        return (index < getEmployeeCount()) ? employeeList.get(index) : null;
    }

    public void addEmployee(int id, String name, EmployeeSpec employeeSpec) {
    }

    Employee findEmployee(EmployeeSpec query) {
        return null;
    }
}

