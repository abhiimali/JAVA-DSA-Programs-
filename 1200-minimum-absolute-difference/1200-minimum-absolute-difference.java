class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(arr);
        
        int minDiff = Integer.MAX_VALUE  ;
        
        for(int i=1 ; i < arr.length ; i++)
        {
            if(arr[i]-arr[i-1] < minDiff )
            {
                minDiff = arr[i]-arr[i-1];
            }
            
        }
        
        
        for(int i=0; i < arr.length - 1  ; i++)
        {
            
            if(arr[i+1]-arr[i]==minDiff)
            {
                ArrayList<Integer> res = new ArrayList<>();
                res.add(arr[i]);
                res.add(arr[i+1]);
                ans.add(res);
            }
            
        }
        
        return ans ; 
        
        
    }
}