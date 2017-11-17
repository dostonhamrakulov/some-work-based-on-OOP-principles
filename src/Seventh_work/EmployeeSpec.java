//Created by Doston Hamrakulov
// 30.05.2017

package Seventh_work;

public class EmployeeSpec {

	
	private String address;
	private String position;
	private Type type;
	
	
	
	public EmployeeSpec(String address, String position, Type type) {
		
		this.address = address;
		this.position = position;
		this.type = type;
		
	}
	public EmployeeSpec(){
		
		address = "";
		position = "";
		type = Type.ANY;
	}
	
	public boolean matches(EmployeeSpec otherSpec){
		
		if (this == otherSpec){
			return true;
		}
		
		return (otherSpec.address != null && type.equals(otherSpec.getType()))
				&& (otherSpec.type != Type.ANY && type.equals(otherSpec.type));
	}
	
	

	public String getAddress() {
		return address;
	}

	public String getPosition() {
		return position;
	}

	public Type getType() {
		return type;
	}

	public enum Type{
		JUINOR, SINOR, ANY;
	}
}
