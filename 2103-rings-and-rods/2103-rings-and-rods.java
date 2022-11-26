class Solution {
    public int countPoints(String s) {
     
    
    int[] r =new int[10];
        
    int[] g =new int[10];
        
    int[] b =new int[10];
        int n = s.length(); 
        for(int i=0 ; i < n ;  i+=2)
        {
            int ch = s.charAt(i+1)-'0';
            
            if(s.charAt(i)=='B')
            {
                b[ch]++ ;
            }
            if(s.charAt(i)=='G')
            {
                g[ch]++;
            }
             if(s.charAt(i)=='R')
            {
                r[ch]++ ;
            }
            
        }
        int count = 0 ;
        for(int j = 0 ; j < 10 ; j++)
        {
            if(r[j] != 0 && g[j] != 0 && b[j] != 0)
            {
                count++ ;
            }
            
        }
        return count ;
    }
}