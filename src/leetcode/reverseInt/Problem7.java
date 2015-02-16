package leetcode.reverseInt;

/**
 * Reverse digits of an integer
 * @author feiyu
 * @since January 1, 2015
 */
public class Problem7 {

	public static void main(String[] args) {
//		System.out.println(Integer.MIN_VALUE-1);
		System.out.println("0: "+Solution.reverse(0));
		System.out.println("100: "+Solution.reverse(100));
		System.out.println("123: "+Solution.reverse(123));
		System.out.println("-123: "+Solution.reverse(-123));
		System.out.println("1000000003: "+Solution.reverse(1000000003));
	}

}
