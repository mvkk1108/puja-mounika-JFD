package loops;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		
		// read three numbers 
		// x = 80 , y = 70 op = 1 add , 2 sub ,3 mul or 4 div  other value print invaid option
		Scanner sc = new Scanner(System.in);
		
		int firstnumber, seconnumber, option;
		
		
		
		char isContinue = '0';
		do {
			System.out.println("Enter Input ");
			firstnumber = sc.nextInt();
			seconnumber = sc.nextInt();
			option= sc.nextInt();
			switch (option) {
			case 1:
				System.out.println(firstnumber+" + "+seconnumber+" = "+(firstnumber+seconnumber));
				break;
			case 2:
				System.out.println(firstnumber+" - "+seconnumber+" = "+(firstnumber-seconnumber));
				break;
			case 3:
				System.out.println(firstnumber+" * "+seconnumber+" = "+(firstnumber*seconnumber));
				break;
			case 4:
				System.out.println(firstnumber+" / "+seconnumber+" = "+(firstnumber/seconnumber));
				break;
			default:
				System.out.println("Invalid Option");
				break;
			}
			
			System.out.println("Do you want to continue ? Y or N");
			isContinue = sc.next().charAt(0);
			System.out.println(isContinue);
		}while(isContinue=='Y');
		
		// char Y N
	}

}
