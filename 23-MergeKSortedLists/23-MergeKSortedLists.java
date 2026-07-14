// Last updated: 7/14/2026, 1:54:40 PM
import java.util.PriorityQueue;
import java.util.Comparator;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        // Min-Heap to store nodes, ordered by their value
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));

        // Add the head of each non-null list to the heap
        for (ListNode list : lists) {
            if (list != null) {
                minHeap.offer(list);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Process nodes until heap is empty
        while (!minHeap.isEmpty()) {
            // Get the smallest node
            ListNode minNode = minHeap.poll();
            
            // Append to result list
            current.next = minNode;
            current = current.next;

            // If the extracted node has a next node, add it to the heap
            if (minNode.next != null) {
                minHeap.offer(minNode.next);
            }
        }

        return dummy.next;
    }
}   