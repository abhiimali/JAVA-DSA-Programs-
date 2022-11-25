class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
     
        int[][] arr = new int[m][n];
        int ind = 0 ;
        
        if( m * n == original.length ) 
        {
            for(int i=0 ; i < m ; i++)
                {
              for(int j=0; j < n ; j++)
                {
                arr[i][j] = original[ind++];
               // ind++;
                }
                 }
            
             return  arr ;
    
            
        }
        else
        {
            return new int[][]{};
        }
        
    }
}