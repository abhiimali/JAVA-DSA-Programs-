class Solution {
    public int divisorSubstrings(int num, int k) {
        
        String numStr = String.valueOf(num);
        
        
        int count = 0;
       //  System.out.println(numStr);
        for ( int i=0; i <= numStr.length() - k ; i++)
        {
                String substr = numStr.substring(i,i+k);
                
                if( Integer.parseInt(substr) != 0 &&   num  % Integer.parseInt(substr) == 0 )
                {
                    count++;
                }
            
            
        }
        
        
        return count ; 
        
    }
}