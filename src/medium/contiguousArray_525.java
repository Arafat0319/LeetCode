package medium;

import java.util.Arrays;
import java.util.HashMap;

public class contiguousArray_525 {
	public static void main(String[] args) {
		int nums[] = {1,1,1,0,1,0,0,0,0,1,1,0,1};
//		int[] nums = {1,0};
//		int[] nums = {1,1,1,0,1,0,0};
		
		System.out.println(findMaxLength(nums));
	}
	public static int findMaxLength(int[] nums) {
        if(nums.length == 0)
            return 0;
        int ans = 0;
        //第一个数字用来存储位置，第二个数字用来存储prefix的值；
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] prefix = new int[nums.length + 1];
        prefix[0] = 0;
        map.put(0, 0);
        for(int i = 0; i < nums.length; i++) {
        	int tmp = nums[i] == 1 ? 1 : -1;
        	prefix[i + 1] = prefix[i] + tmp;
        	if(!map.containsKey(prefix[i + 1])) {
        		map.put(prefix[i + 1], i + 1);
//        		System.out.println(Arrays.toString(prefix) + "   " + map);        	
        	}
        	else
//        		System.out.println(Arrays.toString(prefix) + "   " + map);
        		ans = Math.max(ans, i + 1 - map.get(prefix[i + 1]));
        }
        
        return ans;
    }
}
