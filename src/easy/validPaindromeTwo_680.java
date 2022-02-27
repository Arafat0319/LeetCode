package easy;


public class validPaindromeTwo_680 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
		System.out.println(validPalindrome(s));
	}
	
	public static boolean validPalindrome(String s) {
		int left = 0, right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right))
                return validPalindrome(left + 1, right, s) || validPalindrome(left, right - 1, s);
            left++;
            right--;
        }
        return true;
    }
	
	public static boolean validPalindrome(int left, int right, String s) {
		while(left < right)
			if(s.charAt(left++) != s.charAt(right--))
				return false;
		return true;
	}
}
