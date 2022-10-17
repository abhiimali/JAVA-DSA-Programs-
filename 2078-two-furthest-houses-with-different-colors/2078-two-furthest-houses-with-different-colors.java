class Solution {
    public int maxDistance(int[] colors) {
      
        int n = colors.length ;
        int  maxV = Integer.MIN_VALUE;
        for(int i=0; i< n ;i++)
        {     
            for(int j = n -1 ; j>=0 ; j--)
            {
                
                if(colors[i] != colors[j])
                {
                     maxV = Math.max(maxV,Math.abs(j-i));
                }
            }
        }
        
        return maxV;
    }
}