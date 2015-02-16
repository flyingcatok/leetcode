package leetcode.excelColumnTitle;

/**
 * 
 * @author feiyu
 * @since January 7, 2015
 */
public class Solution {
	public static String convertToTitle(int n) {
		StringBuilder result = new StringBuilder();
		
//		while(n>26){
//			int residue = n % 26;
//			result.append((char)(residue+65));
//			n = n/26;
//		}
//		result.append((char)(n+65));
		return result.reverse().toString();
        
    }
}
