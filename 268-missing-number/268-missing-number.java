class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
       // int ans = nums.length;
        for (int i=0 ; i < nums.length ; i++)
        {
            if(i!=nums[i])
            {
                return i ; 
            }
            
            
        }
     
        return nums.length ;
    }
}