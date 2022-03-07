/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */


// copy the next node data to given node data and the address pointed by next node to the current node


class Solution {
    public void deleteNode(ListNode node) {
        
       if(node != null)
       {
           
           node.val = node.next.val ;
           node.next = node.next.next ;
       }
//         else
//         {
//             node = null ;
//         }
        
    }
}