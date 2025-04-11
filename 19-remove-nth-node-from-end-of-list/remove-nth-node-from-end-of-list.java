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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        //  move fast n steps ahead
        for(int i = 1; i<=n; i++){
            fast = fast.next;
        }
        if(fast==null){ // n==len
         // I Have to delete the head
         return head.next;

        }
        //move slow and fast together until fast reaches tail
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
         
        
    }
}