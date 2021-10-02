package coditionalstatements;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		
		int firstnumber = sc.nextInt();
		int secondnumber = sc.nextInt();
		int thirdnumber = sc.nextInt();  // 1 add 2 sub 3 mul 4 div 
		
		
		
		switch (thirdnumber) {
		case 1:
			 System.out.println(firstnumber +" + "+secondnumber+" = "+(firstnumber + secondnumber));
			break;
		case 2:
			 System.out.println(firstnumber +" - "+secondnumber+" = "+(firstnumber - secondnumber));
			 break;
		case 3:
			 System.out.println(firstnumber +" * "+secondnumber+" = "+(firstnumber * secondnumber));
			 break;
		case 4:
			 System.out.println(firstnumber +" / "+secondnumber+" = "+(firstnumber / secondnumber));
			 break;
		default:
			System.out.println("Invalid option");
			break;
		}
		
		/*
		 * if(thirdnumber == 1) { System.out.println(firstnumber +" + "+secondnumber
		 * +" = "+(firstnumber + secondnumber)); } else if(firstnumber == 2) {
		 * System.out.println(firstnumber +" - "+secondnumber +" = "+(firstnumber -
		 * secondnumber)); } else if(firstnumber == 3) { System.out.println(firstnumber
		 * +" * "+secondnumber +" = "+(firstnumber * secondnumber)); } else
		 * if(firstnumber == 4) { System.out.println(firstnumber +" / "+secondnumber
		 * +" = "+(firstnumber / secondnumber)); } else {
		 * System.out.println("Invalid Option"); }
		 */
		
	}

}
