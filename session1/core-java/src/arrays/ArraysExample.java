package arrays;

import java.util.Scanner;
import modularprograming.FactorialFinder;
public class ArraysExample {
	/*
	 *  read a number
	 *  int number ;
	 *  number = 10;
	 *  
	 *  read two numbers
	 *  int num1
	 *  int num2;
	 *  
	 *  read 3 numbers
	 *  
	 */

	public static void main(String[] args) {
		
		FactorialFinder ff = new FactorialFinder();
		ff.factorial(6);
		Scanner sc = new Scanner(System.in);
		
		int number[]; // array
		number = new int[3];
		int sum = 0;
		for(int i = 0; i<3;i++)
		{
		System.out.println("Enter  number");
		number[i] = sc.nextInt();
		sum = sum + number[i];
		}
		/*
		 * System.out.println("Enter  number"); number[1] = sc.nextInt(); sum = sum +
		 * number[1]; System.out.println("Enter  number"); number[2] = sc.nextInt(); sum
		 * = sum + number[2];
		 */
		
		
		
		System.out.println(sum);
	}

}
