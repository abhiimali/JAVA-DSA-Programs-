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
    
    boolean ans = true ;
    public boolean isBalanced(TreeNode root) {
        
        if(root==null) return ans ;
        
        avl(root,0);
        return ans ;
    
    }  
     
    public int  avl(TreeNode root , int depth ) 
    {
         if(root == null) return depth; 
        
        int left =  avl(root.left, depth + 1);
        int right = avl(root.right , depth + 1 );
        
         if(Math.abs(left-right) > 1 ) ans = false ;
        
        return Math.max(left, right);
        
        
    }
}
