package binaryExponentiation;

/*
 * a^n=a*a*a.....till n times
 * The idea of binary exponentiation is,
 *  that we split the work using the binary representation of the exponent.
 *  Let's write n in base 2,
 *   for example:3^13=3^(1101)2=3^8⋅*3^4*⋅3^1
 *   a^n =⎧ 	  1				 if n==0;
 *   		(a^(n/2))^2   	if n>0 and n even
 *   		(a^(n/2))^2*a	if n>0 and n odd
 */
public class RecursiveMultiplication {

	public static void main(String[] args) {
		System.out.println(binpow(2,23));
	}

	private static long binpow(long  num,  long pow) {
		if(pow ==0)
			return 1;
		long res=binpow(num,pow/2);
		if(pow%2==0) {
			return res=res*res;
		}
		else {
			return res=res*res*num;
		}
		
		
	}

}
