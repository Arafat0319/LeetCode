package medium;

public class DP_LongestCommonSubsequence_1143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(longestCommonSubsequence("bsbininm", "jmjkbkjkv"));
		System.out.println(longestCommonSubsequence("aaa", "aaaaaaa"));

	}

	public static int longestCommonSubsequence(String text1, String text2) {
		int[][] dp = new int[text1.length()][text2.length()];
		for(int i = 0; i < text1.length(); i++) {
			for(int j = 0; j < text2.length(); j++) {
				if(i == 0 && j == 0)
					dp[i][j] = text1.charAt(0) == text2.charAt(0) ? 1 : 0;
				else if(i == 0) {
					dp[i][j] = dp[i][j - 1];
					if(text1.charAt(i) == text2.charAt(j))
						dp[i][j] = Math.max(1, dp[i][j - 1]);
				}else if(j == 0) {
					dp[i][j] = dp[i - 1][j];
					if(text1.charAt(i) == text2.charAt(j))
						dp[i][j] = Math.max(1, dp[i - 1][j]);
				}else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
					if(text1.charAt(i) == text2.charAt(j))
						dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
				}
			}
		}
		
		
		for(int i = 0; i < text1.length(); i++) {
			for(int j = 0; j < text2.length(); j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		
		return dp[text1.length() - 1][text2.length() - 1];
		
		
		
	}
}
