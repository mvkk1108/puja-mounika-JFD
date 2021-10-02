package hello;

public class LiteralsExample {

	/*
	 * java.lang
	 * wrapper classes
	 *  Type casting 
	 *  
	 *  byte         - Byte
	 *  short        - Short
	 *  int          -Integer
	 *  long         -Long
	 *  float        -Float
	 *  double      - Double
	 *  char       - Character
	 *  boolean     - Boolean
	 *  
	 *  
	 *  String
	 *  
	 *  Operators
	 */
	public static void main(String[] args) {
	
		
		// p - p
		
		double x = 9; // type conversion
		System.out.println(x);
		int y = (int)9.7;  // type casting
		System.out.println(y);
		byte b =(byte) 9.7; 
		System.out.println(b);
		     int x2 = (int)x;
		     
		char x1 = 120;
		
	System.out.println(x1);	
	int x3 = 'a';
		System.out.println(x3);
		
	//boolean p = (boolean)8; // // not possible
		
		// string - p
		
		
		
		String str = "123";
		
		int s  = Integer.parseInt(str);
		String str1 = "234";
		int s1 =Integer.parseInt(str1);
		
		
		int str3 = s + s1;
		
		System.out.println(str3);
		
		double d1 = Double.parseDouble(str);
		
		System.out.println(d1);
		
	}

}
