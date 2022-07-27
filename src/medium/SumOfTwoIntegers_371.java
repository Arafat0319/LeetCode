package medium;

public class SumOfTwoIntegers_371 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(3, 2));
	}

	public static int getSum(int a, int b) {
		while (b != 0) {
			int tmp = (a & b) << 1;
			a = a ^ b;
			b = tmp;
		}
		return a;
	}

}
