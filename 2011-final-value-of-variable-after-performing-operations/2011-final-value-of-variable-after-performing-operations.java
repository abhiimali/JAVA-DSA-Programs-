class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int e = 0 ;
        
        for(String s : operations)
        {
            // if (s.contains("++"))
            // {
            //     e = e + 1 ;
            // }
            // else
            // {
            //     e = e - 1; 
            // }
            
            // aproch  2 : 
            
            e += s.charAt(1) == '+' ? 1 : -1;
        }
        
        
        return e ;
    }
}