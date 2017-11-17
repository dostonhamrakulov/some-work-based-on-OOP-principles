//Created by Doston Hamrakulov
// 16.05.2017

package Sixth_work;

import javax.xml.bind.ValidationException;

import java.util.*;

import javax.xml.bind.ValidationException;
/**
 * Created by Doston Hamrakulov on 29.05.2017
 */

public class EmployeeStore {
	
	public static final int MAX_SIZE = 100;
	
    public List<Employee> employeeList;

    public EmployeeStore() {
    	employeeList = new ArrayList<>();
    }

    public int getEmployeeCount() {
        return employeeList.size();
    }

    public Employee getEmployee(int index) {
    	if (index < 0 || index > employeeList.size() -1){
    		try{
    			throw new ValidationException("Passed index: [" + index + "] is not valid");
    		} catch (ValidationException e){
    			e.printStackTrace();
    		}
    	}
        return (index < getEmployeeCount()) ? employeeList.get(index) : null;
    }

    public void addEmployee(int id, String name) throws Exception {
    }

    public void saveEmployee(Employee employee){
    	
    }
    public void addEmployee(Employee employee) throws Exception{
    	
    }
    public Employee findEmployee(EmployeeSpec employeeSpec){
    	return null;
    }
}

