//Created by Doston Hamrakulov
// 16.05.2017

package Sixth_work;

import java.util.*;

public class Main {
	
	private static Inventory_humanResource database;
	private static EmployeeSpec experienced;
	private static EmployeeSpec unexperienced;
	private static EmployeeStore store;
	private static Employee firstEmployee;
	private static Employee secondEmployee;
	private static Employee thirdEmployee;
	private static Employee fourth;
	private static Inventory_humanResource storeing;
	private static final String FILE_NAME = "employee_database.txt";

	
	public static void main(String[] args) throws Exception{
		Main m = new Main();
		
		m.addEmployees();
		m.SearchEmployee();
		
		
	}

	
	public static void addEmployees() throws Exception {
		
		database = new Inventory_humanResource();
		experienced = new ExperiencedEmployeeSpec(EmployeeType.SINOR, "medium");
		firstEmployee = new ExperiencedEmployee(1, "Doston", experienced);
		database.addEmployee(firstEmployee);
		
		
		unexperienced = new UnexperiencedEmployeeSpec(EmployeeType.JUNIOR, "low");
		secondEmployee = new ExperiencedEmployee(2, "John", unexperienced);
		database.addEmployee(secondEmployee);
		
		
		
		experienced = new ExperiencedEmployeeSpec(EmployeeType.SINOR, "high");
		thirdEmployee = new ExperiencedEmployee(3, "Kayt", experienced);
		database.addEmployee(thirdEmployee);
		
		fourth = new Employee(4, "Jack");
		database.addEmployee(fourth);
		
		
	}
	public static void SearchEmployee(){
		experienced = new ExperiencedEmployeeSpec(EmployeeType.SINOR, "medium");
		
		System.out.println(database.findEmployee(experienced));
		
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
