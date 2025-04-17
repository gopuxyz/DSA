class Solution {
    public ListNode reverseList(ListNode head) {
         ListNode curr = head;
         ListNode prev = null;
         ListNode Next = head; // head/null
         while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
         }
         return prev;
        
    }
}