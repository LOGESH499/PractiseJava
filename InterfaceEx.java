package OOPSpractise;

interface vehicle{
	void start();//abstract method
	void stop();//abstract method
}

//implementing the interface in a class

class Car1 implements vehicle{
	public void start() {
		System.out.println("Car is starting.."); 
	}
	
	public void stop() {
		System.out.println("Car is stopping.."); 
	}
}
public class InterfaceEx {

	public static void main(String[] args) {
		
		vehicle v1=new Car1();
		v1.start();
		v1.stop();

	}

}

//.write a program name java interface vehicle two method start and stop