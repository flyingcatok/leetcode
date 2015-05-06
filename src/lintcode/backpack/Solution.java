package lintcode.backpack;

/**
 * DP. f[i][j] = whether or not we can pick some of first i items to sum up to j.
 * f[i][j] = f[i-1][j-A[i]] (pick ith item) || f[i-1][j] (don't pick ith item). 
 * @author feiyu
 * @since May 6, 2015
 */
public class Solution {
    public static int backPack(int m, int[] A) {
        // write your code here
        if(m == 0){
            return 0;
        }
        if(A == null || A.length == 0){
            return 0;
        }
        boolean[][] f = new boolean[A.length + 1][m + 1];
        for(int i = 0; i < A.length + 1; i++) {
            f[i][0] = true;
        }
        for(int i = 1; i < A.length + 1; i++) {
            for(int j = 1; j < m + 1; j++) {
                if(j >= A[i-1]) {
                    f[i][j] = f[i-1][j-A[i-1]] || f[i-1][j];
                } else {
                    f[i][j] = f[i-1][j];
                }
            }
        }
        for(int i = m; i >=0; i--) {
            if(f[A.length][i]) {
                return i;
            }
        }
        return 0;
    }
}
