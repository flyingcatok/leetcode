package leetcode.singleNumber;

/**
 * XOR: a^a = 0, a^0 = a
 * @author feiyu
 * @since April 12, 2015
 */
public class Solution {
    public static int singleNumber(int[] A) {
    	if (A == null || A.length == 0) {
    		return -1;
    	}
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result ^= A[i];
        }
        return result;
    }
}
