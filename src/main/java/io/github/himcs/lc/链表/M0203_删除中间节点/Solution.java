package io.github.himcs.lc.链表.M0203_删除中间节点;

class Solution {
    public void deleteNode(ListNode node) {
//      单向链表a->b->c->d->e->f中的节点c
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
