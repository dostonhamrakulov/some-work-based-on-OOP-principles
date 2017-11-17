//Created by Doston Hamrakulov
// 02.05.2017

package Fifth_work;


import java.io.Serializable;

public class EmployeeSpec implements Serializable{

	
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
		type = Type.JUINOR;
	}
	
	public boolean matches(EmployeeSpec otherSpec){
		
		if (this == otherSpec){
			return true;
		}
		if(type.JUINOR != otherSpec.getType() && type.SINOR != otherSpec.getType()){
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



	public void setAddress(String address){
		this.address = address;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position){
		this.position = position;
	}



	public Type getType() {
		return type;
	}



	public void setType(Type type){
		this.type = type;
	}


	public enum Type{
		
		JUINOR("beginer"), SINOR("expereinced");
		
		private String information;
		Type(String information){
			this.information = information;
		}
		
		public String getInformation(){
			return information;
		}
	}
	@Override
	public String toString(){
		return "EmployeeSpec{ type = " + type.getInformation() +
				", Address is " + address +
				", Position is " + position + " }";
	}
}
