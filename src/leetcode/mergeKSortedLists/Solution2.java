package leetcode.mergeKSortedLists;

import java.util.List;

import leetcode.common.ListNode;

/**
 * divide and conquer
 * @author feiyu
 * @since April 4, 2015
 */
public class Solution2 {
	public static ListNode mergeKLists(List<ListNode> lists) {
		if (lists == null || lists.size() == 0) {
            return null;
        }
		return helper(lists, 0, lists.size()-1);
	}
	
	private static ListNode helper(List<ListNode> lists, int start, int end) {
		if(start < end){
			int mid = start + (end - start)/2;
			ListNode left = helper(lists, start, mid);
			ListNode right = helper(lists, mid+1, end);
			return merge(left, right);
		} else {
			return lists.get(start);
		}
		
	}
	
	private static ListNode merge(ListNode l1, ListNode l2){
		if(l1 == null){
			return l2;
		}
		if(l2 == null){
			return l1;
		}
		ListNode result = new ListNode(-1);
		ListNode curr = result;
		while(l1 != null && l2 != null) {
			if(l1.val < l2.val){
				curr.next = l1;
				l1 = l1.next;	
			} else {
				curr.next = l2;
				l2 = l2.next;	
			}
			curr = curr.next;	
		}
		if(l1 != null){
			curr.next = l1;
		}
		if(l2 != null){
			curr.next = l2;
		}
		return result.next;
	}
}
