class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        // int count = 0;
        
        
        for(int i=0; i < nums.length ; i++) {
            if(nums[i] % 2 == 1 )
            {
                nums[i]=1;
                
            }
            else
                
            {
                nums[i]=0;
            } 
            
        }
        int ans = 0 ;
      int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int index=0 ; index < nums.length ; index++)
        {
            sum= sum + nums[index];
            if(map.containsKey(sum-k))
            {
                ans = ans + map.get(sum-k);
            }
            
            map.put(sum,map.getOrDefault(sum,0)+1);
            
            
            
            
        }
        
        return ans ;
        
       
    }
}