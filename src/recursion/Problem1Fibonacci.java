package recursion;


/*
 * 0,1,1,2,3,5,8,13,21.....
 */
public class Problem1Fibonacci {
	

private static int fib(int n) {
	if(n==0) {

		return 0;
	}
	else if(n==1||n==2){
		return 1;
	}
	return fib(n-2)+fib(n-1);
}
public static void main(String[] args) {
	for(int i=0;i<10;i++) {
		System.out.println(fib(i));
	}
	
}
}
