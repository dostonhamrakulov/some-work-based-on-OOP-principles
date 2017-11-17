//Created by DOston Hamrakulov
// 23.02.2017

package First_work;

public abstract class Employee {
	
	/*
	 * Polymorphism is the ability of an object to take on many forms.
	 * 
	 * 
	 * As you can notice this calls is declared as Abstract class.
	 * You can observe that except abstract methods the Employee class is same as normal class in Java. 
	 * The class is now abstract, but it still has three fields, seven methods, and one constructor.
	 * 
	 * Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit.Therefore, 
	 * it is also known as data hiding.
	 * The public setXXX() and getXXX() methods are the access points of the instance variables of the Employee class as you can see below
	 */
	   private String name;
	   private String address;
	   private int number;

	   public Employee(String name, String address, int number) {
	      
	      this.name = name;
	      this.address = address;
	      this.number = number;
	   }
	   
	   public double computePay() {
	     System.out.println("Inside Employee computePay method");
	     return 0.0;
	   }
	   
	   public void mailCheck() {
	      System.out.println("Mailing a check to " + this.name + " " + this.address);
	   }

	   public String toString() {
	      return name + " " + address + " " + number;
	   }

	   public String getName() {
	      return name;
	   }
	 
	   public String getAddress() {
	      return address;
	   }
	   
	   public void setAddress(String newAddress) {
	      address = newAddress;
	   }
	 
	   public int getNumber() {
	      return number;
	   }
	}