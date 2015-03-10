package leetcode.findMinInRotatedSortedArray;

/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * Find the minimum element.
 * You may assume no duplicate exists in the array.
 * @author feiyu
 * @since March 9, 2015
 */
public class Problem153 {

	public static void main(String[] args) {
		int[] array = new int[7];
		array[0] = 4;
		array[1] = 5;
		array[2] = 6;
		array[3] = 7;
		array[4] = 0;
		array[5] = 1;
		array[6] = 2;
		System.out.println("min of array: "+Solution.findMin(array));
		System.out.println("min of array: "+Solution2.findMin(array));
	}

}
