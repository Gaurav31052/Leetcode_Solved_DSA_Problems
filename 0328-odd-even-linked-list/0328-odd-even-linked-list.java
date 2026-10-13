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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next ==null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode odd1 = head;
        ListNode even1 = head.next;

        while(odd1.next != null && even1.next !=null){
            odd1.next = even1.next;
            odd1 = odd1.next;
            even1.next = odd1.next;
            even1 = even1.next;
        }
        odd1.next = even;

        return odd;

        
    }
}