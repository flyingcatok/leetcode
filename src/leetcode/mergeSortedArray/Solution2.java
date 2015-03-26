package leetcode.mergeSortedArray;

/**
 * a better solution: start from the end of A and B, store the larger one at desired location.
 * @author feiyu
 * @since March 26, 2015
 */
public class Solution2 {
	public static void merge(int A[], int m, int B[], int n) {
		int index = m+n;
		while(m >0 && n > 0){
			if(A[m-1] > B[n-1]){
				A[--index] = A[--m];
			} else {
				A[--index] = B[--n];
			}
		}
		while(n >0){
			A[--index] = B[--n];
		}
	}
}
