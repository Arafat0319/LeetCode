package easy;

public class addStrings_415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(as("1", "9"));
		
	}
	
	public static String as(String num1, String num2) {
		StringBuilder res = new StringBuilder();
		int rmd = 0;
		int tmp = 0;
		char[] a = num1.toCharArray();
		char[] b = num2.toCharArray();
		
		int i = a.length - 1, j = b.length - 1;
		while(i >= 0 || j >= 0) {
			tmp += rmd;
			if(i >=0)
				tmp += a[i--] - '0';
			if(j >= 0)
				tmp += b[j--] - '0';
//			System.out.println(tmp);
			res.insert(0, (tmp % 10) + "");
			rmd = tmp / 10;
			tmp = 0;
		}
		if(rmd != 0)
			res.insert(0, rmd + "");
		
		
		return res.toString();
	}

}
