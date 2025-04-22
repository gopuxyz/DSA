
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        for(int i = 1; i<k; i++){
            curr = curr.next;
        }
        ListNode fast = curr;
        ListNode slow = head;


        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }

        int temp = curr.val;
        curr.val = slow.val;
        slow.val = temp;

         return head;
        
    }
    
}