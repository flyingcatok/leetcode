package leetcode.rmElement;

import java.util.Arrays;

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * @author feiyu
 * @since January 2, 2015
 */
public class Problem27 {

	public static void main(String[] args) {
		int[] array = {2};
		System.out.println(Arrays.toString(array));
		System.out.println(Solution.removeElement(array, 3));
		System.out.println(Arrays.toString(array));
	}

}
