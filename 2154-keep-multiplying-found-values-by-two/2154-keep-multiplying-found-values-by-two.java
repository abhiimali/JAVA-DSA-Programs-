class Solution {
    public int findFinalValue(int[] arr, int original) {
        
        int ans=0;
        
        Arrays.sort(arr);
       
        
        for ( int index = 0 ;  index < arr.length ; index ++)
        {
           //int  element =  ;
            if (arr[index] == original)
            {
               
                  original = 2 * original  ;
            
                
            }
            

        }
        
     
        return  original;
        
    }
}