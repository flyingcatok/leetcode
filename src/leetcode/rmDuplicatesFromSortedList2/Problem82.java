package leetcode.rmDuplicatesFromSortedList2;
import leetcode.common.ListNode;
/**
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 * @author feiyu
 * @since January 2, 2015
 */
public class Problem82 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(1);
		l1.next.next = new ListNode(2);
		l1.next.next.next = new ListNode(3);
		l1.next.next.next.next = new ListNode(3);
		System.out.println(l1);
		System.out.println(Solution.deleteDuplicates(l1));
	}

}
