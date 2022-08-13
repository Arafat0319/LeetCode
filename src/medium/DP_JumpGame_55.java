package medium;

import java.util.Arrays;

public class DP_JumpGame_55 {
	public static void main(String[] args) {
		System.out.println(canJump(new int[] { 2, 3, 1, 1, 4 }));
	}

	public static boolean canJump(int[] nums) {
		boolean[] dp = new boolean[nums.length];
		dp[0] = true;
		for (int i = 0; i < dp.length; i++) {
			if (dp[i])
				for (int n = 1; n <= nums[i]; n++) {
					if (i + n < dp.length) {
						if(i + n == dp.length - 1)
							return true;
						dp[i + n] = true;
					}
				}
			System.out.println(Arrays.toString(dp));
		}
		return dp[dp.length - 1];
	}
}
