package leetcode.searchInRotatedSortedArray;

/**
 * 判断(start, mid)区间是否单调增
 * @author feiyu
 * @since March 25, 2015
 */
public class Solution {
	public static int search(int[] A, int target) {
        int start = 0;
        int end = A.length - 1;
        
        while(start + 1 < end){
        	int mid = start + (end - start)/2;
        	if(A[mid] == target){
        		return mid;
        	}
        	// mid in left line segment or right line segment
        	if(A[start] < A[mid]){
        		if(target >=A[start] && target < A[mid]){
        			end = mid;
        		} else {
        			start = mid;
        		}
        		
        	} else{ // 非单调升
        		if(target >= A[mid] && target < A[start]){
        			start = mid;
        		}else{
        			end = mid;
        		}
        	}
        	
        	
        }
        
        if(A[start] == target){
        	return start;
        }
        if(A[end] == target){
        	return end;
        }
        return -1;
    }
}
