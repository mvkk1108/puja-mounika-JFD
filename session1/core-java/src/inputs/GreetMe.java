package inputs;

import java.util.Scanner;

public class GreetMe {

	public static void main(String[] args) {
		// name
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter your name");
		name = sc.nextLine();
		
		System.out.println("Welcome "+name);

	}

}
