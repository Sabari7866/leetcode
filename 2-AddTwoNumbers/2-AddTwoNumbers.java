// Last updated: 7/14/2026, 1:55:19 PM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy head to simplify edge cases (e.g., empty list or single node)
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        // Loop until both lists are exhausted AND no carry remains
        while (l1 != null || l2 != null || carry != 0) {
            // Get values from current nodes (0 if node is null)
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            
            // Calculate sum and new carry
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            
            // Create new node with the digit at the current place
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            // Move to next nodes if available
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        return dummyHead.next;
    }
}   