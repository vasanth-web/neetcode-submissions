/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node: lists) {
            while (node != null) {
                minHeap.add(node);
                node = node.next;
            }
        }

        ListNode head = new ListNode(-1);
        ListNode current = head;
        while (!minHeap.isEmpty()) {
            current.next = minHeap.poll();
            current = current.next;
        }

        return head.next;
    }
}
