package easy;

public class ReverseBits_190 {

	public static void mian() {
		// TODO Auto-generated method stub

	}
	
	public static int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++){
            res *= 2;
            res += n & 1;
            n = n >>> 1;
        }
        return res;
    }
}
