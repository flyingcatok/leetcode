package leetcode.copyListWithRandomPointer;

import java.util.HashMap;

import leetcode.common.RandomListNode;

/**
 * two passes. use hashmap to store map relationship. one pass to create node, the other pass to link nodes.
 * @author feiyu
 * @since May 6, 2015
 */
public class Solution {
    public static RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }
        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode curr = head;
        while (curr != null) {
            map.put(curr, new RandomListNode(curr.label));
            curr = curr.next;
        }
        curr = head;
        while(curr != null) {
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
}
