class Solution {
    public boolean containsDuplicate(int[] nums) {
         Arrays.sort(nums); // sort array 
        for ( int i=1; i < nums.length ; i++)
        {
            if (nums[i]==nums[i-1])
            {
                return  true;
            }
            // return none 
        }

         return false ;
     
    
    }
}