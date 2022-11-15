class Solution {
    public int countNodes(TreeNode root) {
        return getNodes(root);
    }
    private int getNodes(TreeNode root){
        if(root == null){
            return 0;
        }
        int x=0,y=0;
        if(root.left != null){
            x = getNodes(root.left);
        }
        if(root.right != null){
            y= getNodes(root.right);
        }
        return x+y+1;
    }
}