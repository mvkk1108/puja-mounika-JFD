package modularprograming;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
	
	
	// call isEven and greet methods
	MathUtils mathUtils = new MathUtils();
	
	//boolean status = mathUtils.isEvenNumber(5); // method call  - binding
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter numbers");
	int num = sc.nextInt();
	if(mathUtils.isEvenNumber(num))
	{
	System.out.println("even number");	
	}else
	{
		System.out.println("Odd Number");
	}
	
	
	
	mathUtils.greet("krishna");
	

	
	// call printPattern
	
	MathUtils.printPattern();
	
	int a[] = {2,3,4,5,6,7,8,9};
	
	int  count = mathUtils.countEvens(a);
	
	System.out.println("There are "+count+" even numbers in array");
	
	
	mathUtils.takeInput(1,2,3);
}



}
