package leetcode.palindromePartitioning2;

/**
 * 2 DP
 * @author feiyu
 * @since May 4, 2015
 */
public class Solution2 {
	public static int minCut(String s) {
        // write your code here
        if (s == null || s.length() == 0) {
            return -1;
        }
        int[] mincut = new int[s.length()+1];
        for(int i = 0; i < s.length()+1;i++){
            mincut[i] = i-1;
        }
        boolean[][] isPalindrome = getIsPalindrome(s);
        for(int i = 1; i < s.length()+1;i++){
            for(int j = 0; j < i; j++){
                if(mincut[j] + 1 < mincut[i] && isPalindrome[j][i-1]){
                    mincut[i] = mincut[j]+1;
                }
            }
        }
        
        return mincut[s.length()];
    }
	
	private static boolean[][] getIsPalindrome(String s) {
		boolean[][] isPalindrome = new boolean[s.length()][s.length()];
		for(int i = 0; i < s.length();i++) {
			isPalindrome[i][i] = true;
		}
		for(int i = 0; i < s.length()-1;i++){
			isPalindrome[i][i+1] = (s.charAt(i) == s.charAt(i+1));
		}
		for(int length = 2; length < s.length();length++){
			for(int start = 0; start + length < s.length();start++){
				isPalindrome[start][start+length] = isPalindrome[start+1][start+length-1] && s.charAt(start)==s.charAt(start+length);
			}
		}
		return isPalindrome;
	}
}
