package leetcode.majorityElement;

import java.util.Arrays;

/**
 * after sorting, the middle element must be majority element.
 * Time: O(nlogn)
 * @author feiyu
 * @since April 13, 2015
 */
public class Solution2 {
	public static int majorityElement(int[] num) {
		Arrays.sort(num);
		return num[num.length/2];
	}
}
