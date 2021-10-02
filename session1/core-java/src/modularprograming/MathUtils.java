package modularprograming;
/**
 * 
 * @author madde
 *  
 */
public class MathUtils {
	/** checks given number is even or not
	 * 
	 * @param num any integer
	 * @return 
	 *  true if number is even
	 *  false if number is not even
	 */
	public boolean isEvenNumber(int num) // should return boolean 
	{
	
		if(num % 2 == 0)
			return true;
		else
		return false;
	}
/**
 * 
 * @param name
 */
    public void	greet(String name) // returns nothing
    {
    	System.out.println("Welcome "+name);
    }
    
    public static void printPattern()

    {
    	for(int i =1; i<=5; i++)
    	{
    		for(int j =1; j<=i; j++)
    		{
    			System.out.print(j+" ");
    		}
    		System.out.println();
    	}
    }
    
    
    
   public int countEvens(int[] arr)
    {
    
	   int count = 0;
	   
	   for(int i =0; i<arr.length;i++)
	   {
		   if(arr[i]%2 == 0)
		   {
			   count++;
		   }
	   }
	   
	   return count;
	   
	   
    }
    
   
   public void takeInput(int...x)
   {
	   System.out.println();
   }
    
}
