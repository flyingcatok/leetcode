package lintcode.longestCommonSubstring;

/**
 * DP. lcs[i][j] = length of lcs of first i chars of A (ending with i) and lcs of first j chars of B (ending with j).
 * @author feiyu
 * @since May 5, 2015
 */
public class Solution {
    public static int longestCommonSubstring(String A, String B) {
        // write your code here
        if (A == null || A.length() == 0) {
            return 0;
            
        }
        if(B == null || B.length() == 0) {
            return 0;
        }
        int m = A.length();
        int n = B.length();
        int[][] lcs = new int[m+1][n+1];
        for(int i = 0; i < m + 1; i++) {
            lcs[i][0] = 0;
        }
        for(int i = 0; i < n + 1; i++) {
            lcs[0][i] = 0;
        }
        for(int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                lcs[i][j] = A.charAt(i-1) == B.charAt(j-1) ? lcs[i-1][j-1] + 1 : 0;
            }
        }
        int max = 0;
        for(int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (lcs[i][j] > max) {
                    max = lcs[i][j];
                }
            }
        }
        return max;
    }
}
