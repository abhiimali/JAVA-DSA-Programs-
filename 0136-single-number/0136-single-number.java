class Solution {
    public int singleNumber(int[] nums) {
        
        
        HashMap<Integer,Integer> map  = new HashMap<>();
        
        
        for(int i =0 ; i < nums.length ; i++)
        {
//             if(!map.containsKey(nums[i]))
//             {
//                 map.put(nums[i],1);
//             }
//             else
//             {
                
//                 map.put(nums[i],map.get(nums[i]) +1 );
//             }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1 );
        }
                                             
        
       for (int x : map.keySet())
{
// search for value
if(map.get(x) == 1){
return x;
}
}
return 0;
    }
}