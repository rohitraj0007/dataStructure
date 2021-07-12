package recursion;


	public class PelindromeStringRecur {
		static StringBuffer buff=new StringBuffer();
			private static void pelindrome(String str) {
				if(str.length()==1) {
					buff.append(str);
				}
				else {
					char amp=str.charAt(str.length()-1);
					buff.append(amp);
					pelindrome(str.substring(0,str.length()-1));
					
				}
			}
			public static void main(String[] args) {
				String input="jahajj";
				pelindrome(input);
				System.out.println(buff);
				System.out.println(buff.toString().equals(String.valueOf(input)));
			}

		}
