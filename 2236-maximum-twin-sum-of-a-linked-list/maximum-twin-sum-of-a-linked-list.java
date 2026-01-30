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
       ListNode temp=head;
        ListNode fast=head;
        ListNode slow =head;
        while(fast.next  != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp1=slow;
        ListNode prev=null;
        ListNode next=null;
        while(temp1!=null){
            next=temp1.next;
            temp1.next=prev;
            prev=temp1;
            temp1=next;

        }
     
            int max=temp.val+prev.val;
            while(temp!=null){
                int n=temp.val+prev.val;
               if(n>max)max=n;
                temp=temp.next;
                prev=prev.next;
            }
        return max;
    }
}