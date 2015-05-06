package leetcode.editDistance;

/**
 * DP. md[i][j] = min steps to change from first i chars in word1 to first j chars in word2. 
 * md[i][j] = min(md[i-1][j-1], md[i-1][j]+1, md[i][j-1]+1) when word1(i) = word2(j)
 * md[i][j] = min(md[i-1][j-1]+1, md[i-1][j]+1, md[i][j-1]+1) when word1(i) != word2(j)
 * @author feiyu
 * @since May 5, 2015
 */
public class Solution {
	public static int minDistance(String word1, String word2) {
        if (word1 == null || word1.length() == 0) {
            return word2.length();
        }
        if (word2 == null || word2.length() == 0) {
            return word1.length();
        }
        int m = word1.length();
        int n = word2.length();
        int[][] md = new int[m+1][n+1];
        for(int i = 0; i < m + 1; i++) {
            md[i][0] = i;
        }
        for(int i = 0; i < n + 1; i++) {
            md[0][i] = i;
        }
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)){
                    md[i][j] = min3(md[i-1][j-1], md[i-1][j]+1, md[i][j-1]+1);
                } else {
                    md[i][j] = min3(md[i-1][j-1], md[i-1][j], md[i][j-1]) + 1;
                }
            }
        }
        return md[m][n];
    }
    private static int min3(int a, int b, int c) {
        return Math.min(a, Math.min(b,c));
    }
}
