package medium;

public class DP_houseRobber_198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rob2(new int[] {2,7,9,3,1}));
	}
	
	public static int rob(int[] nums) {
		//dp代表当前的房子， dp1代表前面一个房子， dp2代表前前个房子
		int dp = 0, dp1 = 0, dp2 = 0;
		for(int i = 0; i < nums.length; i++) {
//			当前房子是否偷，取决于是前面一个房子的价值大还是本座房屋加上前前座的价值大
			dp = Math.max(dp1, dp2 + nums[i]);
			dp2 = dp1;
			dp1 = dp;
			System.out.println("dp = " + dp + "      dp1=" + dp1 + "      dp2 = " + dp2);
			
		}
		
		return dp;
		
	}
	
	public static int rob2(int[] nums) {
		int[] dp = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			dp[i] = i < 2 ? nums[i] : Math.max(nums[i] + dp[i - 2], dp[i - 1]);
		}

		
		return dp[dp.length - 1];
	}

}
