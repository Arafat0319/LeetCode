package medium;

public class SearchInRotatedSortedArrayII_81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,6,0,0,1,2};
		System.out.println(search(nums, 10));
	}
	
	public static boolean search(int[] nums, int target) {
        if(nums.length == 0 || nums == null)
            return false;
        int n = nums.length - 1;
        if(nums[0] == target || nums[n] == target)
            return true;
        int r = rotate(nums, 0, n);
//        System.out.println("r");
        if(target == nums[r])
            return true;
        else{
            if(target > nums[r] && target < nums[n])
                return find(nums, r, n, target);
            else if(target > nums[0] && target >= nums[r - 1])
                return find(nums, 0, r - 1, target);
        }
        
        return false;
    }
    
    public static int rotate(int[] nums, int l, int r){
    	if(nums[l] < nums[r])
            return 0;
        
        while(l <= r){
            int pivot = (l + r) / 2;
            if(nums[pivot] > nums[pivot + 1] && nums[pivot] > nums[pivot - 1])
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
    
    public static boolean find(int[] nums, int l, int r, int target){
        while(l <= r){
            int pivot = l + (r - l) / 2;
            if(nums[pivot] == target)
                return true;
            else{
                if(nums[pivot] > target)
                    l = pivot + 1;
                else
                    r = pivot - 1;
            }
        }
        return false;
    }

}
