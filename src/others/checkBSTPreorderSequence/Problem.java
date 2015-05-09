package others.checkBSTPreorderSequence;

/**
 * Check if a sequence is a valid preorder traversal of a BST
 * @author feiyu
 * @since May 9, 2015
 */
public class Problem {

	public static void main(String[] args) {
		int[] nodes = {1,2,3};
		System.out.println("expect true: "+Solution.check(nodes));
		int[] nodes2 = {3,2,1,5,4,6};
		System.out.println("expect true: "+Solution.check(nodes2));
		int[] nodes3 = {3,4,5,1,2};
		System.out.println("expect false: "+Solution.check(nodes3));
	}

}
