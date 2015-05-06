package lintcode.backpack;

/**
 * Given n items with size A[i], an integer m denotes the size of a backpack. How full you can fill this backpack? 
 * If we have 4 items with size [2, 3, 5, 7], 
 * the backpack size is 11, we can select 2, 3 and 5, 
 * so that the max size we can fill this backpack is 10. If the backpack size is 12. 
 * we can select [2, 3, 7] so that we can fulfill the backpack.
 * You function should return the max size we can fill in the given backpack.
 * @author feiyu
 * @since May 6, 2015
 */
public class Problem {

	public static void main(String[] args) {
		int m = 10;
		int[] A = {3,4,8,5};
		System.out.println(Solution.backPack(m, A));
	}

}
