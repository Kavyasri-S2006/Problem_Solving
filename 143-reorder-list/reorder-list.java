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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rev=slow.next;
        ListNode next=null;
        ListNode pre=null;
        while(rev!=null){
           next=rev.next;
           rev.next=pre;
           pre=rev;
           rev=next;
           }
        slow.next=null;
        ListNode t1=head;
        ListNode t2=pre;
        while(t2!=null){
            ListNode n1=t1.next;
            ListNode n2=t2.next;
            t1.next=t2;
            t2.next=n1;
            t1=n1;
            t2=n2;
           }

    }
}