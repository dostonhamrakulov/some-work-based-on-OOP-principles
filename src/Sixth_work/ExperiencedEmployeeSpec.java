//Created by Doston Hamrakulov
// 16.05.2017

package Sixth_work;


public class ExperiencedEmployeeSpec implements EmployeeSpec{
	
	private EmployeeType type;
	private String employeePosition;
	
	public ExperiencedEmployeeSpec(EmployeeType type, String position){
		this.type = type;
		this.employeePosition = position;
	}
	public ExperiencedEmployeeSpec(){
		type = EmployeeType.ANY;
		employeePosition= "";
	}
	public EmployeeType getType(){
		return type;
	}
	public String getEmployeePosition(){
		return employeePosition;
	}
	
	@Override
	public boolean matches(EmployeeSpec employeeSpec){
		if(this == employeeSpec){
			return true;
		}
		
		if(employeeSpec instanceof ExperiencedEmployeeSpec){
			ExperiencedEmployeeSpec experienced = (ExperiencedEmployeeSpec) employeeSpec;
			
			if(experienced.type != EmployeeType.ANY && type != experienced.type){
				return false;
			}
			return (!experienced.employeePosition.equals("")
					&& experienced.employeePosition != null)
					&& employeePosition.equals(experienced.employeePosition);
		}
		return false;
	}
}
