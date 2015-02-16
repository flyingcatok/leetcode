package leetcode.twoSums;

/**
 * O(n^2) solution
 * @author feiyu
 * @since December 26, 2014
 */
public class Solution {
	public static int[] twoSum(int[] numbers, int target){
		int N = numbers.length;
		int[] resultIndices = new int[2];
		// O(n^2) solution
		for(int i=0;i<N;++i){
			resultIndices[0] = i+1;
			for (int j=i+1;j<N ;++j ) {
				resultIndices[1] = j+1;
				if(numbers[j] == target - numbers[i]){
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
