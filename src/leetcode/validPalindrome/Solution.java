package leetcode.validPalindrome;

/**
 * two pointers
 * @author feiyu
 * @since February 15, 2015
 */
public class Solution {
	public static boolean isPalindrome(String s) {
		if(s == null){
			return false;
		}
		if(s.equals("")){
			return true;
		}
		int p1 = 0;
		int p2 = s.length()-1;
		s = s.toLowerCase();
		while(p1 < p2){
			char c1 = s.charAt(p1);
			char c2 = s.charAt(p2);
			if(isAlphanumeric(c1) && isAlphanumeric(c2)){
				if(c1 == c2){
					p1++;
					p2--;
				}else{
					return false;
				}
			}
			if(!isAlphanumeric(c1)){
				p1++;
			}
			if(!isAlphanumeric(c2)){
				p2--;
			}
		}
        return true;
    }
	
	private static boolean isAlphanumeric(char c){
		return (c>='0' && c <='9')||(c>='a' && c <= 'z')||(c>='A' && c <= 'Z');
	}
}
