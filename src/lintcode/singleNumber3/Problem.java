package lintcode.singleNumber3;

/**
 * Given 2*n + 2 numbers, every numbers occurs twice except two, find them.
 * @author feiyu
 * @since Apil 12, 2015
 */
public class Problem {

	public static void main(String[] args) {
		int[] A = new int[]{1,2,2,3,4,4,5,3};
		System.out.println("single number: " + Solution.singleNumber(A));//1,5
	}

}
