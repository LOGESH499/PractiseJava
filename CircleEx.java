package OOPSpractise;

class Circle{
	double radius;//property
	
	
	//method to calculate area
	double calculateArea() {
		return Math.PI*radius*radius;
	}
	
	//method to clacualte circumference
	double calculateCircumference() {
		return 2* Math.PI * radius;
	}
}

public class CircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1=new Circle();
		
		//set radius
		c1.radius=7;
		
		//display result
		System.out.println("Radius:"+c1.radius);
		System.out.println("Area:"+c1.calculateArea());
		System.out.println("Circumference:"+c1.calculateCircumference());
		
	}

}

//Create a class called Circle with: One property:
//radius Two methods: calculateArea() and calculateCircumference()

//Method calculateArea() → --uses formula --π × r × r.

//Method calculateCircumference() → --uses formula-- 2 × π × r.