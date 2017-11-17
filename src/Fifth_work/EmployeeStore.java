//Created by Doston Hamrakulov
// 02.05.2017

package Fifth_work;

import javax.xml.bind.ValidationException;
import java.util.*;

import javax.xml.bind.ValidationException;
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

    public void addEmployee(int id, String name, EmployeeSpec employeeSpec) throws Exception {
    }

    Employee findEmployee(EmployeeSpec query) {
        return null;
    }
    public void saveEmployeeToFile(String filename){
    	
    }
    public void loadEmployeeList(String fileName){
    	
    }
}

