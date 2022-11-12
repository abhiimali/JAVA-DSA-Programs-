class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int maximum  =0 ;
        
        for(String s : sentences)
        {
             // Appr 1  : 
            
            // String[] str = s.split(" ");
            
           // maximum =  Math.max(maximum,str.length); 
            
            // approch  2 : 
            
            if(s.split(" ").length>maximum)maximum=s.split(" ").length;
            
        }
        
        return maximum ;
    }
}