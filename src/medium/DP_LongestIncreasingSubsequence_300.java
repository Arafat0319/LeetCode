package medium;

public class DP_LongestIncreasingSubsequence_300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lenghtOfLIS(new int[] {0,1,0,3,2,3}));
	}
	
	public static int lenghtOfLIS(int[] nums) {
		int n = nums.length;
		int[] dp = new int[nums.length];
		int res = 0;
		for(int i = n - 1; i >= 0; i--) {
			dp[i] = 1;
			for(int j = i + 1; j < n; j++) {
				if(nums[i] < nums[j])
					dp[i] = Math.max(dp[i], dp[j] + 1);
			}
		}
		
		for(int i : dp)
			res = res > i ? res : i;
		return res;
	}

}
