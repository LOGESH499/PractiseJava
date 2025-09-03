package OOPSpractise;

class Rectangle{
	//private properties
	 private double length;
	 private double width;
			
	//setter for length(With validation)
	public void setLength(double length) {
		if(length>0) {
		this.length=length;
	}
	else {
	System.out.println("Length must be grater than 0.Setting length=1");
	this.length=1;
	}
}
	
	//setter for width(With validation)
	public void setWidth(double width) {
		if(width>0) {
		this.width=width;
	}
	else {
	System.out.println("Width must be grater than 0.Setting width=1");
	this.width=1;
	}
}
	
	//method to calculate area
	public double getArea() {
		return length*width;
	}
}

public class RectangleEx {

	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle();
		
		//setting values (testing validation)
		r1.setLength(10);
		//r1.setWidth(-5);//invalid input
		r1.setWidth(5);
		
		//calculating area
		double area=r1.getArea();
		
		System.out.println("Area of Rectangele:"+area); 
		
	}

}

//Write a Java program where: A class Rectangle has private length and width Use setters to assign values and ensure 
//they are greater than zero Use a method to calculate and return the area
