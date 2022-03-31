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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> result = new ArrayList<String>();
        
        if(root != null)
        {
            
            pathBST(root ,"" ,result);
        }
        
        return result ;
        
        
    }
    
    public void pathBST(TreeNode root, String path , List<String> result )
    {
        if(root.left == null && root.right == null)        
        {
            result.add(path + root.val);
            
        }
        
        if(root.left != null)
        {
            
            pathBST(root.left , path + root.val + "->", result );
        }
        
        if(root.right != null) 
        {
            pathBST(root.right , path  + root.val + "->", result );
            
        }

    }
}

/*

   go to each node see if the left is null or not 
   
   if both  null  add to list n return 
   
   if one is not null go to same dir to find more 
   
   


*/