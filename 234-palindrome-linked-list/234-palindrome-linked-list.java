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
    public boolean isPalindrome(ListNode head) {
       
        if(head==null)
        {
            return true ;
        }
            
        
        ListNode mid = middle(head);
        ListNode last = reverse(mid);
        
        ListNode curr = head ;
        
         while(last != null)
         {
             
             if(curr.val != last.val)
             {
                 return false ;
             }
             curr = curr.next ;
             last = last.next ; 
         }
        
        return true ;
        
    }
    
    public ListNode middle(ListNode head)
    {
        
        
        
        ListNode slow = head ;
        ListNode fast = head ;
        
        
        while(fast != null && fast.next != null)
        {
            
            slow = slow.next ;
            fast = fast.next.next ;
            
            
        }
        
        return slow ;
        
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null)
        {
            return head ;
        }
        ListNode prev = null ;
        ListNode pres = head ;
        ListNode next = pres.next ; 
        
        while(pres != null)
        {
            
            pres.next=prev ;
            prev=pres ;
            pres = next ;
            if(next != null)
            {
                next = next.next ;      
            }
            
           
        }
        
        return  prev ; 
        
        
    }
}

// Anuj Bhaiiya Logic  

// Find Mid  -> Then Reverse From Mid To Last  

// Compare  ->  mg zala 