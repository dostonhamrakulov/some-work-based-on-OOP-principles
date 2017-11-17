//Created by DOston Hamrakulov
// 23.02.2017

package First_work;
	
	/*
	 * We can inherit the properties of Employee class just like concrete class in the following way
	 * 
	 * I will show you how the behavior of overridden methods in Java allows us to take advantage of polymorphism when designing the classes.
	 */
public class Salary extends Employee {
	   private double salary;   // Annual salary
	   
	   public Salary(String name, String address, int number, double salary) {
	      super(name, address, number);
	      setSalary(salary);
	   }
	   
	   public void mailCheck() {
	      System.out.println("Within mailCheck of Salary class ");
	      System.out.println("Mailing check to " + getName() + " with salary " + salary);
	   }
	 
	   public double getSalary() {
	      return salary;
	   }
	   
	   public void setSalary(double newSalary) {
	      if(newSalary >= 0.0) {
	         salary = newSalary;
	      }
	   }
	   
	   public double computePay() {
	      System.out.println("Computing salary paid for " + getName());
	      return salary/52;
	   }
	}