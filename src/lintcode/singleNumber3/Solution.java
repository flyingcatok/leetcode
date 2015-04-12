package lintcode.singleNumber3;

import java.util.ArrayList;
import java.util.List;

/**
 * divide array into 2 sub-arrays, according to a certain non-zero bit in xor result of all integers.
 * @author feiyu
 * @since April 12, 2015
 */
public class Solution {
	public static List<Integer> singleNumber (int[] A){
		List<Integer> result = new ArrayList<>();
		if(A == null || A.length == 0){
			return result;
		}
		int xor = 0;
		for (int i = 0; i < A.length; i++) {
			xor ^= A[i];
		}
		// find where is the last one of non-zero bit of result; the two single numbers have different bit on that position.
		int whereis1 = xor - (xor & (xor - 1)); // or use xor & (-xor)
		int number1 = 0;
		int number2 = 0;
		// divide array into 2 groups, the two single numbers are in each group.
		for (int i = 0; i < A.length; i++) {
			if ((A[i] & whereis1) == whereis1) {
				number1 ^= A[i];
			} else {
				number2 ^= A[i];
			}
		}
		result.add(number1);
		result.add(number2);
		return result;
	}
}
