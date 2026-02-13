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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        while(temp!=null){
            ListNode min=temp;
            ListNode temp1=temp.next;
            while(temp1!=null){
                if(temp1.val<min.val)min=temp1;
                temp1=temp1.next;
            }
            int swap=min.val;
            min.val=temp.val;
            temp.val=swap;
            temp=temp.next;
        }
        return head;
    }
}