package leetcode.subsets2;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a collection of integers that might contain duplicates, S, return all possible subsets.
 * @author feiyu
 * @since March 20, 2015
 */
public class Problem90 {

	public static void main(String[] args) {
		int[] set = new int[5];
		set[0]=1;
		set[1]=2;
		set[2]=2;
		set[3]=2;
		set[4]=3;
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result = Solution.subsetsWithDup(set);
		System.out.println();
		
	}

}
