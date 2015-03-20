package leetcode.permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author feiyu
 * ref: http://www.ninechapter.com/solutions/permutations/
 * @since March 20, 2015
 */
public class Solution {
	public static List<List<Integer>> permute(int[] num) {
        List<List<Integer>> result = new ArrayList<>();
        if (num == null || num.length == 0) {
            return result; 
        }
        List<Integer> path = new ArrayList<>();

        permuteHelper(result,path,num);
        return result;
    }
	private static void permuteHelper(List<List<Integer>> result, List<Integer> path, int[] num){
		if(path.size() == num.length){
			result.add(new ArrayList<Integer>(path));
			return;
		}
		
		for(int i = 0; i< num.length;i++){
			if(path.contains(num[i])){
				continue;
			}
			path.add(num[i]);
			
			permuteHelper(result,path,num);
			path.remove(path.size()-1);
		}
		
	}
}
