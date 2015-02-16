package leetcode.rmDuplicatesFromSortedList;
import leetcode.common.ListNode;
/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * @author feiyu
 * @since January 2, 2015
 */
public class Problem83 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(2);
		l1.next.next.next = new ListNode(3);
		l1.next.next.next.next = new ListNode(3);
//		ListNode l1 = null;
		System.out.println(l1);
		System.out.println(Solution.deleteDuplicates(l1));
	}

}
