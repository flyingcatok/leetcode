package leetcode.anagrams;

/**
 * Given an array of strings, return all groups of strings that are anagrams.
 * Note: All inputs will be in lower-case.
 * @author feiyu
 * @since January 7, 2015
 */
public class Problem49 {

	public static void main(String[] args) {
		String[] strs = new String[]{"abc", "cba", "abbb","bde","lijh"};
		System.out.println(Solution.anagrams(strs));
	}

}
