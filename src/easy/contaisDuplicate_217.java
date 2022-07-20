package easy;

import java.util.HashSet;

public class contaisDuplicate_217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean cd(int[] nums) {
		if(nums.length == 0)
			return false;
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < nums.length; i++) {
			if(!set.contains(nums[i]))
				set.add(nums[i]);
			else
				return true;
		}
		return false;
	}
}
