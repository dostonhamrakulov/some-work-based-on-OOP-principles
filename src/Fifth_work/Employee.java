//Created by Doston Hamrakulov
// 02.05.2017

package Fifth_work;

public class Employee{

	private int id; 
	private String name;
	private EmployeeSpec _spec;
	
	EmployeeSpec get_Spec(){
		return _spec;
		
	}
	
	public Employee() {
		
		this.id = 0;
		this.name = "";
		_spec = new EmployeeSpec();
	}
	
	public Employee(int id, String name, EmployeeSpec _spec) {
		super();
		this.id = id;
		this.name = name;
		this._spec = _spec;
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
	
}