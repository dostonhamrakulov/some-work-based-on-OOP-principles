//Created by Doston Hamrakulov
// 16.05.2017

package Sixth_work;

import java.io.ObjectOutputStream;

public class UnexperiencedEmployee extends Employee {
	
	public UnexperiencedEmployee(int id, String name, EmployeeSpec employeeSpec){
		super(id, name, employeeSpec);
	}
	@Override
    public void sendTo(ObjectOutputStream outputStream) {
        super.sendTo(outputStream);
    }
}
