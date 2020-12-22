package 链表.剑指Offer18_删除链表的节点;

class Solution {
  public ListNode deleteNode(ListNode head, int val) {
    if (head.val == val) {
      return head.next;
    }
    ListNode h = head;
    ListNode prev = head;
    head = head.next;
    while (head != null) {
      if (val == head.val) {
        prev.next = head.next;
      } else {
        prev = head;
      }
      head = head.next;
    }
    return h;
  }
}
