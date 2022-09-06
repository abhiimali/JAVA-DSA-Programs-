class Solution {
    public int[] decrypt(int[] code, int k) {
     
        int[] res = new int[code.length];
        int n = code.length ;
        if(k == 0 ) return res ;
        for(int i=0 ; i < code.length ; i++)
        {
            if(k>0)
            {
                for(int j=i+1;j<=i+k;j++)
                {
                    res[i] += code[j % n];
                }
                
                
            }
            
            else
            {
                for(int j=i+k ; j <= i - 1 ; j++ )
                {
                    res[i] += code[(j+n) % n] ;
                    
                }
                
                
            }
            
            
            
            
            
        }
         
        return res ;
        
    }
}