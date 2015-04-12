package leetcode.singleNumber;

/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * @author feiyu
 * @since April 12, 2015
 */
public class Problem136 {

	public static void main(String[] args) {
		int[] A = new int[]{1,1,2,3,3,5,4,5,6,4,2};
		System.out.println("single number: " + Solution.singleNumber(A));
		System.out.println("single number: " + Solution2.singleNumber(A));
	}

}
