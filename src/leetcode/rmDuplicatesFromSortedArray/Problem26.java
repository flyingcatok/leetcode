package leetcode.rmDuplicatesFromSortedArray;

import java.util.Arrays;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * @author feiyu
 * @since January 1, 2015
 */
public class Problem26 {

	public static void main(String[] args) {
		int[] array = new int[]{1,1,2,3,3,4,4,4,5,6,7,7,7};
		
		System.out.println(Arrays.toString(array));
		System.out.println(Solution.removeDuplicates(array));
		System.out.println(Arrays.toString(array));
	}

}
