package 链表.M0206_回文链表;

import java.util.LinkedList;

public class Solution {
  public boolean isPalindrome(ListNode head) {
    LinkedList<Integer> integers = new LinkedList<>();
    ListNode h = head;
    while (head != null) {
      int hv = head.val;
      integers.push(hv);
      head = head.next;
    }
    while (h != null) {
      if (integers.pop() != h.val) {
        return false;
      }
      h = h.next;
    }

    return true;
  }
}
