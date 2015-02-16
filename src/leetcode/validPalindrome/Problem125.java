package leetcode.validPalindrome;

/**
 * Given a string, determine if it is a palindrome, 
 * considering only alphanumeric characters and ignoring cases.
 * @author feiyu
 * @since February 15, 2015 
 */
public class Problem125 {

	public static void main(String[] args) {
		String s1 = "A man, a plan, a canal: Panama";
		System.out.println("expected true: "+Solution.isPalindrome(s1));
		String s2 = "race a car";
		System.out.println("expected false: "+Solution.isPalindrome(s2));
	}

}
