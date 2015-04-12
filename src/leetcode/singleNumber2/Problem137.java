package leetcode.singleNumber2;

/**
 * Given an array of integers, every element appears three times except for one. 
 * Find that single one.
 * @author feiyu
 * @since April 12, 2015
 */
public class Problem137 {

	public static void main(String[] args) {
		int[] A = new int[]{1,1,1,3,3,2,3,4,2,2};
		System.out.println("single number: " + Solution.singleNumber(A));
	}

}
