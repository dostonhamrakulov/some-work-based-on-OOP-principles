//Created by Doston Hamrakulov
// 16.05.2017

package Sixth_work;

public class UnexperiencedEmployeeSpec implements EmployeeSpec{
	private String position;
	
	private EmployeeType type;
	public UnexperiencedEmployeeSpec(EmployeeType type, String position){
		this.type = type;
		this.position = position;
	}
	public EmployeeType getType(){
		return type;
	}
	public String getPosition(){
		return position;
	}
	@Override
	public boolean matches(EmployeeSpec employeeSpec){
		if(this == employeeSpec) {
			return true;
		}
		if (employeeSpec instanceof UnexperiencedEmployeeSpec){
			UnexperiencedEmployeeSpec unexperienced = (UnexperiencedEmployeeSpec) employeeSpec;
			
			return (unexperienced.type != EmployeeType.ANY && type != unexperienced.type);
		}
		return false;
	}
}
