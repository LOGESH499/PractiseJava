package javapractise;

enum Tafficlight{
	Red,Green,Yellow
}
public class TafficLightenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tafficlight light=Tafficlight.Red;
		
		switch(light) {
		
		case Red:System.out.println("Stop!");break;
		case Green:System.out.println("Go!");break;
		case Yellow:System.out.println("Wait!");break;
		//default:System.out.println("Invalid");break;
		
		}
		System.out.println(light);
	}

}
//Create an enum Traffic Light with red, green, yellow