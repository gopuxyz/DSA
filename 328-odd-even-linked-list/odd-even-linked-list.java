class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next == null){
            return head;
        }
        ListNode o = head;
        ListNode e = head.next;
        ListNode evenHead = e;
        while( e!=null && e.next != null){
            o.next = e.next;
            o = o.next;
            e.next = o.next;
            e = e.next;
        }
        o.next = evenHead;
        return head;
      
    }
}