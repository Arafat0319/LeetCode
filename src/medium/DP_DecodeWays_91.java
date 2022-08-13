package medium;

public class DP_DecodeWays_91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numDecodings("10110121"));
		System.out.println(numDecodings2("10110121"));
	}

	public static int numDecodings(String s) {
		if (s == null || s.length() == 0 || s.charAt(0) == '0')
			return 0;
		int[] dp = new int[s.length() + 1];
		dp[0] = dp[1] = 1;
		for (int i = 1; i < dp.length - 1; i++) {
			if (s.charAt(i) != '0')
				dp[i + 1] += dp[i];
			int num = Integer.valueOf(s.substring(i - 1, i + 1));
			if (num >= 10 && num < 27)
				dp[i + 1] += dp[i - 1];
		}
		return dp[s.length()];
	}

	public static int numDecodings2(String s) {
		if (s == null || s.length() == 0 || s.charAt(0) == '0')
			return 0;
		int one = 1, two = 1, res = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '0')
				res = one;
			else
				res = 0;
			if (i != 0) {
				int num = Integer.valueOf(s.substring(i - 1, i + 1));
				if(num >= 10 && num < 27)
					res += two;
				two = one;
			}
			one = res;
			System.out.println(one + "  " + two + "  " + res);
		}

		return res;
	}

}
