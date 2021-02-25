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
 //Sol 1. Recursion
class Solution { 
    public ListNode swapPairs(ListNode head) {
        
        if (head == null || head.next == null) 
            return head;
        
        ListNode first = head;
        ListNode sec = head.next;
        first.next = swapPairs(sec.next);
        sec.next = first;
        
        return sec;
    }
}

 //Sol 2. Iteration
 class Solution {
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        
        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode sec = head.next;
            
            //swap
            prev.next = sec;
            first.next = sec.next;
            sec.next = first;
            
            prev = first;
            head = first.next;
        }
        
        return dummy.next;
    }
}
