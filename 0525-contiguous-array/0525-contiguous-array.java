class Solution {
    public int findMaxLength(int[] nums) {
     
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int sum=0;
        int  n = nums.length ;
        int maxCount =0;
        map.put(0,-1);
        for(int i=0; i < n ; i++)
        {   
            if(nums[i]==0)
            {
                sum = sum + -1 ;
                //map.put(sum , i);
                
            }
            else
            {
                sum = sum + 1 ;
               // map.put(sum,i);
            }
            if(map.containsKey(sum))
            {
                maxCount = Math.max(maxCount,i- map.get(sum)  );
            }else
            {
                map.put(sum,i);
            }
            
            
        }
        return maxCount ;
        
    }
}