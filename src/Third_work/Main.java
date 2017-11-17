//Created by Doston Hamrakulov
// 27.03.2017

package Third_work;

import java.util.*;
public class Main {
	private static EmployeeSpec firstEmployee;
	private static EmployeeSpec secondEmployee;
	private static EmployeeSpec thirdEmployee;
	public static void main(String[] args) {
		Main m = new Main();
		
		m.init();
		m.SearchEmployee();
		
		
	}

	private static EmployeeStore database;
	
	public void init(){
		
		database = new Inventory_humanResource();
		
		firstEmployee = new EmployeeSpec("Uzbekistan", "Medium", EmployeeSpec.Type.juinor);
		database.addEmployee(1, "Doston", firstEmployee);
		
		secondEmployee = new EmployeeSpec("Riga", "Medium", EmployeeSpec.Type.juinor);
		database.addEmployee(2, "Janis", secondEmployee);
		
		thirdEmployee = new EmployeeSpec("Moscow", "Low", EmployeeSpec.Type.sinor);
		database.addEmployee(3, "Flip", thirdEmployee);
	}
	public void SearchEmployee(){
		EmployeeSpec query = new EmployeeSpec("Uzbekistan", null, EmployeeSpec.Type.juinor);
		Employee result = database.findEmployee(query);
		
		System.out.println(result.getId() + "  " + result.getName() + "  " + result.get_Spec());
	}
	
	
//	public void SearchById(String name){
//		EmployeeSpec query = new EmployeeSpec(null, null, EmployeeSpec.Type.juinor);
//		Employee result = database.findEmployee(query);
//		
//		System.out.println(result.getId() + "  " + result.getName() + "  " + result.get_Spec());
//		
//	}
//	public void SearchByAddress(String address){
//		Employee employ = new Employee(0, null, address, null, null, 0);
//		Employee Who = database.findEmployee(employ);
//		
//		System.out.format("Employee: %d, %s, is here, he/she has %d years experience", Who.getId(), Who.getName(), Who.getYearOfExperience());
//		
//	}
//	public void SearchByPosition(String position){
//		Employee employ = new Employee(0, null, null, position, null, 0);
//		Employee Who = database.findEmployee(employ);
//		
//		System.out.format("Employee: %d, %s, is here, he/she has %d years experience", Who.getId(), Who.getName(), Who.getYearOfExperience());
//		
//	}
}
