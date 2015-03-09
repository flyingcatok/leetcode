package leetcode.searchInsertPosition;

/**
 * Given a sorted array and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * @author feiyu
 * @since March 9, 2015
 */
public class Problem35 {

	public static void main(String[] args) {
		int[] array = new int[4];
		array[0] = 1;
		array[1] = 3;
		array[2] = 5;
		array[3] = 6;
		System.out.println("5: "+Solution.searchInsert(array, 5));
		System.out.println("2: "+Solution.searchInsert(array, 2));
		System.out.println("7: "+Solution.searchInsert(array, 7));
		System.out.println("0: "+Solution.searchInsert(array, 0));
	}

}
