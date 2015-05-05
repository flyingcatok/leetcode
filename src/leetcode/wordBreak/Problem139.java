package leetcode.wordBreak;

import java.util.HashSet;
import java.util.Set;

/**
 * Given a string s and a dictionary of words dict, 
 * determine if s can be segmented into a space-separated sequence of one or more dictionary words.
 * For example, given
 * s = "leetcode", dict = ["leet", "code"].
 * Return true because "leetcode" can be segmented as "leet code".
 * @author feiyu
 * @since May 4, 2015
 */
public class Problem139 {

	public static void main(String[] args) {
		String s = "leetcode";
		Set<String> dict = new HashSet<>();
		dict.add("leet");
		dict.add("code");
		System.out.println(Solution.wordBreak(s, dict));
	}

}
