package medium;

import java.util.Arrays;

public class threeSumClosest_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(closest(new int[] {0, 0, 1}, 1));
	}
	
	public static int closest(int[] nums, int target) {
//		diff用来存储三个点的和与target的差
		int diff = Integer.MAX_VALUE;
		int n = nums.length;
		Arrays.sort(nums);
		for(int i = 0; i < n && diff != 0; i++) {
			int lo = i + 1, hi = n - 1;
			while(lo < hi) {
				int sum = nums[i] + nums[lo] + nums[hi];
				if(Math.abs(target - sum) < Math.abs(diff)) {
					diff = target - sum;
				}
				if(sum < target)
					lo++;
				else
					hi--;
			}
		}
		
		
		return target - diff;
	}
	


}
