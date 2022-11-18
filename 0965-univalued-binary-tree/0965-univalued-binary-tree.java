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
    public boolean isUnivalTree(TreeNode root) {
        int n = root.val;
        
       return travers(root,n);
        
    }
    static boolean travers(TreeNode root, int n)
    {   
        if(root==null) { return true ; }
        if(root.val != n)
        {
            return  false ;
        }       
    
        return travers(root.left ,n) && travers(root.right , n);
              
    }
    
    
}