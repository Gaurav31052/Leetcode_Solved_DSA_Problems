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
    public ListNode deleteMiddle(ListNode head) {
        int count =0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        if(count==1){
            return head.next;
        }

        ListNode prev = head;
        ListNode temp1 = head;
        int n=count/2;
        
        while(n>0){
            prev =temp1;
            temp1 = temp1.next;
            n--;
        }
        prev.next = temp1.next;
        return head;
        
    }
}