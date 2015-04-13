package leetcode.majorityElement;

/**
 * 
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
