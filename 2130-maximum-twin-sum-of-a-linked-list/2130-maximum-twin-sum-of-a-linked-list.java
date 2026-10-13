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
    public int pairSum(ListNode head) {
        
        int count =1;
        ListNode temp =head;

        while(temp.next!= null){
            count++;
            temp = temp.next;
        }

        int mid = count/2;
        temp =head;
        ListNode firsthalf = head;
        ListNode prev = temp;
        
        while(mid!=0){
            prev = temp;
            temp =temp.next;
            mid--;
        }
        prev.next =null;
        prev = temp;
        temp =temp.next;
        prev.next =null;

        while(temp!=null){
            ListNode temp1 = temp.next;
             temp.next =prev;
             prev =temp; 
            temp = temp1;
        }
        ListNode secondhalf = prev;
        int maxsum=0;

        while(firsthalf !=null){
            maxsum = Math.max(firsthalf.val+secondhalf.val, maxsum);
            firsthalf = firsthalf.next;
            secondhalf = secondhalf.next;
        }
        return maxsum;
    }
}