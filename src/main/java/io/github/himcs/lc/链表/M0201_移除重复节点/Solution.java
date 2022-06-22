package io.github.himcs.lc.链表.M0201_移除重复节点;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return head;
        }
        Set<Integer> set = new HashSet<>();
        ListNode pre = head;
        ListNode retHead = head;
        set.add(head.val);
        head = head.next;
        while (head != null) {
            if (set.contains(head.val)) {
                pre.next = head.next;
                head = head.next;
            } else {
                set.add(head.val);
                pre = head;
                head = head.next;
            }
        }
        return retHead;
    }
}
