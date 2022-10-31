class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        
        // here we are going to use prefix Sum technique 
        
        
        int n = nums.length ;
        
        Arrays.sort(nums);
       // int[] prefsum = new prefsum[n];
        
        for(int i=1; i < n ; i++)
        {
            
           nums[i]= nums[i] + nums[i-1] ;
            
         }
        
        int index = 0; 
     int count=0;
        int ans[] = new int[queries.length] ;
        for( int j =0 ; j < queries.length ; j++)
        {
            
            for(int i =0 ; i < n ; i++)
            {
                //count = 0 ;
                if(nums[i] <= queries[j] )
                {
                    ans[j] += 1 ;
                }
                
                //ans[j]=count ;
            }
            
            
        }
        
        return ans ; 
    }
}