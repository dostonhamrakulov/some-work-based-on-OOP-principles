//Created by Doston Hamrakulov
// 30.05.2017

package Seventh_work;

public class Main {
	
	private static EmployeeStore database;
	private static EmployeeSpec firstEmployee;
	private static EmployeeSpec secondEmployee;
	private static EmployeeSpec thirdEmployee;
	
	
	public static void main(String[] args) {
		Main m = new Main();
		
		m.init();
		m.SearchEmployee();
		m.SearchEmployeeByType();
		m.SearchEmployeeAddressAndType();
		
		
	}

	
	
	public static void init(){
		
		database = new Inventory_humanResource();
		
		firstEmployee = new EmployeeSpec("Uzbekistan", "Medium", EmployeeSpec.Type.JUINOR);
		database.addEmployee(1, "Doston", firstEmployee);
		
		secondEmployee = new EmployeeSpec("Riga", "Medium", EmployeeSpec.Type.JUINOR);
		database.addEmployee(2, "Janis", secondEmployee);
		
		thirdEmployee = new EmployeeSpec("Moscow", "Low", EmployeeSpec.Type.SINOR);
		database.addEmployee(3, "Flip", thirdEmployee);
	}
	
	// Search employee by address, position and type
	public static void SearchEmployee(){
		EmployeeSpec query = new EmployeeSpec("Uzbekistan", "Medium", EmployeeSpec.Type.JUINOR);
		Employee result = database.findEmployee(query);
		
		System.out.println("Searched employee by address, position and type:\n");
		System.out.println(result.getId() + "  " + result.getName() + "  " + result.get_Spec().getAddress() + " " 
				+ result.get_Spec().getPosition() + " " + result.get_Spec().getType());
	}
	
	//Search employee by type (first one)
	public static void SearchEmployeeByType(){
		EmployeeSpec query = new EmployeeSpec("null", "null", EmployeeSpec.Type.SINOR);
		Employee result = database.findEmployee(query);
		
		System.out.println("\n\n\nSearched employee by type:\n");
		System.out.println(result.getId() + "  " + result.getName() + "  " + result.get_Spec().getAddress() + " " 
				+ result.get_Spec().getPosition() + " " + result.get_Spec().getType());
	}
	
	//Search employee by address and type
	public static void SearchEmployeeAddressAndType(){
		EmployeeSpec query = new EmployeeSpec("Uzbekistan", "null", EmployeeSpec.Type.JUINOR);
		Employee result = database.findEmployee(query);
		
		System.out.println("\n\n\nSearched employee by address and type:\n");
		System.out.println(result.getId() + "  " + result.getName() + "  " + result.get_Spec().getAddress() + " " 
				+ result.get_Spec().getPosition() + " " + result.get_Spec().getType());
	}
}
