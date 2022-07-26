package medium;

public class FindMinimumInRotatedSortedArray_153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMin(new int[] {4,5,6,7,8,9}));
	}
	
	public static int findMin(int[] nums) {
		int l = 0, r = nums.length - 1;
		if(nums[l] < nums[r])
			return nums[l];
		while(l < r) {
			int mid = l + (r - l) / 2;
			if(nums[mid] > nums[l])
				l = mid;
			else if(nums[mid] < nums[r])
				r = mid;
			else
				return (Math.min(nums[l], nums[r]));
		}
		return -1;
	}

}
