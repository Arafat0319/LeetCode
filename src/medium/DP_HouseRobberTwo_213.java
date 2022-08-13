package medium;

public class DP_HouseRobberTwo_213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rob(new int[] {1,2,3,1}));
	}
	public static int rob(int[] nums) {
		
		return Math.max(nums[0], Math.max(helper(nums, 0, nums.length - 2), helper(nums, 1, nums.length - 1)));
	}
	public static int helper(int[] nums, int l, int r) {
		int rob = 0, rob1 = 0, rob2 = 0;
		for(int i = l; i <= r; i++) {
			rob = Math.max(rob2 + nums[i], rob1);
			rob2 = rob1;
			rob1 = rob;
		}
		return rob1;
	}

}
