package leetcode.singleNumber2;

/**
 * count occurrence of 1s of each bit of an integer
 * @author feiyu
 * @since April 12, 2015
 */
public class Solution {
	public static int singleNumber(int[] A) {
		if (A == null || A.length == 0) {
			return -1;
		}
        int result = 0;
        int[] bits = new int[32];
        for (int i = 0; i < 32; i++) {
        	for (int j = 0; j < A.length; j++) {
        		bits[i] += A[j] >> i & 1; // add ith bit in A[j]
        		bits[i] %= 3; // 1 bit of result
        	}
        	result |= bits[i] << i; // restore result from bits
        }
        return result;
    }

}
