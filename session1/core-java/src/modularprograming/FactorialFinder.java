package modularprograming;

import java.util.Scanner;

public class FactorialFinder {
	/*
	 *  Read any integer
	 *  print the factorial
	 *  5 
	 *  5! = 1*2*3*4*5 =120
	 *  6! = 720
	 *
	 */
	
	// we can define a method which will take any integer as input and returns the factorial as output 
	
	/*
	 *  define a method 
	 *  
	 *  <access-modifiers> <modifiers> returntype nameofthemethod(<parameterlist>)
	 *  {
	 *  // method body - 
	 *  }
	 *  
	 *  access-modifiers : - Optional
	 *  
	 *   public / private / protected /  package(No Modifier)
	 *   
	 *   Non _ ACCESS  Modifiers - Optional
	 *   static , abstract, final , synchronized, default
	 *   
	 *   
	 *   Return type (Mandatory) - type of data the method can return 
	 *   
	 *   
	 *    - any primitive(byte, short, int, long, float,double, char, boolean)
	 *   - String
	 *   
	 *    - any class object
	 *    
	 *    - any array
	 *    
	 *    - nothing (void)
	 *    
	 *  parameters or arguments are used to receive inputs from calling env
	 *  call the method
	 *  
	 *public  static boolean isEven(int n)
	 *  {
	 *  if(n %2 ==0)
	 *  return true;
	 *  else 
	 *  return false;
	 *  }
	 *  
	 *  // Hello Krishna Welcome
	 *  String  greetMe(String name)
	 *  {
	 *  String message = "Hello "+name +" Welcome";
	 *  return message;
	 *  
	 *  }
	 *  
	 *  
	 *   Scanner getScanner()
	 *  {
	 *  Scanner sc = new Scanner(System.in);
	 *  return sc;
	 *  }
	 *  
	 *  
	 *  ArraysExample getExample()
	 *  {
	 *  ArraysExample a = new ArraysExample();
	 *  return a;
	 *  }
	 *  
	 *  
	 * int[]  getTwoNumbers()
	 *  {
	 *  // 10 20
	 *  int x[] = {10,20};
	 *  
	 *  
	 *  return x;
	 *  }
	 */
	
	
public int factorial(int n) {
		int fact = 1;
		for(int  i = 1; i<=n; i++)
		{
			fact = fact * i;
		}
		
		return fact;
	}
	
	
	
	public  static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt(); 
				
		FactorialFinder ff = new FactorialFinder();
		int fact = ff.factorial(num);
		//int fact = FactorialFinder.factorial(num);
		
		
		System.out.println("The Factorial of "+num +" is "+fact);
	}

}
