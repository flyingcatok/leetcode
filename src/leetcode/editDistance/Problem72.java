package leetcode.editDistance;

/**
 * Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. (each operation is counted as 1 step.)
 * You have the following 3 operations permitted on a word:
 * a) Insert a character
 * b) Delete a character
 * c) Replace a character
 * @author feiyu
 * @since May 5, 2015
 */
public class Problem72 {

	public static void main(String[] args) {
		String word1 = "acde";
		String word2 = "abcd";
		System.out.println(Solution.minDistance(word1, word2));
	}

}
