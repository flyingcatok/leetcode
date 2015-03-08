package leetcode.reverseLinkedList2;

import leetcode.common.ListNode;

/**
 * 
 * @author feiyu
 * @since March 8, 2015
 */
public class Solution {
	public static ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        if(m==n){
            return head;
        }
        // at least 2 nodes in list
        int counter = 1;
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode curr = head;
        
        //node before begin node
        ListNode first = new ListNode(0);
        //node after begin node
        ListNode second= new ListNode(0);;
        //begin node
        ListNode begin= new ListNode(0);;
        //last node
        ListNode last= new ListNode(0);;
        // temp
        ListNode temp;
        
        while(curr != null){
            if(counter < m){
                curr = curr.next;
                prev = prev.next;
                counter++;
            }
            else if(counter == m){
                first = prev;
                begin = curr;
                // advance curr
                curr = curr.next;
                // advance prev
                prev = prev.next;
                counter ++;
            }else if(counter > m && counter <= n){
                if(counter == n){
                    last = curr;
                    first.next = last;
                }
                temp = curr.next;
                curr.next = prev;
                // advance prev
                prev = curr;
                // advance curr
                curr = temp;
                counter ++;
                // link to last half
                second = curr;
                begin.next = second;
            }else{
            	break;
            }
            
        }
        // if m==1
        if(head == begin){
            head = last;
        }
        return head;
    }
}
