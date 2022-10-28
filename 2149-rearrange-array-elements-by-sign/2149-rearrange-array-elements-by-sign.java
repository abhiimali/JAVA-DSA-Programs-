class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n = nums.length ;
        int[] p = new int[n];
        
        int[] m = new int[n];
        //count
        int indexP = 0;
        
        int indexN = 1 ;
        int[] ans = new int[n];
        for(int i=0; i < n ; i++)
        {
            if(nums[i] > 0)
            {
                ans[indexP]=nums[i];
                indexP += 2 ;
            }
            else
            {
                ans[indexN]=nums[i];
                indexN += 2 ;
            }
            
        }
    
            return ans ;
    }
}