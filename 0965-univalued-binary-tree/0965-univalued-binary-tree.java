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
        
       return preOder(root,n);
        
    }
    static boolean preOder(TreeNode root, int n)
    {   
        if(root==null) { return true ; }
        if(root.val != n)
        {
            return  false ;
        }
//         if(root.left == null && root.right==null)
//         {
//             return true ;
//         }
        
        return preOder(root.left ,n) && preOder(root.right , n);
        
        
    }
    
    
}