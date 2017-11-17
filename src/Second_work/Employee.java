//Created by Doston Hamrakulov
// 23.02.2017

package Second_work;
public class Employee{
	
	private int id;
	private String name;
	private String address;
	private String position;
	private Type type;
	private int yearOfExperience;
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public Employee(int id, String name, String address, String position, Type type, int yearOfExperience) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.position = position;
		this.type = type;
		this.yearOfExperience = yearOfExperience;
	}


	public enum Type{
		juinor, sinor
	}
}