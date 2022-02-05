class Solution {
    public int findMin(int[] nums) {
        
     int left = 0;
     int right = nums.length-1;
        
     while(left<right)
     {
         
         int mid = left+(right-left)/2 ;
         
         if(nums[mid] < nums[right] )
         {
             right = mid ;
         }
         else
         {
             left = mid+1;
         }
         
         
         
     }
        
        return nums[left];
        
        
    }
}


// https://zhenchaogan.gitbook.io/leetcode-solution/leetcode-153-find-minimum-in-rotated-sorted-array




// My Solution Old One 

//  public int findMin(int[] nums) {
//         Arrays.sort(nums);
//         return nums[0];
//     }