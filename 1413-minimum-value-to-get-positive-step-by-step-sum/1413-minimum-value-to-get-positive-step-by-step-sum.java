class Solution {
    public int minStartValue(int[] nums) {
        
        int minValue = 0 ;
        
        int prefixSum=0 ;
        
        int n = nums.length ;
        for(int i=0 ; i < n ; i++)
        {
            
            prefixSum = prefixSum + nums[i];
            minValue = Math.min(minValue,prefixSum) ;
            
            
        }
        if(minValue < 0  )
        {
            int a = Math.abs(minValue);
            return a+1;
        }
        
        return 1 ;
        
        
    }
}