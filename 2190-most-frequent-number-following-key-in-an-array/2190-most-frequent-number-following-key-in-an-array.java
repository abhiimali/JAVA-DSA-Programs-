class Solution {
    public int mostFrequent(int[] nums, int key) {
       
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length ;
        int max= 0;
        int result=0;
        
        for(int i=0 ; i < n - 1 ; i++)
        {
            if(nums[i]==key)
                
            {
                map.put(nums[i+1],map.getOrDefault(nums[i+1],0)+1);
                
               if (max < map.get(nums[i + 1])) {
                  //max = Math.max(max, map.get(nums[i + 1]));
                   max= map.get(nums[i+1]);
                  result = nums[i + 1];
                }
            }
            
        }
        return result ;
    }
}