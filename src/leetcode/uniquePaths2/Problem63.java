package leetcode.uniquePaths2;

/**
 * Follow up for "Unique Paths":
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * Note: m and n will be at most 100.
 * @author feiyu
 * @since May 5, 2015
 */
public class Problem63 {

	public static void main(String[] args) {
		int m = 10;
		int n = 23;
		int[][] grid = new int[m][n];
		grid[4][5] = 1;
		grid[8][3] = 1;
		grid[9][7] = 1;
		grid[6][15] = 1;
		System.out.println(Solution.uniquePathsWithObstacles(grid));
	}

}
