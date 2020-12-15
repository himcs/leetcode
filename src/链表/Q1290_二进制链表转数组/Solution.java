package 链表.Q1290_二进制链表转数组;

class Solution {
  public int getDecimalValue(ListNode head) {
    StringBuilder stringBuilder = new StringBuilder();
    while (head != null) {
      stringBuilder.append(head.val);
      head = head.next;
    }

    return Integer.valueOf(stringBuilder.toString(), 2);
  }
}
