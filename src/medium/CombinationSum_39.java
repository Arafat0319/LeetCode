package medium;

import java.util.*;

public class CombinationSum_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(combinationSum(new int[] { 2, 3, 5 }, 8));
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<>();
		dfs(res, new ArrayList<Integer>(), candidates, target, 0);

		return res;
	}

	public static void dfs(List<List<Integer>> res, ArrayList<Integer> tmp, int[] nums, int target, int start) {
		if (target < 0)
			return;
		if (target == 0) {
			res.add(new ArrayList<>(tmp));
			return;
		}
		for(int i = start; i < nums.length; i++) {
			tmp.add(nums[i]);
			dfs(res, tmp, nums, target - nums[i], i);
			tmp.remove(tmp.size() - 1);
		}

	}
}
