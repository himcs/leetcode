package 链表.Q876_链表的中间结点;

class Solution {
  public ListNode middleNode(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    int t = 0;
    while (fast != null) {
      fast = fast.next;
      t++;
      if (t == 2) {
        t = 0;
        slow = slow.next;
      }
    }
    return slow;
  }
}
