package OOPSpractise;

class Employe{
	//private variable
	private String name;
	private double salary;
	
	//getter for name
	public String getName() {
		return name;
	}
	
	//setter for name
	public void setName(String name) {
		this.name=name;
	}
	
	//getter for salary
	public double getSalary() {
		return salary;
	}
	
	//setter for salary
	public void setSalary(double salary) {
		this.salary=salary;
	}
}

public class Employee2 {

	public static void main(String[] args) {
		
		Employe emp = new Employe();
		
		//set values using setter
		emp.setName("Logesh");
		emp.setSalary(45000);
		
		//get values using getters
		
		System.out.println("Employee Name: "+emp.getName());
		System.out.println("Employee salary: "+emp.getSalary());
		
	}
		
	}

//Create a class Employee with private variables name and salary. 
//Write getters and setters to access and modify them. 
//In the main method, create an object, set values, and print them.

