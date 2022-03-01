package medium;

import easy.countAndSay;

public class DP_coinChange_322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = { 1, 2, 5};
		int amount = 11;
		System.out.println(coinChange(coins, amount));

	}

	public static int coinChange(int[] coins, int amount) {
		if(coins.length == 0)
			return 0;
		int[] dp = new int[amount + 1];
		dp[0] = 0;
		for(int i = 1; i < amount + 1; i++) {
			dp[i] = Integer.MAX_VALUE;
			for(int j : coins) {
				if(i >= j && dp[i - j] != Integer.MAX_VALUE)
					dp[i] = Math.min(dp[i - j] + 1, dp[i]);
			}
		}
		
		return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
	}

}
