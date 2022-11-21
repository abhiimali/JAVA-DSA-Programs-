class Solution {
    public int getMaximumGenerated(int n) {
     
        
        if(n==0) return 0 ;
            int[] nums = new int[n+1];
        nums[0]=0;
        nums[1] = 1 ;
       int size = nums.length ;
        
        for(int i=1 ; i < size / 2 ; i++)
        {
            nums[2*i] = nums[i];
            nums[2*i+1]=nums[i] + nums[i+1];
        }
        
       Arrays.sort(nums);
        return nums[size-1];
        
    }
}