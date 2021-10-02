package coditionalstatements;

import java.util.Scanner;

public class AbsoluteNumber {
// 5 5
	
	// -5  5
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any numbers");
		
		   int n = sc.nextInt();
		 
		   if(n%2 == 0)
		   {
		   System.out.println(n+" is even");
		   }else{
			   System.out.println(n+" is odd");
		   }

		  
	}
	
	/*
	 * conditional statements / branching statements / selection statements
	 *   if,  - single selection / one way branching
	 *      //
	 *      if(condition)
	 *      {
	 *      Statements
	 *      }
	 *      //
	 *   condition is any boolean expression
	 *   if-else - double selection/ two way branching
	 *   
	 *   
	 *   if-else -if - multiple selection / multi way branching
	 *   
	 *   
	 *   switch - multiple selection / multi way branching
	 */

}
