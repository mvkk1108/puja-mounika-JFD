package arrays;

public class ArraysExample3 {

	public static void main(String[] args) {
		
		int arr[] = {12,13,34,15,15,89,24,27,34,29,12,34,24,32,66};
		int key = 34;
		int index = -1;
		for(int i =0; i<arr.length;i++)
		{
			if(key == arr[i])
			{
				index = i;
				//System.out.println("Last occurance"+i);
				//break;
			}
		}
		
		System.out.println(key+" found at "+index +" postion");
	}

}
