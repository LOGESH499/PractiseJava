package OOPSpractise;

class Studentt1{
	private String name;
	private int age;
	
	//parameterized constructer
	public Studentt1(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	//method to display details
	public void display() {
		System.out.println("Name:"+name+",Age:"+age);
	}
}
public class StudentEx1 {

	public static void main(String[] args) {
		
		Studentt1 s1= new Studentt1("Logesh", 21);
		Studentt1 s2= new Studentt1("Kumar", 23);
		
		s1.display();
		s2.display();

	}

}
