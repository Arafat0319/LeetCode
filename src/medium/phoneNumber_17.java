package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class phoneNumber_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(letterCombinations("23"));
	}
	
	public static List<String> letterCombinations(String digits){
		List<String> res = new ArrayList<String>();
		if(digits.length() == 0)
			return res;
		Map<String, Character[]> map = new HashMap<>();
		map.put("2", new Character[] {'a', 'b', 'c'});
		map.put("3", new Character[] {'d', 'e', 'f'});
		map.put("4", new Character[] {'g', 'h', 'i'});
		map.put("5", new Character[] {'j', 'k', 'l'});
		map.put("6", new Character[] {'m', 'n', 'o'});
		map.put("7", new Character[] {'p', 'q', 'r', 's'});
		map.put("8", new Character[] {'t', 'u', 'v'});
		map.put("9", new Character[] {'w', 'x', 'y', 'z'});
		int max = digits.length();
		helper(new StringBuilder(), res, map, digits + "", max);
		return res;
	}
	

	public static void helper(StringBuilder str, List<String> res, Map<String, Character[]> map, String digits, int max) {
		if(str.length() == max) {
			res.add(str.toString());
			return;
		}
		Character[] a = map.get(digits.substring(0, 1));
		
		for(Character ch : a) {
			str.append(ch);
			helper(str, res, map, digits.substring(1), max);
			str.deleteCharAt(str.length() - 1);
		}
	}
}
