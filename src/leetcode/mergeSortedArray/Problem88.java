package leetcode.mergeSortedArray;

import java.util.Arrays;

/**
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B.
 * The number of elements initialized in A and B are m and n respectively.
 * @author feiyu
 * @since January 5, 2015
 */
public class Problem88 {
	public static void main(String args[]){
		int[] A = new int[11];
		A[0] = -1;
		A[1] = 0;
		A[2] = 0;
		A[3] = 3;
		A[4] = 3;
		A[5] = 3;
		int m = 6;
		System.out.println("Before: "+Arrays.toString(A));
		int[] B = new int[5];
		B[0] = 1;
		B[1] = 2;
		B[2] = 2;
		B[3] = 10;
		B[4] = 50;
		int n =5;
		Solution.merge(A, m, B, n);
		System.out.println("After: "+Arrays.toString(A));
	}
}
