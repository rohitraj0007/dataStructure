package recursion;

public class PelindromeNumberRecursion {
static StringBuffer buff=new StringBuffer();
	private static void pelindrome(int i) {
		if(i<10) {
			buff.append(i);
		}
		else {
			int amp=i%10;
			buff.append(amp);
			pelindrome(i/10);
			
		}
	}
	public static void main(String[] args) {
		int input=1234321;
		pelindrome(input);
		System.out.println(buff);
		System.out.println(buff.toString().equals(String.valueOf(input)));
	}

}
