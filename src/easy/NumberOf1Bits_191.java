package easy;

public class NumberOf1Bits_191 {
	public static void main(String[] args) {
		
	}
	
	public int hammingWeight(int n) {
		int res = 0;
		while(n != 0) {
			res += n & 1;
			n = n >>> 1;
		}
		return res;
	}
}
