class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        int ans = 0 ;
        int[] dp = new int[nums.length];
        
        for(int i=2 ; i < nums.length  ; i++)
        {
            if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2])
            {
                dp[i] = dp[i-1] + 1 ;
                
                ans += dp[i];
                
            }
            
        }
        
        return ans ;
        
        
    }
}


/*  Explanation :)  


pepcoding 

      
      create new array  empty one 
      
      if subarray found add it to the array position 
      
     these lines are basically for to check subarray at current postion
     
     1  3  5  7 
     
     if i is at 7 
     then check 7-5 ==  5-3  as showns follow
     
     if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2])
            {
                dp[i] = dp[i-1] + 1 ;
                
                ans += dp[i];
                
            }
      
      if it is then add it to array with including prev array i-1 count 
      
      update ans 
      
      
      
      
     
     
     */






