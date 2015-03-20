package leetcode.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 排列组合模板
 * ref: nine chapter algorithm class 1
 * @since March 20, 2015
 */
public class Solution {
	 
	public static List<List<Integer>> subsets(int[] S) {
		List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        // specify order so no redundant counts and elements in a subset are in non-descending order
        Arrays.sort(S);
        subsetsHelper(result, path, S, 0);
        return result;
    }
	
	private static void subsetsHelper(List<List<Integer>> result, List<Integer> path, int[] num, int pos){
		// record the current state of path into result
		result.add(new ArrayList<Integer>(path));
		
		for (int i = pos; i<num.length;i++){
			// add current position element to the set
			path.add(num[i]);
			// given the current element in the set, repeat the procedure
			subsetsHelper(result, path, num, i+1);
			// remove last added element
			path.remove(path.size()-1);
		}
	}
	
}
