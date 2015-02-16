package leetcode.pascalTriangle;

import java.util.List;


/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 * @author feiyu
 * @since January 6, 2015
 */
public class Problem118 {
	public static void main(String args[]){
		List<List<Integer>> pascal = Solution.generate(8);
		System.out.println(pascal.toString());
	}
}
