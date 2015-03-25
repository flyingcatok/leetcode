package leetcode.searchForARange;

/**
 * search twice for first and last position of target
 * @author feiyu
 * @since March 25, 2015
 */
public class Solution {
	public static int[] searchRange(int[] A, int target) {
        int[] result = new int[2];
        // find the first position of target
        int start = 0;
        int end = A.length-1;
        while(start +1 < end){
        	int mid = start + (end - start)/2;
        	if(target == A[mid]){
        		end = mid;
        	}else if(target > A[mid]){
        		start = mid;
        	}else{
        		end = mid;
        	}
        }
        if(target == A[start]){
        	result[0] = start;
        }else if(target == A[end]){
        	result[0] = end;
        }else{
        	result[0] = -1;
        }
        
        // find the last position of target
        start = 0; 
        end = A.length-1;
        while(start + 1 < end){
        	int mid = start + (end - start)/2;
        	if(target == A[mid]){
        		start = mid;
        	}else if(target > A[mid]){
        		start = mid;
        	}else{
        		end = mid;
        	}
        }
        if(target == A[end]){
        	result[1] = end;
        }else if(target == A[start]){
        	result[1] = start;
        }else{
        	result[1] = -1;
        }
        
        return result;
    }
}
