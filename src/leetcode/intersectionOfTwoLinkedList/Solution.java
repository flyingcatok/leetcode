package leetcode.intersectionOfTwoLinkedList;
import leetcode.common.ListNode;

public class Solution {
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null){
			return null;
		}
		
		int N1=0,N2=0;
		ListNode p1 = headA, p2 = headB;
		while(p1 != null && p2 != null){
			N1++;
			N2++;
			p1 = p1.next;
			p2 = p2.next;
		}
		while(p2 != null){
			N2++;
			p2 = p2.next;
		}
		while(p1 != null){
			N1++;
			p1 = p1.next;
		}
		
		// reset pointer
		p1 = headA;
		p2 = headB;
		// move pointer of longer list forward by differece
		if(N1 >= N2){
			while(N1 > N2){
				p1 = p1.next;
				N1--;
			}
		}else{
			while(N2 > N1){
				p2 = p2.next;
				N2--;
			}
		}
		while(p1 != null && p2 != null){
			if(p1.val == p2.val){
				return p1;
			}else{
				p1 = p1.next;
				p2 = p2.next;
			}
		}
		// if nothing match, return null: no intersection
        return null;
    }

}
