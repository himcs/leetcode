package io.github.himcs.lc.链表.Q237_删除链表中的节点;

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        if (node.next.next != null)
            node.next = node.next.next;
        else
            node.next = null;
    }
}
