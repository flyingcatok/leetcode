package lintcode.twoStringsAreAnagrams;

/**
 * Write a method anagram(s,t) to decide if two strings are anagrams or not.
 * @author feiyu
 * @since April 21, 2015
 */
public class Problem {

	public static void main(String[] args) {
		String a = "";
		String b = "";
		System.out.println(Solution.anagram(a, b));
		String s = "abcd";
		String t = "dbac";
		System.out.println(Solution.anagram(s, t));
	}

}
