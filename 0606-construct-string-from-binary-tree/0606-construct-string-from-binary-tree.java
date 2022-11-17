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
    public String tree2str(TreeNode root) {
        
        StringBuilder str = new StringBuilder();
        
        dfs(root,str);
        
        
        return new String(str);
        
        
    }
    
    public void dfs(TreeNode root , StringBuilder str)
    {
        if(root==null)
        {
            return  ;
        }
        
         str.append(root.val);
        if(root.left == null && root.right == null)
        {
            return ;
        }
        
        str.append("(");
        dfs(root.left,str);
        str.append(")");
        
        if(root.right != null)
        {
            str.append("(");
            
            dfs(root.right , str);
            
            str.append(")");
        }
        
    }
}