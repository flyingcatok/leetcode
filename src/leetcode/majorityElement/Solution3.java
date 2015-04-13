package leetcode.majorityElement;

/**
 * Moore voting algorithm
 * @author feiyu
 * @since April 13, 2015
 */
public class Solution3 {
	public static int majorityElement(int[] num) {
		int candidate = -1;
		int counter = 0;
		for (int i = 0; i < num.length; i++) {
			if (counter == 0) {
				candidate = num[i];
				counter = 1;
			} else {
				if (candidate == num[i]) {
					counter++;
				} else {
					counter--;
				}
			}
		}
		if (isMajority(num,candidate)) {
			return candidate;	
		}
		return -1;
	}
	
	private static boolean isMajority (int[] num, int candidate) {
		int count = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] == candidate) {
				count++;
			}
		}
		return count > num.length/2;
	}
}
