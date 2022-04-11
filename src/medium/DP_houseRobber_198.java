package medium;

public class DP_houseRobber_198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rob(new int[] {2,7,9,3,1}));
	}
	
	public static int rob(int[] nums) {
		int dp = 0, dp1 = 0, dp2 = 0;
		for(int i = 0; i < nums.length; i++) {
			dp = Math.max(dp1, dp2 + nums[i]);
			dp2 = dp1;
			dp1 = dp;
			
		}
		
		return dp;
		
	}

}
