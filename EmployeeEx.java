package OOPSpractise;

class Employee{
	//properties
	String name;
	double salary;
	
	//method to display details
	void displayDetails() {
		System.out.println("Employye Name:"+name); 
		System.out.println("Employye Salary:"+salary); 
	}
	
}

public class EmployeeEx {

	public static void main(String[] args) {
		
		//craete object of emloyee
		Employee e1=new Employee();
		
		//set values;
		e1.name="Karthi";
		e1.salary=50000;
		
		//call method
		e1.displayDetails();

	}

}

//Create a class called Employee with: Properties: name, salary
//Method: displayDetails() which prints the employee name and salary