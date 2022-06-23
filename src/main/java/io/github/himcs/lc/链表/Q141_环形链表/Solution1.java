package io.github.himcs.lc.链表.Q141_环形链表;

public class Solution1 {
    // 「Floyd 判圈算法」（又称龟兔赛跑算法）
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
