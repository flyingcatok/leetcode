package lintcode.backpack2;

/**
 * Given n items with size A[i] and value V[i], and a backpack with size m. 
 * What's the maximum value can you put into the backpack?
 * Given 4 items with size [2, 3, 5, 7] and value [1, 5, 2, 4], and a backpack with size 10. The maximum value is 9.
 * @author feiyu
 * @since May 6, 2015
 */
public class Problem {

	public static void main(String[] args) {
		int m = 10;
		int[] A = {2,3,5,7};
		int[] V = {1,5,2,4};
		System.out.println(Solution.backPackII(m, A, V));
	}

}
