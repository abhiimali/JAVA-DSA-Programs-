class Solution {
    public int maxFrequency(int[] nums, int k) {
        
//         Arrays.sort(nums) ;
        
//         int left=0 ;
//         int right = 0 ;
//         int result = 0 ;
//         int totalSum = 0 ;
        
        
//         while( right < nums.length )
//         {
            
//             totalSum += nums[right] ;
            
// //              num[r] * windoe Lenght > Total + Budget K So Out of Budget ..Shrink 
//             while( (long) nums[right] * (right-left+1) > totalSum + k)
//             {
//                 totalSum -= nums[left];
//                 left++;
                
                
//             }
            
           
            
//             result = Math.max(result , right-left+1);
//              right++;
            
            
//         } 
//         return result ;
        
        
         Arrays.sort(nums);
        int l = 0, r = 0, res = 0;
        long total = 0;

        while (r < nums.length) {
            total += nums[r];

            while ((long) nums[r] * (r - l + 1) > total + k) {
                total -= nums[l];
                l++;
            }

            res = Math.max(res, r - l + 1);
            r++;
        }

        return res;
    
        
    }
}