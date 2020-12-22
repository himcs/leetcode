package 链表.剑指Offer52_两个链表的第一个公共节点;

public class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode p = headA;
    ListNode q = headB;
    while (p != q) {
      if (p.next != null) {
        p = p.next;
      } else {
        p = headB;
      }

      if (q.next != null) {
        q = q.next;
      } else {
        q = headA;
      }
    }
    return p;
  }
}
