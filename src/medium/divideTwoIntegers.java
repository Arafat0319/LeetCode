package medium;

public class divideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(divide(-2147483648, -1));
	}

	
	public static int divide(int dividend, int divisor) {
		if(dividend == 0)
            return 0;
		if(divisor == 1 || divisor == -1) {
			if((dividend < 0) ^ (divisor < 0)) {
				System.out.println("hry");
				return dividend;
			}
			return dividend;
		}
        double a = Math.abs(dividend);
        double b = Math.abs(divisor);
        System.out.println(a);
        
        long res = (long) Math.exp(Math.log(a) - Math.log(b));
        System.out.println(res);
        
        if((dividend < 0) ^ (divisor < 0)) return (int) (res * -1);
        
        if(res > Integer.MAX_VALUE) res = Integer.MAX_VALUE;
        
        return (int) res;
	}
}
