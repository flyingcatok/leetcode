package leetcode.common;

/**
 * Definition for linked list with ramdom pointer.
 * @author feiyu
 * @since May 6, 2015
 */
public class RandomListNode {
	public int label;
	public RandomListNode next, random;
	public RandomListNode (int x) {
		label = x;
	}
}
