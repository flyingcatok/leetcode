package leetcode.subsets;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of distinct integers, S, return all possible subsets.
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * @author feiyu
 * @since March 20, 2015
 */
public class Problem78 {

	public static void main(String[] args) {
		final int N = 3;
		int[] set = new int[N];
		for(int i=0; i<N;i++){
			set[i]=i;
		}
		List<List<Integer>> result = new ArrayList<>();
		result = Solution.subsets(set);
		System.out.println();
	}

}
