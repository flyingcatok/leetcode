package leetcode.jumpGame;

/**
 * O(n)
 * @since May 2, 2015
 * ref: http://fisherlei.blogspot.com/2012/12/leetcode-jump-game.html
 */
public class Solution2 {
	public static boolean canJump(int[] nums) {
		int maxCover = 0;// max cover range start from index 0
		for (int i = 0; i <= maxCover && i < nums.length; ++i) {
			if (nums[i] + i > maxCover) {
				maxCover = nums[i] + i;
			}
			if (maxCover >= nums.length - 1) {
				return true;
			}
		}
		return false;
	}
}
