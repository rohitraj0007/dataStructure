package binaryExponentiation;
/*
 *  It computes all the powers in a loop, and multiplies the ones with the corresponding set bit in n
 *  for example:3^13=3^(1101)2=3^8⋅*3^4*⋅3^1
 *  so we will find power of 3 and multiply them based on binary value 0 or 1
 */
public class NonRecursiveMultiplication {

	public static void main(String[] args) {
		System.out.println(binpow(3,10));//5=0101
	}
	private static long binpow(long a,long b) {
		 long res = 1;
	    while (b > 0) {
	        if ((b & 1)==1)
	            res = res * a;
	        a = a * a;
	        b >>= 1;
	    }
	    return res;
		
	}

}
