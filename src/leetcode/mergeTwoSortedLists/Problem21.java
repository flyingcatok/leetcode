package leetcode.mergeTwoSortedLists;
import leetcode.common.ListNode;

/**
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 * 
 * @author feiyu
 * @since December 31, 2014
 */
public class Problem21 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(5);
		l1.next.next = new ListNode(10);
		System.out.println(l1);
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(12);
		System.out.println(l2);
		System.out.println(Solution.mergeTwoLists(l1, l2));
		
	}

}
