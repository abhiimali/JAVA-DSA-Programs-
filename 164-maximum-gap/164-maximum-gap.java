class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        
        int  maxdiff = 0 ;
        
        for(int i=1;i<nums.length;i++)
        {
          int  diff = nums[i] - nums[i-1];
            
            maxdiff = Math.max(diff,maxdiff);
            
            
        }
        
        return maxdiff;
    }
}

/* 

   3      6   9      1 
   
   pt1     pt2 
   
   Diff = pt2 - pt1 ;
   
   Then Maximum Of It Is The Differnce
   
   
   
   
   */