package leetcode.searchInsertPosition;

/**
 * use template from nine chapter
 * @author feiyu
 * @since March 25, 2015
 */
public class Solution2 {
	public static int searchInsert(int[] A, int target) {
        int start = 0;
        int end = A.length - 1;
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            if(target == A[mid]){
                return mid;
            }else if(target > A[mid]){
                start = mid;
            }else{
                end = mid;
            }
        }
        
        if(target <= A[start]){
            return start;
        }else if(target <= A[end]){
            return end;
        }else{
            return end+1;
        }
    
    }
}
