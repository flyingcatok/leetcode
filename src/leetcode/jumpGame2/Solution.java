package leetcode.jumpGame2;

/**
 * O(n^2)
 * @author feiyu
 * @since May 3, 2015
 */
public class Solution {
    public static int jump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int[] state = new int[nums.length];
        state[0] = 0;
        for (int i = 1; i< nums.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < i; ++j) {
                if (state[j] != min && nums[j] >= i - j) {
                    min = state[j];
                    break;
                }
            }
            state[i] = min + 1;
        }
        return state[nums.length-1];
    }
}
