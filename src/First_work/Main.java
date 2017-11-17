//Created by DOston Hamrakulov
// 23.02.2017

package First_work;
/*
 * 
 * In this assignment I write the code by using OOP concepts for instance, Abstraction and Encapsulation, Inheritance, 
 * now i provided short description for each one in Employee and Salary classes
 * 
 * Here, you cannot instantiate the Employee class, but you can instantiate the Salary Class, 
 * and using this instance you can access all the three fields and seven methods of Employee class as shown below.
 * 
 * I instantiated two Salary objects. One using a Salary reference s, and the other using an Employee reference e.
 * 
 */
public class Main{
	public static void main(String [] args) {

		Salary s = new Salary("Janis", "Riga, Latvia", 3, 3600.00);
		Employee e = new Salary("John Adims", "Sigulda, Latvia", 2, 2400.00);
		//System.out.println("Call mailCheck using Salary reference --");
		s.mailCheck();
		//System.out.println("\n Call mailCheck using Employee reference--");
		e.mailCheck();
		

		/*
		 * While invoking s.mailCheck(), the compiler sees mailCheck() in the Salary class at compile time, 
		 * and the JVM invokes mailCheck() in the Salary class at run time.

		 *  mailCheck() on e is quite different because e is an Employee reference. 
		 *  When the compiler sees e.mailCheck(), the compiler sees the mailCheck() method in the Employee class.
		 *  
		 *	Here, at compile time, the compiler used mailCheck() in Employee to validate this statement. 
		 *	At run time, however, the JVM invokes mailCheck() in the Salary class.
		 * 
		 */



		/*
		 * In conclusion, for this assignment I used java programming language because of personal experience. Here I created three class and used concepts of OOP.
		 * Initially I tried to do the assignment in C++ but I found much difficulty to understand the code structure. 
		 * However, I understood the task by looking carefully
		 * at the given instructions.
		 * 
		 */

	}
}

