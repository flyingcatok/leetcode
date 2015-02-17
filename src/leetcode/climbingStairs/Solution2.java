package leetcode.climbingStairs;

/**
 * Recursion
 * @author feiyu
 * @since February 17, 2015
 */
public class Solution2 {
	public static int climbStairs(int n) {
		if(n==1){
			return 1;
		}
		if(n==2){
			return 2;
		}
		return climbStairs(n-1)+climbStairs(n-2);
	}
}
