package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DP_WordBreak_139 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> wordDict = new ArrayList<>();
		wordDict.add("abc");
		wordDict.add("defg");
//		System.out.println();
		System.out.println("\n" + wordBreak("abcdefg", wordDict));
	}

	public static boolean wordBreak(String s, List<String> wordDict) {
		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;
		for(int i = 0; i < dp.length; i++) {			
			for(String str : wordDict) {
				if(dp[i] && i + str.length() < dp.length && (s.substring(i, i + str.length()).equals(str)))
					dp[i + str.length()] = true;
			}
		}
		return dp[dp.length - 1];
	}

}
