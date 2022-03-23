package 链表.Q23_合并K个升序链表;


public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode zH = new ListNode();
        ListNode z = zH;
        while (!isAllNull(lists)) {
            //最小值
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] == null) {
                    continue;
                }
                if (lists[i].val < min) {
                    min = lists[i].val;
                    minIndex = i;
                }
            }
            z.next = lists[minIndex];
            lists[minIndex] = lists[minIndex].next;
            z = z.next;
        }
        return zH.next;
    }

    private boolean isAllNull(ListNode[] lists) {
        for (ListNode list : lists) {
            if (list != null) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode la1 = new ListNode(1);
        ListNode la2 = new ListNode(2);
        ListNode la3 = new ListNode(3);
        la1.next = la2;
        la2.next = la3;
        ListNode lb1 = new ListNode(1);
        ListNode lb2 = new ListNode(3);
        ListNode lb3 = new ListNode(4);
        lb1.next = lb2;
        lb2.next = lb3;
        new Solution().mergeKLists(new ListNode[]{la1, lb1});
    }
}
