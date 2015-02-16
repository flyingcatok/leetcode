package leetcode.twoSums;

import java.util.HashMap;

/**
 * HashTable solution. O(n)
 * @author feiyu
 * @since December 26, 2014
 */
public class Solution2 {
	public static int[] twoSum(int[] numbers, int target){
		int[] resultIndices = new int[2];
		int N = numbers.length;
		// 1st int: number's remainder, 2nd int: indices of number's index
		HashMap<Integer,Integer> remainder = new HashMap<Integer,Integer>();
		for(int i=0; i<N;++i){
			remainder.put(target - numbers[i], i+1);// index start at 1
		}
		
		for(int i=0;i<N;++i){
			resultIndices[0] = i+1;
			if(remainder.containsKey(numbers[i])){
				if(remainder.get(numbers[i])!=i+1){
				    resultIndices[1] = remainder.get(numbers[i]);
				    return resultIndices;
			    }
			}
		}
		// if none found, return -1
		resultIndices[0] = -1;
		resultIndices[1] = -1;
		return resultIndices;
		
	}
}
