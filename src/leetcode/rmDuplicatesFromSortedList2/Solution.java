package leetcode.rmDuplicatesFromSortedList2;

import leetcode.common.ListNode;

/**
 * 3 pointers
 * @author feiyu
 * @since January 3, 2015
 */
public class Solution {
	public static ListNode deleteDuplicates(ListNode head) {
		if(head ==null){
			return null;
		}
		ListNode p1 = head;
		ListNode p2 = p1.next;
		ListNode prev = null;
		
		while(p2 !=null){
			if(p1.val < p2.val){
				prev = p1;
				p1 = p1.next;
				p2 = p2.next;
			}else{
				while(p2!=null&&p1.val == p2.val){
					p2 = p2.next;
				}
				if(p2!=null){
					if(prev!=null){
						prev.next = p2;
					}else{
						head = p2;// first few are identical
					}
					p1 = p2;
					p2 = p2.next;
				}else{
					if(prev!=null){
						prev.next = null;
						return head;//last few are identical
					}else{
						return null;// all are identical
					}
				}
			}
		}
		return head;
        
    }
}
