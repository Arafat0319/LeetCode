package easy;

/**
 * @Description		7
 * @author 			Arafat	Email:arafathayrat@gmail.com
 * @version 		
 * @date 			Jan 27, 2021	1:14:22 PM
 */
public class reverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(123456789));
	}

	public static int reverse(int num) {
		int res = 0;
		for(int i = num; i > 0; i /= 10) {
			res *= 10;
			res += i % 10;
		}
		return res;
	}
}
