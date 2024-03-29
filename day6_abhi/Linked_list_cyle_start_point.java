package day6_abhi;

class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                ListNode slow2=head;
                while(slow!=slow2){
                    slow=slow.next;
                    slow2=slow2.next;
                }
                return slow;
            }
        }
        return null;
    }
}