//Created by Doston Hamrakulov
// 23.02.2017

package Second_work;

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Main m = new Main();
		
		m.Additing();
		m.SearchEmployee();
		
		
	}
	private static EmployeeDatabaseService service;
	private static EmployeeStore database;
	
	public void Additing(){
		service = new EmployeeDatabaseService();
		database = new Inventory_humanResource();
		
		
		database.addEmployee(1, "Doston", "Samarkand", "Medium", Employee.Type.juinor, 2);
		database.addEmployee(2, "Janis", "Riga", "Medium", Employee.Type.sinor, 3);
		database.addEmployee(3, "Flip", "Paris", "Low", Employee.Type.juinor, 2);
	}
	public void SearchEmployee(){
		Employee employ = new Employee(2, null, null, null, null, 0);
		Employee Who = database.findEmployee(employ);
		
		System.out.format("Employee: %d, %s, is here, he/she has %d years experience", Who.getId(), Who.getName(), Who.getYearOfExperience());
		
	}
//	public void SearchByName(String name){
//		Employee employ = new Employee(0, name, null, null, null, 0);
//		Employee Who = database.findEmployee(employ);
//		
//		System.out.format("Employee: %d, %s, is here, he/she has %d years experience", Who.getId(), Who.getName(), Who.getYearOfExperience());
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
