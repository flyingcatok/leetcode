package leetcode.sqrt;

/**
 * Implement int sqrt(int x). Compute and return the square root of x.
 * @author feiyu
 * @since March 11, 2015
 */
public class Problem69 {

	public static void main(String[] args) {
		int integer = 4761;
		System.out.println("sqrt(4761) = 69 * " +Solution.sqrt(integer));
		
		integer = 7;
		System.out.println("sqrt(7) >= 2 * " +Solution.sqrt(integer));
	}

}
