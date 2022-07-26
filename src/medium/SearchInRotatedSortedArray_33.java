package medium;

public class SearchInRotatedSortedArray_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8,9,2,3,4};
		System.out.println(search(nums, 9));
	}
	
	public static int search(int[] nums, int target) {
        if(nums[0] < nums[nums.length - 1])
            return search(nums, target, 0, nums.length - 1);
        int rotate = findRotatedIndex(nums);
        System.out.println(rotate);
        if(nums[0] <= target) {
        	System.out.println("front");
            return search(nums, target, 0, rotate - 1);
        }
        System.out.println("end");
        return search(nums, target, rotate, nums.length - 1);
    }
    
    private static int findRotatedIndex(int[] nums){
        int l = 0, r = nums.length - 1;
        if(nums[l] < nums[r])
            return 0;
        
        while(l <= r){
            int pivot = l + (r - l) / 2;
            if(nums[pivot] > nums[pivot + 1])
                return pivot + 1;
            else{
                if(nums[pivot] < nums[l])
                	r = pivot - 1;
                else
                	l = pivot + 1;
            }
        }
        return 0;
    }
    
    private static int search(int[] nums, int target, int start, int end){
        int l = start, r = end;
        while(l <= r){
            int pivot = l + (r - l) / 2;
            System.out.println(pivot);
            if(nums[pivot] == target)
                return pivot;
            else{
                if(nums[pivot] < target)
                    l = pivot + 1;
                else
                    r = pivot - 1;
            }
        }
        return -1;
    }

}
