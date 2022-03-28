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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> list = new ArrayList<>();
		    if(root==null){
		        return list;
		    }
		    
		    Queue<TreeNode> queue = new LinkedList<TreeNode>();
		    queue.add(root);
		    
		    while(!queue.isEmpty()){
		        int size = queue.size();
		        List<Integer> li = new ArrayList<>();
		        
		        while(size!=0){
		        	TreeNode curr = queue.poll();
					li.add(curr.val);
					if(curr.left != null) {
						queue.add(curr.left);
					}
					if(curr.right != null) {
						queue.add(curr.right);
					}
		            size--;
		        }
		        list.add(li);
		    }
		    return list;
        
    }
}