class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
     
        int count = 0 ;
        for(int i=0; i < flowerbed.length ; i++)
        {
            if(canPlace(flowerbed,i))
            {      
                  
                
                     count++ ;
                     flowerbed[i]=1 ;
                 
            }
        }
        // int ans = count / n ;
         return  count>=n ;
        
        
    }
    
    private boolean canPlace(int[] flowered, int i){
        int prev = i == 0 ? i : i - 1; // handling left boundary
        int next = i == flowered.length - 1 ? i : i + 1; // handling right boundary
        return flowered[i] == 0 && flowered[prev] == 0 && flowered[next] == 0;
    }
}