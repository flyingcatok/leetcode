package leetcode.uniquePaths;

/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time. 
 * The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * How many possible unique paths are there?
 * @author feiyu
 * @since May 5, 2015
 */
public class Problem62 {

	public static void main(String[] args) {
		int m = 10;
		int n = 23;
		System.out.println(Solution.uniquePaths(m, n));
	}

}
