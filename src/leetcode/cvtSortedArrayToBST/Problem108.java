package leetcode.cvtSortedArrayToBST;

import leetcode.common.TreeNode;

/**
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 * @author feiyu
 * @since March 18, 2015
 */
public class Problem108 {

	public static void main(String[] args) {
		final int N = 5;
		int[] array = new int[N];
		for(int i=0; i<N;i++){
			array[i] = i;
		}
		TreeNode root;
		root = Solution.sortedArrayToBST(array);
		System.out.println();
	}

}
