package leetcode.reverseWordsInAString;

/**
 * reverse each word then reverse whole string
 * @author feiyu
 * @since March 26, 2015
 */
public class Solution {
	public static String reverseWords(String s) {
		StringBuilder result = new StringBuilder();
		String[] strs = s.split(" ");
		for(int i=0; i<strs.length;i++){
			if(!strs[i].equals("")){
				result.append(reverse(strs[i]).replace(" ", ""));
				if(i!=strs.length-1)
					result.append(" ");
			}
		}
        return result.reverse().toString();
    }
	
	private static String reverse(String s){
		StringBuilder result = new StringBuilder();
		for(int i = s.length()-1; i>=0;i--){
			result.append(s.charAt(i));
		}
		return result.toString();
	}
}
