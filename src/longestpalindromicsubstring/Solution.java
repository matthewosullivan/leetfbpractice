package longestpalindromicsubstring;

public class Solution {
	
	
	
	
	
	// binary search
	public String longestPalindrome(String s) {
		//System.out.println(s.length());

		String biggest = "";
		int upper = s.length();
		int mid = upper/2;
		int lower = 0;
		
		for (int i = mid; i > lower; i--) {
			
			boolean palindrome = false;
			
			for (int j = 0; j + (i-1) < s.length(); j++) {
				String toTest = s.substring(j, j + i);
				boolean p = true;
				for (int f = 0; f < toTest.length()/2; f++) {
					if (toTest.charAt(f) != toTest.charAt(toTest.length()-1-f)) {
						p = false;
						break;
					}
				}
				if (p) {
					palindrome = true;
				}
			}
			
			if (palindrome) {
				
			}
			
		}
		return "";
    }
	
	public boolean isPalindrome(String s) {
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) != s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution().longestPalindrome("anugnxshgonmqydttcvmtsoaprxnhpmpovdolbidqiyqubirkvhwppcdyeouvgedccipsvnobrccbndzjdbgxkzdbcjsjjovnhpnbkurxqfupiprpbiwqdnwaqvjbqoaqzkqgdxkfczdkznqxvupdmnyiidqpnbvgjraszbvvztpapxmomnghfaywkzlrupvjpcvascgvstqmvuveiiixjmdofdwyvhgkydrnfuojhzulhobyhtsxmcovwmamjwljioevhafdlpjpmqstguqhrhvsdvinphejfbdvrvabthpyyphyqharjvzriosrdnwmaxtgriivdqlmugtagvsoylqfwhjpmjxcysfujdvcqovxabjdbvyvembfpahvyoybdhweikcgnzrdqlzusgoobysfmlzifwjzlazuepimhbgkrfimmemhayxeqxynewcnynmgyjcwrpqnayvxoebgyjusppfpsfeonfwnbsdonucaipoafavmlrrlplnnbsaghbawooabsjndqnvruuwvllpvvhuepmqtprgktnwxmflmmbifbbsfthbeafseqrgwnwjxkkcqgbucwusjdipxuekanzwimuizqynaxrvicyzjhulqjshtsqswehnozehmbsdmacciflcgsrlyhjukpvosptmsjfteoimtewkrivdllqiotvtrubgkfcacvgqzxjmhmmqlikrtfrurltgtcreafcgisjpvasiwmhcofqkcteudgjoqqmtucnwcocsoiqtfuoazxdayricnmwcg"));
		//System.out.println(new Solution().isPalindrome("baab"));
		//System.out.println(new Solution().isPalindrome("bxb"));
		//System.out.println(new Solution().isPalindrome("b"));
	}
}
