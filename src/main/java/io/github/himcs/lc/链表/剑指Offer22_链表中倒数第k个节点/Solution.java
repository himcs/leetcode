package io.github.himcs.lc.链表.剑指Offer22_链表中倒数第k个节点;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        Map<Integer, ListNode> map = new HashMap<>();
        int last = 0;
        while (head != null) {
            map.put(++last, head);
            head = head.next;
        }

        return map.get(last - k + 1);
    }
}
