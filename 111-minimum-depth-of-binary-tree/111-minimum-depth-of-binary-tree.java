/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        
        if(root==null) return 0 ;
        
        if(root.left == null) 
           return  minDepth(root.right) + 1 ;

        if(root.right == null)
            return minDepth(root.left) + 1 ;
        
        return Math.min(minDepth(root.left) , minDepth(root.right)) + 1 ;
        

        
    }
}








/* 

if(root==null)
        return 0;
    if(root.left==null)                 //To deal with skewed trees, as the minDepth for complete skewed tree would be 'n', not 0
        return minDepth(root.right)+1;              
    if(root.right==null)
        return minDepth(root.left)+1;
    return Math.min(minDepth(root.left),minDepth(root.right))+1;
    
    


*/