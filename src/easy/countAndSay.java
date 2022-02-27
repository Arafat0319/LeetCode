package easy;

/**
 * @Description		38
 * @author 			Arafat	Email:arafathayrat@gmail.com
 * @version 		
 * @date 			Jan 24, 2021	8:03:28 PM
 */
public class countAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(_countAndSay(6));
	}

	public static String _countAndSay(int n) {
        if(n == 1)
            return "1";
        String str = "1";
        String str2 = "";
        int tmp = 0;
        char c = ' ';
        for(int i = 1; i < n; i++){
            c = str.charAt(0);
            for(int j = 0; j < str.length(); j++){
                if(c == str.charAt(j)){
                    tmp++;
                }else{
                    str2 += tmp;
                    str2 += c;
                    c = str.charAt(j);
                    tmp = 1;
                }
            }
            str2 += tmp;
            str2 += c;
            str = str2;
            str2 = "";
            tmp = 0;
        }
        return str;
    }
}
