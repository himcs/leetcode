package io.github.himcs.lc.链表.Q203_移除链表元素;

public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // 头
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode r = head;
        ListNode pre = head;
        if (head != null) {
            head = head.next;
        }
        while (head != null) {
            if (head.val != val) {
                pre.next = head;
                pre = head;
            }
            head = head.next;
        }
        // 尾结点
        if (pre != null && pre.next != null && pre.next.val == val) {
            pre.next = null;
        }
        return r;
    }
}
