package medium;

import java.util.Arrays;

public class nextPrermutation_31 {
	public static void main(String[] args) {
		int[] nums = {1,5,1};
		solution(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	
	public static void solution(int[] nums) {
		if(nums == null || nums.length == 0)
			return;
		
		int i = nums.length - 2;
		while(i >= 0 && nums[i] >= nums[i + 1])
			i--;
		
		if(i >= 0) {
			int j = nums.length - 1;
			while(j >= 0 && nums[j] <= nums[i])
				j--;
			swap(nums, i, j);
		}
		reverse(nums, i + 1, nums.length - 1);
	}
	
	
	public static void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
	public static void reverse(int[] nums, int i, int j) {
		while(i < j)
			swap(nums, i++, j--);
	}
}
