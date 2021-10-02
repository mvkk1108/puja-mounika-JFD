package arrays;

import java.util.Scanner;

public class ArraysExample4 {
	/*  data in the form of rows and columns
	 *  matrix 
	 *  
	 * arr[][] =  {{1, 2, 3},
	 *  {2, 3 ,4},
	 *  {3 ,4 ,5}}
	 *  
	 *  
	 *  arr[2 - row position][2- column - positin ] -5
	 *  
	 * arr [] =  {2,3,4,5,6};
	 * System.out.println(arr[4]);
	 * arr.length
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

int arr[][] = {{1,2,3},{2,5},{3,4,5,6}};

// arr.length = no of rows
// arr[0].length = 3
// arr]1].length = 2
// arr[2].length =4
for(int row =0; row<arr.length;row++)
{

	for(int col=0; col<arr[row].length;col++)
	{
		System.out.print(arr[row][col]+" ");	
	}
	System.out.println();
	
}

//System.out.print(arr[0][1]+" ");
//System.out.print(arr[0][2]+" ");

/*
 * System.out.print(arr[1][0]+" "); System.out.print(arr[1][1]+" ");
 * System.out.print(arr[1][2]+" "); System.out.println();
 * System.out.print(arr[2][0]+" "); System.out.print(arr[2][1]+" ");
 * System.out.print(arr[2][2]+" ");
 */
int arr1[][] = new int[3][3]; 

// row = 0 , 1, 2
// col = 0 ,1,2

System.out.println("Enter Elements");
for(int i = 0; i<arr1.length;i++)
{
	for(int j = 0;j<arr1[i].length;j++)
	{
		arr1[i][j] = sc.nextInt();
	}
}


/*
 * arr1[0][1] = sc.nextInt(); arr1[0][2] = sc.nextInt();
 * 
 * arr1[1][0] = 19; arr1[1][1] = 11; arr1[1][2] = 91;
 * 
 * arr1[2][0] = 20; arr1[2][1] = 23; arr1[2][2] = 24;
 */

System.out.println("********************************************");
for(int row =0; row<arr1.length;row++)
{

	for(int col=0; col<arr1[row].length;col++)
	{
		System.out.print(arr1[row][col]+" ");	
	}
	System.out.println();
	
}


	}

}
