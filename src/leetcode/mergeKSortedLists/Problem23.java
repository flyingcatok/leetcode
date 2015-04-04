package leetcode.mergeKSortedLists;

import java.util.ArrayList;
import java.util.List;

import leetcode.common.ListNode;

/**
 * Merge k sorted linked lists and return it as one sorted list. 
 * Analyze and describe its complexity. O(nklogk)
 * @author feiyu
 * @since April 4, 2015
 */
public class Problem23 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		l1.next.next = new ListNode(9);
		
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(6);
		l2.next.next = new ListNode(12);
		
		ListNode l3 = new ListNode(4);
		l3.next = new ListNode(5);
		l3.next.next = new ListNode(8);
		l3.next.next = new ListNode(20);
		
		ListNode l4 = null;
		
		List<ListNode> lists = new ArrayList<>();
		lists.add(l1);lists.add(l2);lists.add(l3);lists.add(l4);
		
		
//		System.out.println(Solution.mergeKLists(lists));
		System.out.println(Solution2.mergeKLists(lists));
	}

}
