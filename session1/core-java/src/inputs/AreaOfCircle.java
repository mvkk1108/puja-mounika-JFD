package inputs;

import java.util.Scanner;

public class AreaOfCircle {
	/*
	 *  area = PI * Radious * Radious
	 */

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
  double  radious;
  
  System.out.println("Enter the radious of circle");
  
  radious = sc.nextDouble();
  
  double area = Math.PI * radious * radious;
  
  System.out.println("The area of circle is "+area);
  
  
  
	}

}
