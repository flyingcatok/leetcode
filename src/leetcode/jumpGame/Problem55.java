package leetcode.jumpGame;

/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index.
 * A = [2,3,1,1,4], return true.
 * A = [3,2,1,0,4], return false.
 * @author feiyu
 * @since May 2, 2015
 */
public class Problem55 {

	public static void main(String[] args) {
		int[] A = {2,3,1,1,4};
		System.out.println(Solution.canJump(A));
		System.out.println(Solution2.canJump(A));
		int[] B = {3,2,1,0,4};
		System.out.println(Solution.canJump(B));
		System.out.println(Solution2.canJump(B));
		int N = 200000;
		int[] C = new int[N];
		for (int i = 0; i < N; ++i) {
			C[i] = N - i;
		}
		System.out.println(Solution.canJump(C));
		System.out.println(Solution2.canJump(C));
	}

}
