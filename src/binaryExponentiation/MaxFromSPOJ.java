package binaryExponentiation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxFromSPOJ {
	static long m = (long) (Math.pow(10, 9) + 7);

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		    int l = Integer.parseInt(bufferedReader.readLine());
		while (l-- > 0) {
			long n = Long.parseLong(bufferedReader.readLine());
			long res = 1;

			if (n == 1) {
				System.out.println(1);
				continue;
			}
			long d = n / 3;
			long rem = n % 3;

			if (rem == 1) {
				d--;
			}

			long a = 3;
			while (d > 0) {
				if ((d & 1) == 1) {
					res = (res * a) % m  ;
				}
				a = (a * a )% m;
				d >>= 1;
			}

			if (rem == 1) {
				res=res*4;
				
			} else if (rem == 2) {
				res=res*2;
			}
			
			res = res%m ;
			System.out.println(res);
		}
	}
}