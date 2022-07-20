package easy;

public class bestTimeToBuyAndSellStock_121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
	}
	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int l = 0, r = 0, res = 0;
		while(r < prices.length) {
			if(prices[r] < prices[l])
				l = r;
			res = res > prices[r] - prices[l] ? res : prices[r] - prices[l];
			r++;
		}
		return res;
	}

}
