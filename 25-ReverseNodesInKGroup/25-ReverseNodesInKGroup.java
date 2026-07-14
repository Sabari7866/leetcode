// Last updated: 7/14/2026, 1:54:39 PM
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        int length = 0;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        curr = head;
        for (int i = 0; i < length / k; i++) {
            for (int j = 0; j < k - 1; j++) {
                ListNode next = curr.next;
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
            }
            prev = curr;
            curr = curr.next;
        }

        return dummy.next;
    }
}   