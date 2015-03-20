package leetcode.strStr;

/**
 * Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * @author feiyu
 * @since March 20, 2015
 */
public class Problem28 {

	public static void main(String[] args) {
		String haystack = "missisippi";
		String needle = "isip";
		System.out.println(Solution.strStr(haystack, needle));
	}

}
