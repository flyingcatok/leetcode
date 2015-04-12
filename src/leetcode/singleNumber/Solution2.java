package leetcode.singleNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * hashmap
 * @author feiyu
 * @since April 12, 2015
 */
public class Solution2 {
	public static int singleNumber(int[] A) {
		HashMap<Integer, Integer> hash = new HashMap<>();
		int result = -1;
		for (int i = 0; i < A.length; i++) {
			if (!hash.containsKey(A[i])) {
				hash.put(A[i],1);
			} else {
				hash.put(A[i], hash.get(A[i]) + 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
			if (entry.getValue() == 1) {
				result = entry.getKey();
				break;
			}
		}
		return result;
	}
}
