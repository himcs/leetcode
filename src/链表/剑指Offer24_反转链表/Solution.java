package 链表.剑指Offer24_反转链表;

class Solution {
  public ListNode reversePrint(ListNode head) {
    ListNode pre = head;
    ListNode cur = null;
    while (pre != null) {
      ListNode temp1 = pre.next;
      pre.next = cur;
      cur = pre;
      pre = temp1;
    }
    return cur;
  }
}
