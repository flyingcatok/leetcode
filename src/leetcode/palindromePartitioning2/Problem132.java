package leetcode.palindromePartitioning2;

/**
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * Return the minimum cuts needed for a palindrome partitioning of s.
 * For example, given s = "aab",
 * Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.
 * @author feiyu
 * @since May 4, 2015
 */
public class Problem132 {

	public static void main(String[] args) {
		String s = "aab";
		System.out.println(Solution2.minCut(s));
	}

}
