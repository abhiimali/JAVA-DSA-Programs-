class Solution {
    public int arrayPairSum(int[] nums) {
        
        
        Arrays.sort(nums);
        
        int sum=0;
        for(int i=0;i< nums.length ; i=i+2)
            
        {
            // 1234
            // 122566
            
            
            sum+=Math.min(nums[i],nums[i+1]);
            
            
            
            
        }
        return sum ;
    }
}