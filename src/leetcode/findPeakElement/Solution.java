package leetcode.findPeakElement;

/**
 * reference: http://www.geeksforgeeks.org/find-a-peak-in-a-given-array/
 * @author feiyu
 * @since March 9, 2015
 */
public class Solution {
    public static int findPeakElement(int[] num) {
        final int N = num.length; 
        int left = 0;
        int right = N-1;
        while(left <=right){
        	int mid = left + (right - left)/2;
        	if((mid==0 || num[mid]>num[mid-1]) && (mid == N-1 || num[mid] > num[mid+1])){
        		return mid;
        	}
        	else if(mid>0 && num[mid-1] > num[mid]){
        		right = mid-1;
        	}else{
        		left = mid+1;// if mid = 0, and num[mid] < num[mid+1], search right half
        	}
        }
        return -1;
    }
}
