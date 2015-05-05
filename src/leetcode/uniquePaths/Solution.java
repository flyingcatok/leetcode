package leetcode.uniquePaths;

/**
 * DP. sum[i][j]: # of unique paths from[0][0] to [i][j].
 * @author feiyu
 * @since May 5, 2015
 */
public class Solution {
    public static int uniquePaths(int m, int n) {
        if (m <=0 || n <= 0){
            return 0;
        }
        int[][] sum = new int[m][n];
        sum[0][0] = 1;
        for(int i = 0; i < m; i++){
            sum[i][0] = 1;
        }
        for(int i = 0; i < n; i++){
            sum[0][i] = 1;
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                sum[i][j] = sum[i-1][j]+sum[i][j-1];
            }
        }
        return sum[m-1][n-1];
    }
}
