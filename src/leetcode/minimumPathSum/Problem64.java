package leetcode.minimumPathSum;

/**
 * Given a m x n grid filled with non-negative numbers, 
 * find a path from top left to bottom right which minimizes the sum of all numbers along its path.
 * Note: You can only move either down or right at any point in time.
 * @author feiyu
 * @since May 5, 2015
 */
public class Problem64 {

	public static void main(String[] args) {
		int[][] grid = {{1,0,2,3},{0,2,3,1},{4,5,3,6}};
		System.out.println(Solution.minPathSum(grid));
		System.out.println(Solution2.minPathSum(grid));
	}

}
