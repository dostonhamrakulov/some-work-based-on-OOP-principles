//Created by Doston Hamrakulov
// 18.04.2017

package Fourth_work;

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
	
	public boolean matches(EmployeeSpec otherSpec){
		
		if (this == otherSpec){
			return true;
		}
		if(type.juinor != otherSpec.getType() && type.sinor != otherSpec.getType()){
			return false;
		}
		if (!otherSpec.equals("") && address != otherSpec.getAddress() ){
			return false;
		}
		if (!otherSpec.equals("") && position != otherSpec.getPosition() ){
			return false;
		}
		
		return true;
		//return (!otherSpec.address.equals("") && otherSpec.address != null) && address.equals(otherSpec.address);
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
