package OOPSpractise;

class StudentDemo{
	//private properties
	private int rollnumber;
	private String name;
	private int marks;
	
	
	//select for rollnumber
	public void setRollnumber(int rollnumber) {
		this.rollnumber=rollnumber;
	}
	
	//getter for rollnumber
	public int getRollnumber() {
		return rollnumber;
	}
	
	//select for name
		public void setName(String name) {
			this.name=name;
		}
		
		//getter for name
		public String getName() {
			return name;
		}
		
		//setter for marks(With validation)
		public void setMarks(int marks) {
			if(marks>=0) {
				this.marks=marks;
			}
			else {
				System.out.println("Mark cannot be negative.Setting marks as 0");
				this.marks=0;
			}
		}
		
		//getter for marks
		public int getMarks() {
			return marks;
		}
}

public class Student1 {

	public static void main(String[] args) {
		
		StudentDemo s1= new StudentDemo();
		
		//setting value
		s1.setRollnumber(101);
		s1.setName("Logesh");
		s1.setMarks(-50);//testing validation
		s1.setMarks(50);
		
		//getting values
		System.out.println("Rool Number: "+s1.getRollnumber());
		System.out.println("Name: "+s1.getName());
		System.out.println("Marks: "+s1.getMarks());

	}

}

//Create a class Student with private properties rollNumber, name, and marks. 
//Add methods to: Set and get the values Ensure marks cannot be negative 
//(add validation in setter)
