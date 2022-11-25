class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int n = candies.length ;
        boolean[] bl = new boolean[n];
        List<Boolean> bk = new ArrayList<>();
        int maxi = 0 ;
        for(int j= 0 ; j < n ; j++)
        {
          maxi =   Math.max(maxi,candies[j]);
        }
        
        for(int i=0 ; i < n ; i++)
        {
            if(candies[i]+extraCandies >= maxi)
            {
              //   bl[i] = true ;
                bk.add(true);
            }
            else
            {
                bk.add(false);
            }
            
        }
        
        return bk ; 
    }
}