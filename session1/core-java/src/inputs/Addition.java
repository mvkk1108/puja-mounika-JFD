package inputs;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
double firstnumber;
	double secondnumber;
	double sum;
		
	
	System.out.println("Enter two Numbers");
	firstnumber = scan.nextDouble();
	//System.out.println("Enter second number");
	secondnumber =scan.nextDouble();
	
	sum = firstnumber + secondnumber; // expression - > Operands and Operator
	
	System.out.println("The sum is "+sum);

	}

}
