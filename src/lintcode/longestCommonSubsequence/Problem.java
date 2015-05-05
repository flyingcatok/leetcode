package lintcode.longestCommonSubsequence;

/**
 * Given two strings, find the longest comment subsequence (LCS).
 * Your code should return the length of LCS.
 * For "ABCD" and "EDCA", the LCS is "A" (or D or C), return 1
 * For "ABCD" and "EACB", the LCS is "AC", return 2
 * @author feiyu
 * @since May 5, 2015
 */
public class Problem {

	public static void main(String[] args) {
		String A = "fdjdksleicjd";
		String B = "dkgjslendj";
		
		System.out.println("expect dksled: "+Solution.longestCommonSubsequence(A, B));
	}

}
