package leetcode.uniquePaths2;

/**
 * DP
 * @author feiyu
 * @since May 5
 */
public class Solution {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1) {
            return 0;
        }
        int[][] sum = new int[m][n];
        sum[0][0] = 1;
        for(int i = 1; i < m; i++){
            if(sum[i-1][0] == 0) {
                sum[i][0] = 0;
                continue;
            }
            sum[i][0] = obstacleGrid[i][0] == 1 ? 0:1;
        }
        for(int i = 1; i < n; i++) {
            if(sum[0][i-1] == 0) {
                sum[0][i] = 0;
                continue;
            }
            sum[0][i] = obstacleGrid[0][i] == 1 ? 0:1;
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(obstacleGrid[i-1][j] == 0){
                    sum[i][j] += sum[i-1][j];
                }
                if(obstacleGrid[i][j-1] == 0) {
                    sum[i][j] += sum[i][j-1];
                }
            }
        }
        return sum[m-1][n-1];
    }
}
