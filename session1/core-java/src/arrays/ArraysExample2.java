package arrays;

public class ArraysExample2 {

	public static void main(String[] args) {
		
		int arr[] = {12,13,15,15,89,24,27,29,12,24,32,66};
		int count = 0;
		int oddCount = 0;
		
		for(int i =0;i<arr.length;i++)
		{
		if(arr[i] %2 ==0)
		{
			count++;
		}
		else
		{
			oddCount++;
		}
		}
		System.out.println(arr.length);
		System.out.println("There are "+count+" even numbers in the arry");
		System.out.println("There are "+oddCount+" odd numbers in the arry");
	}

}
