package medium;

import java.util.Arrays;
import java.util.Collections;

public class MaximumSubarrayProduct_152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int maxProduct(int[] nums) {
		int max = 1, min = 1, tmp = 1, res = Arrays.stream(nums).max().getAsInt();
		for(int n : nums) {
			if(n == 0) {
				max = 1;
				min = 1;
				continue;
			}
			tmp = max * n;
			max = Math.max(n, Math.max(n * max, min * n));
			min = Math.min(n, Math.min(tmp, min * n));
			res = Math.max(res, max);
		}
		
		return max;
	}

}
