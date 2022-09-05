class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int[] prefixSum = new int[arr.length + 1 ];
        
        int sum = 0 ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            prefixSum[i+1] = prefixSum[i] + arr[i] ;
            
        }
            
            for (int i = 0 ; i < arr.length ; i++)
            {
                
                for( int j=i ; j < arr.length ; j++)
                {
                    if((j-i+1)%2==1)
                    {
                        sum += prefixSum[j+1]  - prefixSum[i] ;
                        
                    }
                    
                    
                    
                }
            }
     
        return sum ;
    }
}