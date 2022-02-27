package medium;


public class zigzag_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("paypalishiring", 3));

	}
	
	public static String convert(String s, int numRows) {
		char[] _s = s.toCharArray();
		int len = s.length();
		StringBuilder[] sb = new StringBuilder[numRows];
		for(int i = 0; i < numRows; i++)
			sb[i] = new StringBuilder();
		
		int idx = 0;
		while(idx < len) {
			for(int i = 0; i < numRows && idx < len; i++) {
				sb[i].append(_s[idx++]);
			}
			for(int i = numRows - 2; i >= 1 && idx < len; i--) {
				sb[i].append(_s[idx++]);
			}
		}
		
		for(int i = 1; i < sb.length; i++) {
			sb[0].append(sb[i]);
		}
		
		return sb[0].toString();
	}

}
