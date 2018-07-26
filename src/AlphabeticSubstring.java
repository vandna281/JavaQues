import java.util.*;

public class AlphabeticSubstring {
	public static void main(String[] args) {
		String str = "abcaab";
		ArrayList<String> stringArr = new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				String s = str.substring(i, j+1);
				if(isVowel(s.charAt(0)) && !isVowel(s.charAt(s.length()-1))) {
					stringArr.add(s);
				}
			}
		}
		System.out.println(stringArr);
		Collections.sort(stringArr);
		System.out.println(stringArr);
		System.out.println(stringArr.get(0));
		System.out.println(stringArr.get(stringArr.size()-1));
	}
	
	public static boolean isVowel(char strchr) {
		if(strchr == 'a' ||strchr == 'e' ||strchr == 'i' || strchr == 'o' ||strchr == 'u' ){
			return true;
		}
		return false;
	}
	
	
}
