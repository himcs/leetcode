package 链表.Q21_合并两个有序链表;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p = list1;
        ListNode q = list2;
        ListNode z = new ListNode(-1);
        z.next =  new ListNode(-1);
        ListNode zH = z;
        while (p != null && q != null) {
            if (p == null) {
                z.next = q;
                q = q.next;
            } else if (q == null) {
                z.next = p;
                p = p.next;
            } else {
                if (q.val <= p.val) {
                    z.next = q;
                    q = q.next;
                } else {
                    z.next = p;
                    p = p.next;
                }
            }
            z=z.next;
        }
        return zH.next;
    }

    public static void main(String[] args) {
        ListNode la1 = new ListNode(1);
        ListNode la2 = new ListNode(2);
        ListNode la3 = new ListNode(3);
        la1.next=la2;
        la2.next = la3;
        ListNode lb1 = new ListNode(1);
        ListNode lb2 = new ListNode(3);
        ListNode lb3 = new ListNode(4);
        lb1.next=lb2;
        lb2.next = lb3;

        new Solution().mergeTwoLists(la1, la1);
    }
}
