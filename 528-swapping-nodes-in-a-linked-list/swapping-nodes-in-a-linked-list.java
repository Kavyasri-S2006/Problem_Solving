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
    public ListNode swapNodes(ListNode head, int k) {
       int l=0;
       ListNode temp=head;
       while(temp!=null){
        l++;temp=temp.next;
    }
    ListNode t1=head;
    ListNode t2=head;
    int p=l-k+1;
    int val1=0;
    int val2=0;
    for(int i=1;i<=k;i++){
        if(i==k)val1=t1.val;
        t1=t1.next;
    }
    for(int i=1;i<=p;i++){
        if(i==p)val2=t2.val;
        t2=t2.next;
    }
    ListNode temp1=head;
    for(int i=1;i<=l;i++){
        if(i==k) temp1.val=val2;
        if(i==p)temp1.val=val1;
        temp1=temp1.next;
    }
    return head;
    }
}