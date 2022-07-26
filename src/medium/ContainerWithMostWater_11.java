package medium;

public class ContainerWithMostWater_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static int maxArea(int[] height) {
		int res = 0, l = 0, r = height.length - 1;
		while(l < r) {
			int area = (r - l) * Math.min(height[l], height[r]);
			res = res > area ? res : area;
			
			if(height[l] < height[r])
				l++;
			else
				r--;
		}
		
		return res;
	}
}
