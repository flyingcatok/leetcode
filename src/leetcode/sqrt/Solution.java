package leetcode.sqrt;

/**
 * ref: http://www.ninechapter.com/solutions/sqrtx/
 * @author feiyu
 * @since March 11, 2015
 */
public class Solution {
    public static int sqrt(int x) {
    	long low = 0;
    	long high = x;// or x/2+1
    	while(low <= high){
    		long mid = low + (high - low)/2;
    		if(mid * mid > x){	// when mid*mid==x, low == high. but after low = mid+1, high = result.
    			high = mid-1;
    		}else{
    			low = mid +1;
    		}
    	}
    	return (int)high;
    }
}
