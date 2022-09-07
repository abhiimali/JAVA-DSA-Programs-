class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        
        int n = nums.length ;
        
        int[] prefixSumArr = new int[n+1];
        prefixSumArr[0]=0;
        for(int index=1; index <= n ; index++)
        {
            
             prefixSumArr[index]= prefixSumArr[index-1] + nums[index-1];
             
            
         }
        
        
        for(int i=0; i <= n  ; i++)
        {
            
            for(int j = i+1 ; j<= n ; j++)
            {
                if(prefixSumArr[j]-prefixSumArr[i]==k)
                {
                    count++;
                }
                
                
                
            }
        }
        
        
        return count;
        
        
        
        
        
        
        
    }
}