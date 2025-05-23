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
    public ListNode swapPairs(ListNode head) {
    
        // Dummy node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        ListNode current = dummy;
        
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;
            
            // Swap
            first.next = second.next;
            second.next = first;
            current.next = second;
            
            // Aage move karo
            current = first;
        }
        
        return dummy.next;
        
    }
}