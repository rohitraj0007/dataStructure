package binaryExponentiation;

/*there are many ways of finding nth fibonacci number
 * 1. Recursion (not good)  T(n) = T(n-1) + T(n-2) which is exponential. 
 * 2. Dynamic , start finding from 1 till end saving value reusing it
 * 3. Matrix multiplication  M = {{1,1},{1,0}} nth power will give n+1 fibonacci  O(n) 
 * 4. optimize 3 rd method by using binaryExponentiation O(Logn) 
 * 5.  recurance formula If n is even then k = n/2:
F(n) = [2*F(k-1) + F(k)]*F(k)

If n is odd then k = (n + 1)/2
F(n) = F(k)*F(k) + F(k-1)*F(k-1)

 * 6. Fn = {[(√5 + 1)/2] ^ n} / √5 
 */

/*
 * using 3 rd method
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
 */
public class FibonacciNumberNth {
	public static void main(String[] args) {
		
		fibonacci(9);
		fibonacciByBinaryExponents(9);
	}

	private static void fibonacci(int n) {
		int f[][] = new int[][] { { 1, 1 }, { 1, 0 } };
		
		
		//System.out.println(0,1,1);
		for(int i=0;i<n-3;i++) {
			/*
			 * for(int i=0;i<n;i++) { if(i<3 ) { if(i==0) { System.out.println("0"); } else
			 * { System.out.println("1"); } continue; }
			 */
			int x=1*f[0][0]+1*f[0][1];
			int y=1*f[0][0]+0*f[0][1];
			f[0][0]=x;
			f[0][1]=y;
			/*
			 * only f[0][0]=f(n+1) and f[0][1]=f(n) is important other multiplication is not required
			 * 
			 */
			//System.out.println(x);
		}
		System.out.println(f[0][0]);
		
	}
	private static void fibonacciByBinaryExponents(int n) {
		int f[][] = new int[][] { { 1, 1 }, { 1, 0 } };
		
		
		//System.out.println(0,1,1);
		//for(int i=0;i<n-3;i++) {
			/*
			 * for(int i=0;i<n;i++) { if(i<3 ) { if(i==0) { System.out.println("0"); } else
			 * { System.out.println("1"); } continue; }
			 */
		/*
		 * int x=1*f[0][0]+1*f[0][1]; int y=1*f[0][0]+0*f[0][1]; f[0][0]=x; f[0][1]=y;
		 */
			/*
			 * only f[0][0]=f(n+1) and f[0][1]=f(n) is important other multiplication is not required
			 * 
			 */
			//System.out.println(x);
		//}
		
		int res[][] = new int[][] { { 1, 0 }, { 0, 0 } };
		n=n-2;
		    while (n > 0) {
		        if ((n & 1)==1)
		            res = matrixMultiply(res,f);
		        f = matrixMultiply(f ,f);
		        n >>= 1;
		    }
		    
		System.out.println(res[0][0]);
		
	}

	private static int[][] matrixMultiply(int[][] r, int[][] f) {
		// TODO Auto-generated method stub
		int x=r[0][0]*f[0][0]+r[0][1]*f[1][0];
		int y=r[0][0]*f[0][1]+r[0][1]*f[1][1];
		int z=r[1][0]*f[0][0]+r[1][1]*f[1][0];
		int a=r[1][0]*f[0][1]+r[1][1]*f[1][1];
		r[0][0]=x;
		r[0][1]=y;
		r[1][0]=z;
		r[1][1]=a;
		return r;
	}
}
