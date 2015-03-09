package leetcode.searchInsertPosition;

/**
 * binary search like
 * @author feiyu
 * @since March 9, 2015
 */
public class Solution {
	public static int searchInsert(int[] A, int target) {
        final int N = A.length;
        int left = 0, right=N-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(A[mid] == target){
                return mid;
            }else
            if(A[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        // didn't find element
        // over flow
        if(left > N-1){
            return N;
        }else if(right < 0){
            return 0;
        }
        // always between right(at left) and left(at right)
        return right+1;
    }

}
