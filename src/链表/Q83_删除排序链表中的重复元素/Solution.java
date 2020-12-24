package 链表.Q83_删除排序链表中的重复元素;

public class Solution {
  public ListNode deleteDuplicates(ListNode head) {
    ListNode pre = head;
    ListNode fast = head;
    while (fast != null) {
      if (pre.val != fast.val) {
        pre.next = fast;
        pre = fast;
      }
      fast = fast.next;
    }
    if (pre != null && pre.next != null && pre.val == pre.next.val) {
      pre.next = null;
    }
    return head;
  }
}
