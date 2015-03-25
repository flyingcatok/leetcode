package leetcode.searchInRotatedSortedArray;

/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array.
 * @author feiyu
 * @since March 25, 2015
 */
public class Problem33 {

	public static void main(String[] args) {
//		int[] A = new int[7];
//		A[0] = 4;
//		A[1] = 5;
//		A[2] = 6;
//		A[3] = 7;
//		A[4] = 0;
//		A[5] = 1;
//		A[6] = 2;
		int[] A=new int[3];
		A[0] = 1;
		A[1] = 3;
		A[2] = 5;
		System.out.println(Solution.search(A, 1));
	}

}
