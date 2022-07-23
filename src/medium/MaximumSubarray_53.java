package medium;

public class MaximumSubarray_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();

	}
	
	public static int maxSubArray(int[] nums) {
		int subMax = 0, res = Integer.MIN_VALUE;
		for(int i : nums) {
			subMax += i;
			res = res > subMax ? res : subMax;
			subMax = subMax > 0 ? subMax : 0;
		}
		
		return res;
	}

}
