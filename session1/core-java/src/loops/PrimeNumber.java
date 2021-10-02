package loops;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int num = sc.nextInt(); 
		/*
		 * 5 
		 * 
		 * 5 % 1 = 0;
		 * 5 % 2 = 1
		 * 5%  3 = 2  
		 * 5 % 4 = 1
		 * 5 % 5 = 0
		 * divisble for 2 
		 * 6
		 * 6 % 1 = 0
		 * 6 % 2 = 0
		 * 6 % 3 = 0
		 * 6 % 4 = 2
		 * 6 % 5 =1 
		 * 6 % 6 = 0
		 * 
		 */
		
		int i =1;
		int count = 0;
		while(i<=num)
		{
			System.out.println(num +" % "+i+" = "+(num%i));
			if(num % i == 0)
			{
				count++;
			}
			i++;
		}
		
		
	//	System.out.println(count);
		if(count == 2)
		{
			System.out.println(num+ " is prime");
		}else
		{
			System.out.println(num +" is not prime");
		}
	}

}
