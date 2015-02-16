package leetcode.rmDuplicatesFromSortedArray;

/**
 * In place with constant memory.
 * @author feiyu
 * @since January 1, 2015
 */
public class Solution {
	public static int removeDuplicates(int[] A) {
		if(A == null){
			return -1;
		}
		int N = A.length;
		if(N < 2){
			return N;
		}
		// 2 pointers
		int p1 = 0, p2=0;
		while(p2 < N){
			if(A[p1] < A[p2]){
				p1++;
				A[p1] = A[p2];
			}else{
				p2++;
			}
		}
		return p1+1;
        
    }
}
