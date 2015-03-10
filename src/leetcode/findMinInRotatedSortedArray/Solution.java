package leetcode.findMinInRotatedSortedArray;

/**
 * find max, then find min
 * @author feiyu
 * @since March 9, 2015
 */
public class Solution {
	public static int findMin(int[] num) {
        int N = num.length;
        int left = 0;
        int right = N-1;
        int max = Math.max(num[left], num[right]);
        int max_idx= max == num[left] ? left:right;
        
        if(num[left]<num[right]){
        	return num[left];// not rotated
        }else{// rotated array
        	while(left <= right){
        		int mid = left + (right-left)/2;
        		if(num[mid] >= max){
        			max = num[mid];
        			max_idx = mid;
        			left = mid+1;
        		}else{
        			right = mid-1;
        		}
        	}
        	return num[max_idx+1];
        }
    }
}
