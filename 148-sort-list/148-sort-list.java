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
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return head ;
            
        }
        
         ListNode prev = head ;
         ListNode slow = head ;
         ListNode fast = head ;
        
        while(fast!=null && fast.next!=null)
        {
            
           prev = slow ;
            slow = slow.next ;
            fast=fast.next.next ;
        }
        
        prev.next=null ;
        
        ListNode left = sortList(head);
        
        ListNode right = sortList(slow);
        
        return merge(left,right);
        
    }
    
    public ListNode merge(ListNode l1, ListNode l2)
    {
        
        ListNode temp = new ListNode();
        ListNode dummy = temp ;
        
        if(l1==null)  return l2 ;
        if(l2==null)  return l1 ;
        
        while(l1!=null && l2!=null)
        {
            if(l1.val < l2.val)
            {
                    dummy.next=l1;
                    l1=l1.next ;
            }
            else
            {
                
                dummy.next = l2 ;
                l2=l2.next ;
            }
            dummy = dummy.next ;
            
        }
        
        
        if(l1==null) dummy.next=l2;
        if(l2==null) dummy.next=l1;
        
        return temp.next;
    }
}


/*   Notes 

   sort list using merge sort 
   
   1. Find Middle Node  -> We Can Use fast And Slow 
   
   2. Then Sort Left And Right Lists Using Merge Sort 
   
   3. Merge  Left And Right Part 
   



reference :

https://leetcode.com/problems/sort-list/discuss/1795832/Java-or-Cleanest-code-or-Easy-to-understand-or-O(1)-Space-and-O(nlogn)-Solution



*/