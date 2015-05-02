package leetcode.jumpGame;

/**
 * O(n^2)
 * @author feiyu
 * @since May 2, 2015
 */
public class Solution {
    public static boolean canJump(int[] nums) {
        boolean[] res = new boolean[nums.length];
        res[0] = true;
        for (int i = 1; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (res[j] && nums[j] >= i - j) {
                    res[i] = true;
                    break;
                }
            }
        }
        return res[nums.length - 1];
    }
}
