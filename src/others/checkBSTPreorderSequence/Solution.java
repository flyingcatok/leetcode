package others.checkBSTPreorderSequence;

/**
 * 
 * ref: http://www.mitbbs.com/article_t/JobHunting/32964191.html
 * @since May 9, 2015
 */
public class Solution {
	public static boolean check(int[] nodes) {
	    return check(nodes, 0, nodes.length, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private static boolean check(int[] nodes, int start, int end, int min, int 
	max) {
	    if (start >= end) return true;
	    int root = nodes[start];
	    if (root <= min || max <= root)
	        return false;
	    int i = start + 1;
	    while (i < end && nodes[i] < root)
	        i++;
	    return check(nodes, start+1, i, min, root) &&
	           check(nodes, i, end, root, max);
	}
}
