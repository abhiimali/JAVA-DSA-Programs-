class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        
        int result =0;
        int start=0 ;
        int tempSum = 0 ;
        for(int end = 0 ; end < n ; end++ )
        {    tempSum += nums[end];
            while(set.contains(nums[end]))
            {    
                 set.remove(nums[start]);
                tempSum -= nums[start];
                 start++ ;
                
            }
         
            set.add(nums[end]);
            result = Math.max(tempSum,result);
            
        }
        
        return result ;
    }
}