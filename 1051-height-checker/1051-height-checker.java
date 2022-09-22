class Solution {
    public int heightChecker(int[] heights) {
     
        
        int[] temp = new int[heights.length] ;
        
        for(int i=0 ; i< heights.length ; i++)
        {
            temp[i] = heights[i];
        }
        
        Arrays.sort(temp);
       // ArrayList<Integer> ans = new ArrayList<>();
        int count =0;
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(heights));
        for(int i=0 ; i < temp.length ; i++)
            
        {
            if(temp[i] != heights[i])
            {
                count ++ ;
            }
            
            
            
        }
        
        return count ;
        
    }
}