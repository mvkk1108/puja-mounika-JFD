package modularprograming;

public class Demo1 {

	public static void main(String[] args) {


		
		Addition addition = new Addition();
		
		addition.add(3, 5);
		addition.add(3.6, 5.5);// static binding or early binding or compile time binding
	int x =	addition.add("123", "234");

	}

}
