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
    public int minimumOperations(TreeNode root) {
        
           List<List<Integer>> list = new ArrayList<>();
        int ans = 0 ;
		    // if(root==null){
		    //     return list;
		    // }
		    
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
		        ans += minSwaps(li);
		    }
        return ans ; 
    }
    
    int minSwaps(List<Integer> list) {
        int n = list.size();
        Map<Integer, Integer> map = new HashMap();
        for(int i = 0; i < n; i++) map.put(list.get(i), i);
        Collections.sort(list);
        int ans = 0;
        boolean vis[] = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(vis[i] || map.get(list.get(i)) == i) continue;
            int j = i, sz = 0;
            while(!vis[j]) {
                vis[j] = true;
                j = map.get(list.get(j));
                sz++;
            }
            if(sz > 0) ans += sz-1;
        }
        return ans;
    }
}