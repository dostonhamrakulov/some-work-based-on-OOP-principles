//Created by Dston Hamrakulov
// 23.02.2017
package Second_work;

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

    void addEmployee(int id, String name, String address, String position, Employee.Type type, int yearOfexperience) {
    }

    Employee findEmployee(Employee query) {
        return null;
    }
}
