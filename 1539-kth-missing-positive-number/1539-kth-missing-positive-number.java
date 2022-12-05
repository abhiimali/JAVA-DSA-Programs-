class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int a :arr)
        {
            set.add(a);
        }
        int i =1 ;
        for( i=1; i<1001 ; i++)
        {
            if(!set.contains(i))
            {
                k-- ;
                
                if(k==0)
                {
                    return i ;
                }
            }
        }
        // while(k>0)
        // {
        //     i++;
        //     k--;
        // }
        return i + k -1 ;
        
    }
}