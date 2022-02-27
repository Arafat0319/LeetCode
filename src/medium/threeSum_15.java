package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(new int[] {-1,0,1,2,-1,-4}));
	}
	
	public static List<List<Integer>> sum(int[] nums){
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
//		nums[i] <= 0 因为要求三个和为0的数，所以要么都是0，要么一定要有负数
		for(int i = 0; i < nums.length && nums[i] <= 0; i++) {
//			防止重复
			if(i == 0 || nums[i - 1] != nums[i])
				twoSumII(nums, i, res);
		}
		return res;
	}
	
	
	public static void twoSumII(int[] nums, int i, List<List<Integer>> res) {
		int lo = i + 1, hi = nums.length - 1;
		while(lo < hi) {
			int sum = nums[i] + nums[lo] + nums[hi];
			if(sum > 0)
				hi--;
			else if(sum < 0)
				lo++;
			else {
				res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
//				这一步还是为了避免重复
				while(lo < hi && nums[lo] == nums[lo - 1])
					lo++;
				while(lo < hi && nums[hi] == nums[hi + 1])
					hi--;
			}
		}
	}
}
