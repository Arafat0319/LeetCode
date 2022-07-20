package easy;

public class productOfArraySExceptItself_238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		productExceptSelf(new int[] {1,2,3,4});

	}

	
	public static int[] productExceptSelf(int[] nums) {
        if(nums.length == 0)
            return new int[]{};
        int n = nums.length;
        int[] prifix = new int[n];
        prifix[0] = nums[0];
        int[] postfix = new int[n];
        postfix[n - 1] = nums[n - 1];
        for(int i = 1; i < n; i++) 
            prifix[i] = prifix[i - 1] * nums[i];
        
        System.out.println();
        for(int i = n - 2; i >= 0; i--) 
            postfix[i] = postfix[i + 1] * nums[i];

        
        int[] res = new int[n];
        res[0] = postfix[1];
        res[n - 1] = prifix[n - 2];

        
        for(int i = 1; i < n - 1; i++){
            res[i] = prifix[i - 1] * postfix[i + 1];
        }

        return res;
    }
}
