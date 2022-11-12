class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int e = 0 ;
        
        for(String s : operations)
        {
            if (s.contains("++"))
            {
                e = e + 1 ;
            }
            else
            {
                e = e - 1; 
            }
        }
        
        
        return e ;
    }
}