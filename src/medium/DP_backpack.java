package medium;

/**
 * @Description		LintCode 92
 * @author 			Arafat	
 * @Email			arafathayrat@gmail.com
 * @version 		
 * @date 			Apr 4, 2022	11:23:20 PM
 */
public class DP_backpack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bp(10, new int[] {3, 4, 8, 5}));
	}
	
	public static int bp(int m, int[] A) {
		int[][]dp = new int[A.length + 1][m + 1];
		for(int i = 1; i <= A.length; i++) {
			for(int j = 1; j <= m; j++) {
				if(j < A[i - 1])
					dp[i][j] = dp[i - 1][j];
				else 
					dp[i][j] = Math.max(dp[i - 1][j], A[i - 1] + dp[i - 1][j - A[i - 1]]);
			}
		}
		return dp[A.length][m];
	}

}
