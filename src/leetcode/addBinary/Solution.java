package leetcode.addBinary;

/**
 * string builder: works, but very slow
 * @author feiyu
 * @since January 4, 2015
 */
public class Solution {
	public static String addBinary(String a, String b) {
		StringBuilder A = new StringBuilder(a);
		StringBuilder B = new StringBuilder(b);
		StringBuilder result = new StringBuilder();
		A.reverse();
		B.reverse();
		int aLength = A.length();
		int bLength = B.length();
		int n = (aLength<bLength) ? aLength:bLength;
		int m = (aLength<bLength) ? bLength:aLength;
		int carry = 0;
		for(int i=0;i<n;i++){
			int r = A.charAt(i) + B.charAt(i) + carry - 96;// '0' is 49th.
			if(r == 0){
				result.append("0");
				carry = 0;
			}else if(r == 1){
				result.append("1");
				carry = 0;
			}else if(r == 2){
				result.append("0");
				carry = 1;
			}else{//r==3
				result.append("1");
				carry = 1;
			}
		}
		StringBuilder C = (n == aLength) ? B:A;
		for(int i=n;i<m;i++){
			int r = C.charAt(i)+carry-48;
			if(r ==0){
				result.append("0");
				carry = 0;
			}else if(r ==1){
				result.append("1");
				carry = 0;
			}else{//r=2
				result.append("0");
				carry = 1;
			}
		}
		if(carry==1){
			result.append("1");
		}
		
		return result.reverse().toString();
        
    }
}
