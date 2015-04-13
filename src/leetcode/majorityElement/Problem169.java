package leetcode.majorityElement;

/**
 * Given an array of size n, find the majority element. 
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * @author feiyu
 * @since April 13, 2015
 */
public class Problem169 {

	public static void main(String[] args) {
		int[] A = new int[]{3,2,4,1,1,1,1,1,1,5,5};
		System.out.println("majority element: " + Solution.majorityElement(A));
		System.out.println("majority element: " + Solution2.majorityElement(A));
		System.out.println("majority element: " + Solution3.majorityElement(A));
	}

}
