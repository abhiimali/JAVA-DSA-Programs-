class Solution {
    public int[] replaceElements(int[] arr) {
    
        if(arr.length==1) return new int[] {-1} ;
        int n  =arr.length ;
        int[] ans = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            int maxV = Integer.MIN_VALUE ;
            int curr = arr[i];
            for(int j=i+1  ; j < n ; j++ )
            {
                maxV = Math.max(maxV,arr[j]);
                ans[i] = maxV ;
                
    
            }
            
        }
        ans[n-1] = -1;
            return ans ; 
    }
}