package leetcode.palindromeNumber;

/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 * @author feiyu
 * @since January 7, 2015
 *
 */
public class Problem9 {

	public static void main(String[] args) {
		int a = -1;
		System.out.println(Solution.isPalindrome(a));
		int b = 1;
		System.out.println(Solution.isPalindrome(b));
		int c = 22;
		System.out.println(Solution.isPalindrome(c));
		int d = 123;
		System.out.println(Solution.isPalindrome(d));
		int e = 345464543;
		System.out.println(Solution.isPalindrome(e));
	}

}
