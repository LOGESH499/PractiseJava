package EMC_java;

public class Student {

	int marks;
	String name;
	
	Student()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student ob1 = new Student();
     Student ob2 = new Student();
    
    System.out.println(ob1.marks);
    System.out.println(ob2.name);
	}

}


//constructor it is initlalize for object value