package lintcode.longestIncreasingSubsequence;

/**
 * Given a sequence of integers, find the longest increasing subsequence (LIS).
 * This subsequence is not necessarily contiguous, or unique.  
 * You code should return the length of the LIS.
 * For [5, 4, 1, 2, 3], the LIS  is [1, 2, 3], return 3
 * For [4, 2, 4, 5, 3, 7], the LIS is [4, 4, 5, 7], return 4
 * @author feiyu
 * @since May 4, 2015
 */
public class Problem {

	public static void main(String[] args) {
		int[] nums = {4,2,4,5,3,7};
		System.out.println(Solution.longestIncreasingSubsequence(nums));
	}

}
