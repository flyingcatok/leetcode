package lintcode.twoStringsAreAnagrams;

/**
 * time: O(n), space O(1)
 * @author feiyu
 * @since April 21, 2015
 */
public class Solution {
	/**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public static boolean anagram(String s, String t) {
    	if (s.length() != t.length()) {
    		return false;
    	}
    	int[] count = new int[256];
    	
    	for (int i = 0; i < s.length(); i++) {
    		count[s.charAt(i)]++;
    	}
    	
    	for (int i = 0; i < t.length(); i++) {
    		if (--count[t.charAt(i)] < 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
