package leetcode.permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a collection of numbers, return all possible permutations.
 * @author feiyu
 * @since March 20, 2015
 */
public class Problem46 {

	public static void main(String[] args) {
		int[] set = new int[3];
		set[0]=1;
		set[1]=2;
		set[2]=3;
		
		List<List<Integer>> result = new ArrayList<>();
		result = Solution.permute(set);
		System.out.println();
	}

}
