package modularprograming;

public class NCR {
	/*
	 * n = 5 r = 3
	 *  nCr = n!/r!*(n-r)!
	 */
	public static void main(String[] args) {
		
		int n = 5;
		int r = 3;
		int ncr;
		int nfact = 1;
		int rfact = 1;
		int nmrfact = 1;
		
		FactorialFinder ff = new FactorialFinder();
		
		nfact = ff.factorial(n);
		rfact =ff.factorial(r);
		nmrfact = ff.factorial(n-r);
		ncr = nfact /(rfact*nmrfact);
		
		System.out.println(ncr);
	}

}
