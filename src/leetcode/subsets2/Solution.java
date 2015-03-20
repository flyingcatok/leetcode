package leetcode.subsets2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * ref: nine chapter algorithm class 1
 * @since March 20, 2015
 */
public class Solution {
	public static List<List<Integer>> subsetsWithDup(int[] num) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        Arrays.sort(num);
        subsetsHelper(result, path, num, 0);
        return result;
    }
	
	private static void subsetsHelper(List<List<Integer>> result, List<Integer> path, int[] num, int pos){
		result.add(new ArrayList<Integer> (path));
		for(int i = pos; i < num.length;i++){
			// staring from second element (i>0), if an element is already added, skip
			// (first possible duplicate might be added at pos, so i!=pos; num[i] == num[i-1] ensures equality)
			if(i > 0 && i != pos && num[i] == num[i-1]){
				continue;
			}
			// rest is the same as template
			path.add(num[i]);
			subsetsHelper(result, path, num, i+1);
			path.remove(path.size()-1);
		}
	}
}
