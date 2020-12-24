package 链表.Q141_环形链表;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public boolean hasCycle(ListNode head) {
    Set<ListNode> map = new HashSet<>();
    while (head != null) {
      if (map.contains(head)) {
        return true;
      } else {
        map.add(head);
      }
      head = head.next;
    }
    return false;
  }
}
