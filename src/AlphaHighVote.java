import java.util.Arrays;

public class AlphaHighVote {
	public static void main(String[] args) {
		String  str[] = {"dd","dd","ss","aa","ee","dd","ss","aa","dd","dd","ss"};
		
		Arrays.sort(str);
		int count = 1,maxcount = 0,nameindex=0,previndex=0;
		for(int i=1;i<str.length;i++) {
			
			if(str[previndex].equals(str[i])) {
				count++;
				if(maxcount <= count) {
					maxcount = count;
					nameindex = previndex;
				}
			} else {
				if(maxcount <= count) {
					maxcount = count;
					count = 1;
					nameindex = previndex;
				}
				previndex  = i;
			}
		}
		System.out.println(str[nameindex]);

	}
}
