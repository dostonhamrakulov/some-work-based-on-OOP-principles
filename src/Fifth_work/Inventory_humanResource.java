//Created by Doston Hamrakulov
// 02.05.2017

package Fifth_work;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Inventory_humanResource extends EmployeeStore {


	@Override
	public void addEmployee(int id, String name, EmployeeSpec  employeeSpec) throws Exception{
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
	
	@Override
	public void saveEmployeeToFile(String fileName){
		FileOutputStream fOS;
        ObjectOutputStream oOS;
        try {
            fOS = new FileOutputStream(fileName);
            oOS = new ObjectOutputStream(fOS);
            oOS.writeObject(employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	@Override
	public void loadEmployeeList(String fileName){
		FileInputStream fIS;
        ObjectInputStream oIS;
        try {
            fIS = new FileInputStream(fileName);
            oIS = new ObjectInputStream(fIS);
            employeeList = (List<Employee>) oIS.readObject();
            fIS.close();
            oIS.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
	public boolean employeeExist(Employee employ) throws Exception{

		return employeeList.stream().anyMatch(b -> compare(b, employ));
	}
	private boolean compare(EmployeeSpec s1, EmployeeSpec s2) {
		if(s1.getAddress() != null){
			return s1.getAddress().equalsIgnoreCase(s2.getAddress());
		} else if (s1.getPosition() != null){
			return s1.getPosition().equalsIgnoreCase(s2.getPosition());
		} else if (EmployeeSpec.Type.JUINOR.name() != null){				// name() method is used
			return EmployeeSpec.Type.JUINOR.name().equals(s2.getType());
		} else if (EmployeeSpec.Type.JUINOR.name() !=null ){
			return EmployeeSpec.Type.SINOR.name().equals(s2.getType()); 
		} else {
			return false;
		}
	}
	private boolean compare(Employee query, Employee employee) {

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

