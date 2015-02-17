package leetcode.climbingStairs;

import java.util.HashMap;
import java.util.Map;

/**
 * DP.
 * @author feiyu
 * @since February 17, 2015
 */
public class Solution {
	public static int climbStairs(int n) {
		if(n == 1){
			return 1;
		}
		if(n == 2){
			return 2;
		}
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		for(int i = 3; i<=n;i++){
			int temp = map.get(i-1) + map.get(i-2);
			map.put(i, temp);
		}
		return map.get(n);
	}
}
