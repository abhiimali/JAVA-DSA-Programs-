class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int[] pre=new int[nums.length+1];
        
        pre[0]=nums[0];
        
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        int prev=0;
        int[] ans=new int[n];
        int end=pre[n-1];
        for(int i=0;i<n;i++){
            if(i>0) {
                ans[i]=Math.abs(pre[i-1]-(nums[i]*i));
            }
           
            ans[i]+=Math.abs((end-pre[i])-(nums[i]*(nums.length-i-1)));
            
        }
        return ans;
    }
}