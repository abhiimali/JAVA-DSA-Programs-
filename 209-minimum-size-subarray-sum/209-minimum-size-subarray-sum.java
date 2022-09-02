class Solution {
    
//      Available in NoteBook  
    
    public int minSubArrayLen(int target, int[] nums) {
     
        
//         int i=0;
//         int sum=0;
//         int j=0;
//         int minimum = Integer.MAX_VALUE ;
//         int size = nums.length ;
        
//         while( j < size )
//         {
//               sum = sum + nums[j];
            
//              if(sum < target)
//              {
//                  j++ ;
//              }
//              else
//              {
//                  minimum = Math.min(minimum,(j-i+1));
//                  sum = sum - nums[i];
//                  i++;
//                  j++;
                 
//              }
            
            
//         } 
//         return minimum ;
        
        
//            New COde :) 
        
        
        
        int i=0;
        int j = 0 ;
        int sum = 0;
        int minimum = Integer.MAX_VALUE ; 
        
        while ( j < nums.length)
        {
            sum = sum + nums[j];
            j++;
            
            while(sum >= target)
            {
                minimum = Math.min(minimum, j-i);
                sum = sum - nums[i] ;
                i++;
                
            }
            
    
        }
        
        
        return minimum==Integer.MAX_VALUE ? 0 : minimum ;
       
        
        
//          
        
        
        
        
        
        
        
    }
}