//Created by Doston Hamrakulov
// 16.05.2017

package Sixth_work;

import java.io.ObjectOutputStream;

/**
 * Created by Doston Hamrakulov on 29.05.2017
 */
public class Employee{

	private int id; 
	private String name;
	private EmployeeSpec EmployeeSpec;
	
	public Employee() {
		
		this.id = 0;
		this.name = "";
	}
	
	public Employee(int id, String name, EmployeeSpec EmployeeSpec) {
		super();
		this.id = id;
		this.name = name;
		this.EmployeeSpec = EmployeeSpec;
		
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) throws IllegalArgumentException {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) throws IllegalArgumentException {
		this.name = name;
	}

	public void sendTo(ObjectOutputStream outputStream) {
		// TODO Auto-generated method stub
		
	}
	public EmployeeSpec getEmployeeSpec(){
		return EmployeeSpec;
	}
	public void setEmployeeSpec(EmployeeSpec EmployeeSpec){
		this.EmployeeSpec = EmployeeSpec;
	}

	
	
}