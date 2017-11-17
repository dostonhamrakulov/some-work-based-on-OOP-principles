//Created by Doston Hamrakulov
// 02.05.2017

package Fifth_work;


//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;

import java.util.*;
public class Main {
	
	private static EmployeeStore store;
	private static EmployeeSpec firstEmployee;
	private static EmployeeSpec secondEmployee;
	private static EmployeeSpec thirdEmployee;
	private static Inventory_humanResource storeing;
	private static final String FILE_NAME = "employee_database.txt";
	
//
//	@Rule
//	public ExpectedException exception;
//	
//	@Before
//	public void init(){
//		storeing = new Inventory_humanResource();
////		exception = new ExpectedException();
//	}
	
	public static void main(String[] args) throws Exception{
		Main m = new Main();
		
		m.addEmployees();
		m.SearchEmployee();
		
		
	}

	private static EmployeeStore database;
	
	public static void addEmployees() throws Exception {
		
		database = new Inventory_humanResource();
		
		firstEmployee = new EmployeeSpec("Uzbekistan", "Medium", EmployeeSpec.Type.JUINOR);
		database.addEmployee(1, "Doston", firstEmployee);
		
		secondEmployee = new EmployeeSpec("Riga", "Medium", EmployeeSpec.Type.JUINOR);
		database.addEmployee(2, "Janis", secondEmployee);
		
		thirdEmployee = new EmployeeSpec("Moscow", "Low", EmployeeSpec.Type.SINOR);
		database.addEmployee(3, "Flip", thirdEmployee);
	}
	public static void SearchEmployee(){
		EmployeeSpec query = new EmployeeSpec("Uzbekistan", "Medium", EmployeeSpec.Type.JUINOR);
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
