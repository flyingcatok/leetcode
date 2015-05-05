package leetcode.minimumPathSum;

import java.util.Arrays;

/**
 * DP. O(n) space.
 * @author feiyu
 * @since May 5, 2015
 */
public class Solution2 {
	public static int minPathSum(int[][] grid) {
		if(grid == null){
			return 0;
		}
        int[] sum = new int[grid[0].length];
        Arrays.fill(sum, Integer.MAX_VALUE);
        sum[0] = 0;
        for(int i = 0; i < grid.length;i++){
        	sum[0] = sum[0] + grid[i][0];
        	for(int j = 1; j < grid[0].length;j++){
        		sum[j] = Math.min(sum[j], sum[j-1]) + grid[i][j];
        	}
        }
        return sum[grid[0].length-1];
	}
}
