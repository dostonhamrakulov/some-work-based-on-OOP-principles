//Created by Doston Hamrakulov
// 16.05.2017

package Sixth_work;
/**
 * Created by Doston Hamrakulov on 29.05.2017
 */

public enum EmployeeType {
	JUNIOR("JUNIOR"), SINOR("SINOR"), ANY("undefined");
	private String type;
	
	EmployeeType(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
	
}
