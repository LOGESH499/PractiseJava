package firstproject;
//byte
//long
//short
//int
//float
//double
//char
//boolean
//it is used to convert all primitive data type into
//Its corresponding wrapper objects(thru class0 and vice-versa
public class WrapperClassWhole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		
		float f=50.0f;
		double d=60.0D;
		char c='a';
		boolean b2=true;
		
		//Autoboxing:Converting primitive data type into Objects
		Byte byteobj=b;// Creating obj for particular var
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean booleanobj=b2;
		
		//Printing Objects
		System.out.println("---Printing object Values");
		System.out.println("Byte Object :"+byteobj);
		System.out.println("Short Object :"+shortobj);
		System.out.println("Integer Object :"+intobj);
		System.out.println("Long Object :"+longobj);
		System.out.println("Float Object :"+floatobj);
		System.out.println("Double Object :"+doubleobj);
		System.out.println("Character Object :"+charobj);
		System.out.println("Boolean Object :"+booleanobj);
		
		   // Unboxing - converting object to primitive data types
        byte B1 = byteobj;   // unboxing
        short S1 = shortobj; // unboxing
        int I1 = intobj;
        long L1 = longobj;
        float F1 = floatobj;
        double D1 = doubleobj;
        char C1 = charobj;
        boolean B2 = booleanobj;

        // Printing unboxed values
        System.out.println("---Printing primitive values after unboxing---");
        System.out.println("byte value :" + B1);
        System.out.println("short value :" + S1);
        System.out.println("int value :" + I1);
        System.out.println("long value :" + L1);
        System.out.println("float value :" + F1);
        System.out.println("double value :" + D1);
        System.out.println("char value :" + C1);
        System.out.println("boolean value :" + B2);
		

	}

}
