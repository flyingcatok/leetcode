package leetcode.majorityElement;

import java.util.HashMap;
import java.util.Map;

/**
 * hashmap
 * Time: O(n), space: O(n)
 * @author feiyu
 * @since April 13, 2015
 */
public class Solution {
    public static int majorityElement(int[] num) {
    	final int N = num.length;
        Map<Integer,Integer> hash = new HashMap<>();
        // O(n)
        for (int i = 0; i < N; i++) {
            if (!hash.containsKey(num[i])) {
                hash.put (num[i], 1);
            } else {
                hash.put (num[i], hash.get(num[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: hash.entrySet()) {
            if (entry.getValue() > Math.floor(N / 2.0)) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
