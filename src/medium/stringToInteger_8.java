package medium;

public class stringToInteger_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int myAtoi(String s) {
		int index = 0, sign = 1, total = 0;
		
		if(s.length() == 0)
			return 0;
		char[] _s = s.toCharArray();
		
		while(_s[index] == ' ' && index < s.length() - 1)
			index++;
		
		if(_s[index] == '+' || _s[index] == '-') {
			sign = _s[index] == '+' ? 1 : -1;
			index ++;
		}
		
		while(index < s.length()) {
			int digit = _s[index] - '0';
			if(digit < 0 || digit > 9)
				break;
			if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total 
					&& Integer.MAX_VALUE%10 < digit)
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			total = 10 * total + digit;
			index ++;
		}
		
		return total * sign;
	}

}
