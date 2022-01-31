class Solution {
    public int findFinalValue(int[] arr, int original) {
        
        int ans=0;
        
        Arrays.sort(arr);
       
        
        for ( int index = 0 ;  index < arr.length ; index ++)
        {
           int  element =  arr[index];
            if (element == original)
            {
               
                  original = 2 * original  ;
            
                
            }
            

        }
        
     
        return  original;
        
    }
}