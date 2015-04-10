package others.slidingWindowMax;

/**
 * Input : An array of n numbers, and a number k
 * Output : An array of n numbers
 * where output = MAX(input[i], input[i + 1]...... input[i + k - 1])
 * @author feiyu
 * @since April 10, 2015
 */
public class Problem {
	public static void main(String[] args) {
//		int[] array = new int[]{1, 3, 5, 7, 3, 4, 2, 9};
		int[] array = new int[]{12, 1, 78, 90, 57, 89, 56};
		final int k = 2;
		int[] result;
		result = Solution.maxSlidingWindow(array, k);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
}
