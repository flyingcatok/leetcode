package leetcode.minimumPathSum;

/**
 * DP. O(n^2) space.
 * @author feiyu
 * @since May 5, 2015
 */
public class Solution {
    public static int minPathSum(int[][] grid) {
        if(grid == null) {
            return 0;
        }
        int m = grid.length;
        int n = grid[0].length;
        int[][] sum = new int[m][n];
        sum[0][0] = grid[0][0];
        for(int i = 1; i < m; i++){
            sum[i][0] = sum[i-1][0] + grid[i][0];
        }
        for(int i = 1; i < n; ++i) {
            sum[0][i] = sum[0][i-1] + grid[0][i];
        }
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                sum[i][j] = Math.min(sum[i-1][j], sum[i][j-1]) + grid[i][j];
            }
        }
        return sum[m-1][n-1];
    }
}