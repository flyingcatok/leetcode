package leetcode.searchForARange;

/**
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * @author feiyu
 * @since March 25, 2015
 */
public class Problem34 {

	public static void main(String[] args) {
		int[] array = new int[6];
		array[0] = 5;
		array[1] = 7;
		array[2] = 7;
		array[3] = 8;
		array[4] = 8;
		array[5] = 10;
		int[] result;
		result = Solution.searchRange(array, 7);
		System.out.println();
	}

}
