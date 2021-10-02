package operators;

public class OperatorsExample {
	public static void main(String[] args) {
		int a = 40;
		int b = 80;
		int c =60;
		System.out.println(a+" + "+b+" = "+(a + b));
		System.out.println(a+" - "+b+" = "+(a - b));
		System.out.println(a+" * "+b+" = "+(a * b));
		System.out.println(a+" / "+b+" = "+(a / b));
		System.out.println(a+" % "+b+" = "+(a % b));
		
		int a1 = -5;
		//a1 = a1 + 1;;
		//++a1; // pre increment
	//	a1++; // post increment
		//int b1 = a+(a1++);
	//	System.out.println(b1);
		//System.out.println("a1 = "+a1);
		
		//System.out.println(a+" += 3"+" = "+(a+=3));
		
		
		a1 = -a1; // unary
		
		System.out.println(a1);
		
		
		// ternary operator ?:
		
		int x = a > b?20:30;
		
		System.out.println(x);
		
		
		
		System.out.println("Relational Operators");
		System.out.println(a+" > "+b+" = "+(a > b));
		System.out.println(a+" < "+b+" = "+(a < b));
		System.out.println(a+" >= "+b+" = "+(a >= b));
		System.out.println(a+" <= "+b+" = "+(a <= b));
		System.out.println(a+" == "+b+" = "+(a == b));	
		System.out.println(a+" != "+b+" = "+(a != b));	
		
		System.out.println("Logical Operators");
		
		
		System.out.println("( "+a+" > "+b+" ) && ( "+a+" > "+c+" ) = "+((a>b) && (a>c)));
		System.out.println("( "+a+" > "+b+" ) || ( "+a+" > "+c+" ) = "+((a>b) || (a>c)));
		System.out.println("! ( "+a+" > "+b+" ) = "+(!(a>b)));
		
	}

	/*
	 *  Arithmetic Operators 
	 *  
	 *    + , - ,*, / , % , ++ , --
	 *    
	 *    a = 90;
	 *    b = 80;
	 *    a+b = 170
	 *    a - b 
	 *    
	 *    a  * b
	 *    a / b = 1
	 *    
	 *    a % b = 10
	 *    
	 *    ++ is increment operator
	 *    
	 *    
	 *    a++ = > a = a + 1;
	 *    b++
	 *    a = 6;
	 *    a++
	 *    -- decrement
	 *    a-- > a = a - 1
	 *    
	 *    Shorthand Operators
	 *    
	 *    a = a + 3;
	 *    a+=3;
	 *    
	 *    a = a+b;
	 *    a+=b; = > a = a + b;
	 *    
	 *     a = a / 10;
	 *     a/=10;
	 *     
	 *     a = a * c;
	 *     a*=c;
	 *    
	 *    a = a+b;
	 *    
	 *    
	 *    
	 *    Relational Operator ->
	 *    a = 6
	 *    b = 7
	 *      >, <, >= ,<=  , == , !=
	 *      
	 *       a > b = false relational Expression true or false
	 *       a < b = true
	 *       a >= b = false
	 *       
	 *       a <= b = true
	 *       a==b =false
	 *       a!=b true
	 *       
	 *       Logical Operators :
	 *       
	 *       
	 *        && Logical AND
	 *        
	 *        || Logical OR 
	 *        
	 *        ! Logical NOT
	 *        
	 *        
	 *        a = 3
	 *        b = 2
	 *        c = 6
	 *        
	 *        (a > b ) &&  (a > c)  Result
	 *          
	 *          T   &&        T        T
	 *          
	 *          F    &&   F           F
	 *          
	 *          F     &&   T          F
	 *          
	 *          T && F                F
	 *          
	 *          
	 *        (a > b ) ||  (a > c)  Result
	 *          
	 *          T   &&        T        T
	 *          
	 *          F    &&   F           F
	 *          
	 *          F     &&   T          T
	 *          
	 *          T && F                T
	 *          
	 *          
	 *          !(a > b) = F
	 *          
	 *          
	 *          
	 */
}
