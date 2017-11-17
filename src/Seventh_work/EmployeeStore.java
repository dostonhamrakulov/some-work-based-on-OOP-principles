//Created by Doston Hamrakulov
// 30.05.2017

package Seventh_work;

import java.util.*;


public class EmployeeStore {
	
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
    List<Employee> findAllEmployee(EmployeeSpec employeeSpec){
    	return null;
    }
}

