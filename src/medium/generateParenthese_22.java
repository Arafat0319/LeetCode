package medium;

import java.util.ArrayList;
import java.util.List;

public class generateParenthese_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generate(3));
	}
	
	
	public static List<String> generate(int n){
		List<String> res = new ArrayList<>();
		helper(new StringBuilder(), res, 0, 0, n);
		return res;
	}
	
	public static void helper(StringBuilder str,List<String> res, int a, int b, int max){
		if(str.length() == 2*max) {
			res.add(str.toString());
			return;
		}
		if(a < max) {
			str.append('(');
			helper(str, res, a + 1, b, max);
			str.deleteCharAt(str.length() - 1);
		}
//		这道题的难点就在这，如果是b < max就会输出所有可能的结果
//		b < a输出的结果就是合法的对称的括号对
		if(b < a) {
			str.append(')');
			helper(str, res, a, b + 1, max);
			str.deleteCharAt(str.length() - 1);
		}
	}
		
	

}
