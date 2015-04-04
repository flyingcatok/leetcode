package others.topKFrequentNumberInArray;

/**
 * find top k frequent numbers in an array
 * for Pocket Gems 1st round interview
 * @author feiyu
 * @since April 4, 2015
 */
public class Problem {

	public static void main(String[] args) {
		int[] array = new int[]{1,1,1,1,1,2,2,2,2,2,3,3,3,4,5,4,4,5,6,6,6,6};
		int k = 3;
		int[] result = Solution.findTopKFrequent(array, k);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}

}
