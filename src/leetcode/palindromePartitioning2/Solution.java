package leetcode.palindromePartitioning2;

/**
 * 1 DP
 * @author feiyu
 * @since May 4, 2015
 */
public class Solution {
	public static int minCut(String s) {
        // write your code here
        if (s == null || s.length() == 0) {
            return -1;
        }
        int[] mincut = new int[s.length()+1];
        for(int i = 0; i < s.length()+1;i++){
            mincut[i] = i-1;
        }
        for(int i = 1; i < s.length()+1;i++){
            for(int j = 0; j < i; j++){
                if(mincut[j] + 1 < mincut[i] && isPalindrome(s,j,i-1)){
                    mincut[i] = mincut[j]+1;
                }
            }
        }
        
        return mincut[s.length()];
    }
    private static boolean isPalindrome(String s, int i, int j){
        for(; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
