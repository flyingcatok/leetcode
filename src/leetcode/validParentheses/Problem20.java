package leetcode.validParentheses;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * @author feiyu
 * @since January 4, 2015
 */
public class Problem20 {

	public static void main(String[] args) {
		String pa= "{[()]}";
		System.out.println(Solution.isValid(pa));
		String pa1 = "{[]()}";
		System.out.println(Solution.isValid(pa1));
		String pa2 = "{]}[)(";
		System.out.println(Solution.isValid(pa2));
		String pa3 = "([)]";
		System.out.println(Solution.isValid(pa3));
		String pa4 = "([]";
		System.out.println(Solution.isValid(pa4));
		String pa5 = "]";
		System.out.println(Solution.isValid(pa5));
	}

}
