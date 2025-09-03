package OOPSpractise;

class student{
	String name;
	int age;
}

public class Studenttest{

	public static void main(String[] args) {
		//create an object of student
		student s1=new student();
		
		//assign values
		s1.name="Logesh";
		s1.age=21;
		
		//display values
		System.out.println("Student Name:"+s1.name);
		System.out.println("Student Age:"+s1.age);

		
	}

}
//Write a simple Java program to create a class Student with two properties: name and age.
//Create one object and display the values