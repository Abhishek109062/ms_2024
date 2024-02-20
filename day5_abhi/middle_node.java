package day5_abhi;

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

//Tortoise-Hare-Approach
//using slow fast method
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode dummy = null;
        
        while(head != null){
            ListNode temp = head.next;
            head.next = dummy;
            dummy  = head;
            head = temp;
        }

        return dummy;
    }
}