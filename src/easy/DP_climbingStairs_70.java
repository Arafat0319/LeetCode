package easy;

/**
 * @Description 这道题可以用DFS和DP去解答 DFS会超时
 * @author Arafat Email:arafathayrat@gmail.com
 * @version
 * @date Feb 25, 2022 8:31:33 PM
 */
public class DP_climbingStairs_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 44;
		long startTime1=System.nanoTime();
//		System.out.println(climbStairs1(n));
		climbStairs1(n);
		long endtTime1=System.nanoTime();
		System.out.println((endtTime1 - startTime1) / 1000000000);
		long startTime2=System.nanoTime();
//		System.out.println(climbStairs2(n));
		climbStairs2(n);
		long endTime2=System.nanoTime();
		System.out.println((endTime2 - startTime2) / 1000000000);
		
	}

//	DFS
	static int res = 0;
	public static int climbStairs1(int n) {
		dfs(1, n);
		return res;
	}

	public static void dfs(int level, int n) {
		if (level >= n) {
			res++;
			return;
		}

		dfs(level + 1, n);
		dfs(level + 2, n);
	}
	public static int climbStairs2(int n) {
		if (n == 0)
			return 0;
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i < dp.length; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n];
	}

}
