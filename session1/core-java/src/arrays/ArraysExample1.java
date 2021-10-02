package arrays;

import java.util.Scanner;

public class ArraysExample1 {
// 90 80 60 50 70 
	public static void main(String[] args) {
		
		int arr[]= {78,56,67,89}; // size = 5
		// 0 index - 4 index
		System.out.println(arr.length);
		int arr1[]=new int[5]; // 0-4
		System.out.println(arr1.length);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any values");
		for(int i =0;i<arr1.length; i++) // i =0,1,2,3,4,
		{
		arr1[i]= s.nextInt();
		}
		
		
		System.out.println("Values From arr ");
		
		for(int i =0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
System.out.println("Values From arr1 ");
		
		for(int i =0; i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
	}

}
