package 链表.Q21_合并两个有序链表;

public class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
    ListNode head;
    ListNode start;
    if (l1.val > l2.val) {
      start = head = l2;
      l2 = l2.next;
    } else {
      start = head = l1;
      l1 = l1.next;
    }
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        head.next = l1;
        head = l1;
        l1 = l1.next;
      } else {
        head.next = l2;
        head = l2;
        l2 = l2.next;
      }
    }
    if (l1 != null) {
      head.next = l1;
    } else if (l2 != null) {
      head.next = l2;
    }
    return start;
  }

  public static void main(String[] args) {
    ListNode l1 = new ListNode(2);
    ListNode l2 = new ListNode(1);
    new Solution().mergeTwoLists(l1, l2);
  }
}
