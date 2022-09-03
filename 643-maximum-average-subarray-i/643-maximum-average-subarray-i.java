class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int windowStart = 0 ;
        
        double  sum = 0 , max = Double.NEGATIVE_INFINITY ;
        
        for ( int windowEnd = 0 ; windowEnd < nums.length ; windowEnd ++ )
        {
            sum = sum + nums[windowEnd];
            
            
            if((windowEnd-windowStart+1)==k)
            {
                
                max = Math.max(sum,max);
                
                sum = sum - nums[windowStart] ;
                windowStart ++ ;
                
                
            }
            
            
            
        }
        
        return max / k ;
    }
}