l.add(root.val);
list.add(l);
}
else
{
printCurrent(root.left , level-1 , list);
printCurrent(root.right, level-1 , list );
​
}
}
public int maxDepth(TreeNode root) {
if(root == null)
{
return 0 ;
}
int left = maxDepth(root.left);
int right = maxDepth(root.right);
int ans = Math.max(left,right) + 1 ;
return ans ;
}
}
```