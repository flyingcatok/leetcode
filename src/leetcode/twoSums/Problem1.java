package leetcode.twoSums;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * 
 * @author feiyu
 * @since December 26, 2014
 */
public class Problem1 {
	public static void main(String args[]){
		int[] numbers = new int[4];
		numbers[0]=20;
		numbers[1]=11;
		numbers[2]=-2;
		numbers[3]=15;
		int target = 9;
//		int[] indices = Solution.twoSum(numbers, target);
		int[] indices = Solution2.twoSum(numbers, target);
		System.out.println("index1=" + indices[0]+"\nindex2="+indices[1]);
	}
}
