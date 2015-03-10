package leetcode.findPeakElement;

/**
 * A peak element is an element that is greater than its neighbors.
 * Given an input array where num[i] ≠ num[i+1], find a peak element and return its index.
 * The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.
 * You may imagine that num[-1] = num[n] = -∞.
 * For example, in array [1, 2, 3, 1], 3 is a peak element and your function should return the index number 2.
 * 
 * @author feiyu
 * @since March 9, 2015
 */
public class Problem162 {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[0]=1;
		array[1]=4;
		array[2]=3;
		array[3]=2;
		array[4]=1;
		System.out.println(Solution.findPeakElement(array));
	}

}
