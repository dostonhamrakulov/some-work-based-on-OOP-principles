//Created by Doston Hamrakulov
// 27.03.2017

package Third_work;

public class EmployeeSpec {

	
	private String address;
	private String position;
	private Type type;
	
	
	
	public EmployeeSpec(String address, String position, Type type) {
		super();
		this.address = address;
		this.position = position;
		this.type = type;
		
	}
	public EmployeeSpec(){
		
		address = "";
		position = "";
		type = Type.juinor;
	}
	
	

	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}



	public Type getType() {
		return type;
	}



	public void setType(Type type) {
		this.type = type;
	}


	public enum Type{
		juinor, sinor
	}
}
