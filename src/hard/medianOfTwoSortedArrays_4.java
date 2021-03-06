package hard;

public class medianOfTwoSortedArrays_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMedianSortedArrays(new int[] {1, 3}, new int[] {2} ));
	}
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int n1 = nums1.length;	//n1为更短的array
        int n2 = nums2.length;
        if(n1>n2)
            return findMedianSortedArrays(nums2, nums1);
        
        int low = 0, high = n1;
        while(low<=high){
            int Amid = low+(high-low)/2;
            int Bmid = (n1+n2+1)/2 - Amid;
            
            double l1 = Amid == 0 ? Integer.MIN_VALUE : nums1[Amid-1];
            double h1 = Amid == n1? Integer.MAX_VALUE : nums1[Amid];
            
            double l2 = Bmid == 0 ? Integer.MIN_VALUE : nums2[Bmid-1];
            double h2 = Bmid == n2? Integer.MAX_VALUE : nums2[Bmid];
            
            if(l1<=h2 && l2<=h1){
                if((n1+n2) % 2 == 0 ){
                    return (Math.max(l1,l2) + Math.min(h1,h2))/2;
                }else
                    return Math.max(l1,l2);
            }else if(l2>h1)
                low = Amid+1;
            else
                high = Amid-1;
        }
        return -1;
    }

}
