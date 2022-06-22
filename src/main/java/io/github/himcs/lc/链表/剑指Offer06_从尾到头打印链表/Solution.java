package io.github.himcs.lc.链表.剑指Offer06_从尾到头打印链表;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public int[] reversePrint(ListNode head) {
        List<Integer> integers = new LinkedList<>();
        while (head != null) {
            integers.add(0, head.val);
            head = head.next;
        }
        return integers.stream().mapToInt(Integer::valueOf).toArray();
    }
}
