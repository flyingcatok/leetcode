package lintcode.longestIncreasingSubsequence;

/**
 * DP: lis[i] = length of lis ending with nums[i]
 * @author feiyu
 * @since May 4, 2015
 */
public class Solution {
	public static int longestIncreasingSubsequence(int[] nums) {
        // write your code here
        if(nums == null || nums.length == 0){
            return 0;
        }
        int[] lis = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            lis[i] = 1;
        }
        for(int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (lis[j] + 1> lis[i] && nums[j] <= nums[i]) {
                    lis[i] = lis[j] + 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < lis.length; i++) {
            if (lis[i] > max) {
                max = lis[i];
            }
        }
        return max;
    }
}
