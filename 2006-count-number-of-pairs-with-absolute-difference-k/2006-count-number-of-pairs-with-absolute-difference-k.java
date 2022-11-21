class Solution {
    public int countKDifference(int[] nums, int k) {
     
        
        int ans = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        // map.put(0,-1);
        for(int num : nums)
        {
            if(map.containsKey(num + k))
            {
                  ans = ans + map.get(num + k ) ;
                 // map.put(num,map.getOrDefault(num,0)+1);
                
            }
             if(map.containsKey(num - k))
            {
                 ans = ans + map.get(num - k  ) ;

            }
            
            map.put(num,map.getOrDefault(num,0)+1);

        }
        
        return ans ; 
        
    }
}