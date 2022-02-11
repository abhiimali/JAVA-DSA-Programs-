class Solution {
    public int pivotIndex(int[] arr) {
        {
        // code here
            
        int n = arr.length ;
        int leftSum = 0 ;
        
        
        int totalSum = 0 ;
        for(int i = 0 ; i < n  ; i++)
        {
             totalSum+=arr[i];
             
        }
        
        for(int i=0;i<n;i++)
        {
            
            int rightSum = totalSum - leftSum - arr[i];
            
            
            
            if(leftSum == rightSum)
            {
               
                 return i ;
            }
            
             leftSum += arr[i] ;
            
        }
            
        return -1 ;
            
            
        }
    }
    
}
