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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode();
        //Initially dummy is empty or you can say it is null
        //we need another pointer reference for dummy variable
        ListNode dd=dummy;
        
        while(l1!=null && l2!=null){
            if(l1.val<l2.val)
            {
                dd.next=new ListNode(l1.val);
                l1=l1.next;
            }else{
                dd.next=new ListNode(l2.val);
                l2=l2.next;
            }
            dd=dd.next;
        }
        
        while(l1!=null){
            dd.next=new ListNode(l1.val);
            l1=l1.next;
            dd=dd.next;
        }
        while(l2!=null){
            dd.next=new ListNode(l2.val);
            l2=l2.next;
            dd=dd.next;
        }
        return dummy.next;
        
        
    }
}