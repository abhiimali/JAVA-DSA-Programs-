class Solution {
    public int dominantIndex(int[] nums) {
     
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0 ;i < nums.length ; i++)
        {
            map.put(nums[i],i);
        }
        
        Arrays.sort(nums);
        int n=nums.length ;
        
        for(int i=n-1 ; i>0 ; i-- )
        {
          //  System.out.println(nums[i]);
            if(nums[i] >= nums[i-1] * 2)
            {
                return map.get(nums[i]);
            }
            else
            {
                return -1;
            }
            
        }
        
        return -1 ;
    
        
        
    }
}