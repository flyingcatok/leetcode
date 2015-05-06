package lintcode.longestCommonSubstring;

/**
 * Given two strings, find the longest common substring. Return the length of it.
 * The characters in substring should occur continuously in original string. This is different with subsequence.
 * @author feiyu
 * @since May 5, 2015
 */
public class Problem {

	public static void main(String[] args) {
		String A = "abcdefg";
		String B = "efhnhdk";
		System.out.println(Solution.longestCommonSubstring(A, B));
	}

}
