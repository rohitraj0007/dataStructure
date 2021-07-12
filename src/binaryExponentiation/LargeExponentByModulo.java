package binaryExponentiation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Effective computation of large exponents modulo a number 
 * Problem: Compute x^n mod m. This is a very common operation.
 * For instance it is used in computing the modular multiplicative inverse.
 * a⋅b mod m≡(a mod m)⋅(b mod m)(mod m))
 * If m is a prime number we can speed up a bit this algorithm by calculating x^(n mod(m−1)) 
 * instead of x^n.
 * This follows directly from Fermat's little theorem
 * example:--(ab) mod p = ( (a mod p) (b mod p) ) mod p 

For example a = 50,  b = 100, p = 13
50  mod 13  = 11
100 mod 13  = 9

(50 * 100) mod 13 = ( (50 mod 13) * (100 mod 13) ) mod 13 
or (5000) mod 13 = ( 11 * 9 ) mod 13
or 8 = 8
 */
public class LargeExponentByModulo {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int testCount = Integer.parseInt(bufferedReader.readLine().trim());
		for (int i = 0; i < testCount; i++) {
			String[] inputs = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
			System.out.println(binpow(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
		}
	}

	private static long binpow(long a, long b, long m) {
		a=a%m;
		long res = 1;
		while (b > 0) {
			if ((b & 1) == 1) {
				res = res * a % m;
			}
			a = a * a % m;
			b >>= 1;

		}
		return res;
	}
}
