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
    
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        // create a deep copy
        ListNode newHead = new ListNode(head.val);
        ListNode t1 = head.next;
        ListNode t2 = newHead;
        while(t1!=null){
            ListNode temp = new ListNode(t1.val);
            t2.next= temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        newHead = reverseList(newHead);
        t1 = head;
        t2 = newHead;
        while(t1!=null){
            if(t1.val!=t2.val) return false;
            t2 = t2.next;
            t1 = t1.next;
        }
        return true;
    }
}