package medium;


public class integerToRoman_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(intToRoman(1994));
	}

	public static String intToRoman(int num) {
		StringBuilder str = new StringBuilder();

		int number[] = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
		String roman[] = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };

		for(int i = number.length - 1; i >= 0; i--) {
			while(num >= number[i]) {
				str.append(roman[i]);
				num -= number[i];
			}
		}
		return str.toString();
	}
}
